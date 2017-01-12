package com.event.bus;

import com.event.bus.core.Consumer;
import com.event.bus.core.Listener;

/**
 * Project: EventBus
 * Module Desc:com.event.bus
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 17:29
 */
@Consumer
public class EventConsumer {

    @Listener(topic = {"event","bus"},group = "demo")
    public void consume1(MessageEvent event) {
        System.out.println("consume1 topic:"+event.getTopic()+"<>content:"+event.getContent());
    }

    @Listener(topic = {"event","bus"},group = "demo")
    public void consume2(MessageEvent event) {
        System.out.println("consume2 topic:"+event.getTopic()+"<>content:"+event.getContent());
    }

    @Listener(topic = {"event","bus"},group = "test")
    public void consume3(MessageEvent event) {
        System.out.println("consume3 topic:"+event.getTopic()+"<>content:"+event.getContent());
    }
}
