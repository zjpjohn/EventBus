package com.event.bus.core;

import java.lang.annotation.*;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:27
 * 事件订阅者方法监听
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Listener {

    /**
     * 监听事件主题
     *
     * @return
     */
    String[] topic() default {};

    /**
     * 监听事件所属分组
     *
     * @return
     */
    String group() default "";
}
