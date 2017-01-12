package com.event.bus.spring;

import com.event.bus.core.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.spring
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:37
 */
@Configuration
public class EvenBusConfiguration {

    @Bean
    public EventBus eventBus() {
        return new EventBus();
    }

    @Bean
    public EventBusBeanPostProcessor eventBusBeanPostProcessor(){
        return new EventBusBeanPostProcessor(eventBus());
    }
}
