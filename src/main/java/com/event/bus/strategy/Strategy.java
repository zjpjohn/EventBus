package com.event.bus.strategy;

import com.event.bus.core.EventConsumer;
import com.event.bus.core.GroupConsumer;

import java.util.List;
import java.util.Map;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.strategy
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 18:13
 * 消费者选取策略
 */
public interface Strategy {

    /**
     * 选择合适的事件订阅者
     *
     * @param groupConsumer 事件订阅者集合
     * @return 事件订阅者
     */
    EventConsumer select(GroupConsumer groupConsumer);
}
