package com.event.bus.core;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 18:06
 */
public interface Event {

    /**
     * 事件所属主题
     *
     * @return
     */
    String getTopic();
    
    /**
     * 事件内容
     *
     * @return
     */
    Object getContent();
}
