package com.event.bus;

import com.event.bus.core.Event;
import com.event.bus.spring.EventBusBeanPostProcessor;
import com.sun.org.apache.bcel.internal.generic.StackInstruction;

/**
 * Project: EventBus
 * Module Desc:com.event.bus
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 17:31
 */
public class MessageEvent implements Event {

    private String topic;

    private String content;

    public MessageEvent() {
    }

    public MessageEvent(String topic, String content) {
        this.topic = topic;
        this.content = content;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 事件所属主题
     *
     * @return
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 事件内容
     *
     * @return
     */
    public Object getContent() {
        return content;
    }
}
