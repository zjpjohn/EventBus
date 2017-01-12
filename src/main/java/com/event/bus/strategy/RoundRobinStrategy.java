package com.event.bus.strategy;

import com.event.bus.core.EventConsumer;
import com.event.bus.core.GroupConsumer;
import com.google.common.collect.Maps;

import java.util.Map;


/**
 * Project: EventBus
 * Module Desc:com.event.bus.strategy
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 18:14
 * RoundRobin 策略
 */
public class RoundRobinStrategy implements Strategy {

    private Map<String, Integer> numberMap;

    /**
     * 选择合适的事件订阅者
     *
     * @param groupConsumer 事件订阅者集合
     * @return 事件订阅者
     */
    public EventConsumer select(GroupConsumer groupConsumer) {
        Integer number = next(groupConsumer);
        return groupConsumer.getEventConsumers().get(number);
    }

    /**
     * 轮询获取订阅者
     *
     * @param groupConsumer 订阅者集合
     * @return
     */
    public Integer next(GroupConsumer groupConsumer) {
        if (numberMap == null) {
            numberMap = Maps.newConcurrentMap();
        }
        Integer number = numberMap.get(groupConsumer.getGroup());
        if (number == null) {
            number = -1;
        }
        number = ((number + 1) % groupConsumer.getEventConsumers().size());
        return number;
    }
}
