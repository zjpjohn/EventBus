package com.event.bus.spring;

import com.event.bus.core.Consumer;
import com.event.bus.core.EventBus;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.spring
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:26
 */
public class EventBusBeanPostProcessor implements BeanPostProcessor {

    private Object primitiveObject;

    private EventBus eventBus;

    public EventBusBeanPostProcessor(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        this.primitiveObject = bean;
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Consumer annotation = bean.getClass().getAnnotation(Consumer.class);
        if (annotation != null) {
            if (AopUtils.isAopProxy(bean)) {
                register(primitiveObject);
            } else {
                register(bean);
            }
        }
        return bean;
    }

    /**
     * 注册事件订阅者
     *
     * @param consumer 事件订阅者
     */
    private void register(Object consumer) {
        eventBus.register(consumer);
    }
}
