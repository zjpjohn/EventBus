package com.event.bus;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: EventBus
 * Module Desc:com.event.bus
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 17:40
 */
public class EventBusTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EventProducer bean = context.getBean(EventProducer.class);
        MessageEvent event = new MessageEvent();
        event.setTopic("bus");
        event.setContent("自己实现的EventBus成功了");
        bean.send(event);

    }
}
