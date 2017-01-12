package com.event.bus.spring;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.spring
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:36
 * spring开启事件总线注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(EvenBusConfiguration.class)
public @interface EnableEventBus {
}
