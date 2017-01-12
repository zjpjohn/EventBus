package com.event.bus;

import com.event.bus.core.EventBus;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Project: EventBus
 * Module Desc:com.event.bus
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 17:39
 */
@Component
public class EventProducer {
    @Resource
    private EventBus eventBus;

    public void send(MessageEvent event){
        eventBus.post(event);
    }
}
