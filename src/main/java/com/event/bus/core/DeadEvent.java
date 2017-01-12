package com.event.bus.core;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:40
 */
public class DeadEvent {

    private Object source;
    private Event event;

    public DeadEvent() {
    }

    public DeadEvent(Object source, Event event) {
        this.source = source;
        this.event = event;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
