package com.event.bus.core;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 17:50
 */
public interface SubscriberExceptionHandler {

    /**
     * 事件订阅者异常处理器
     *
     * @param ex      异常
     * @param context 事件订阅处理上下文
     */
    void handleException(Exception ex, SubscriberExceptionContext context);
}
