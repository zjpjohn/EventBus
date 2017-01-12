package com.event.bus.core;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:27
 * 标记事件订阅者
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface Consumer {
}
