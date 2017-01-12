package com.event.bus.core;

import java.lang.reflect.Method;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:51
 */
public class SubscriberExceptionContext {

    private EventBus bus;
    private Object consumer;
    private Method invoke;
    private Event event;

    public SubscriberExceptionContext(EventBus bus, Object consumer, Method invoke, Event event) {
        this.bus = bus;
        this.consumer = consumer;
        this.invoke = invoke;
        this.event = event;
    }

    public EventBus getBus() {
        return bus;
    }

    public Object getConsumer() {
        return consumer;
    }

    public Method getInvoke() {
        return invoke;
    }

    public Event getEvent() {
        return event;
    }
}
