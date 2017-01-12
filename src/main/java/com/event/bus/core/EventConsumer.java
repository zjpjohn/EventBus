package com.event.bus.core;

import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:39
 */
public class EventConsumer {

    //事件总线
    private EventBus bus;
    //事件订阅者
    private Object consumer;
    //事件执行的方法
    private Method method;
    //执行线程池
    private Executor executor;

    /**
     * 创建事件消费者
     *
     * @param bus      事件总线
     * @param consumer 消费者对象
     * @param method   事件方法
     * @return
     */
    public static EventConsumer create(EventBus bus, Object consumer, Method method) {
        return new EventConsumer(bus, consumer, method);
    }

    /**
     * 事件订阅者
     *
     * @param bus      事件总线
     * @param consumer 事件订阅者对象
     * @param method   事件处理方法
     */
    public EventConsumer(EventBus bus, Object consumer, Method method) {
        this.bus = bus;
        this.consumer = Preconditions.checkNotNull(consumer);
        method.setAccessible(true);
        this.method = method;
        this.executor = bus.getExecutor();
    }

    /**
     * 事件处理
     *
     * @param event 事件
     */
    public void consume(final Event event) {
        executor.execute(new Runnable() {
            public void run() {
                try {
                    invokeConsumeMethod(event);
                } catch (Exception e) {
                    bus.getExceptionHandler().handleException(e, context(event));
                }
            }
        });
    }

    /**
     * 反射调用
     *
     * @param event 事件
     */
    public void invokeConsumeMethod(Event event) throws Exception {
        method.invoke(consumer, Preconditions.checkNotNull(event));
    }

    /**
     * 创建事件处理异常上下文
     *
     * @param event 事件
     * @return
     */
    private SubscriberExceptionContext context(Event event) {
        return new SubscriberExceptionContext(bus, consumer, method, event);
    }
}
