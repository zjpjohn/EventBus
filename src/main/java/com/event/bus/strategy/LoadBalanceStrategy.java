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
 * Time: 18:15
 * LoadBalance策略
 */
public class LoadBalanceStrategy implements Strategy {
    //未使用的订阅者
    private Map<String, List<Integer>> unSelectMap;
    //已经使用的订阅者
    private Map<String, List<Integer>> selectMap;

    /**
     * 选择合适的事件订阅者
     *
     * @param groupConsumer 事件订阅者集合
     * @return 事件订阅者
     */
    public EventConsumer select(GroupConsumer groupConsumer) {
        return null;
    }

    /**
     * 负责均衡获取订阅者
     *
     * @param groupConsumer 事件订阅者集合
     * @return
     */
    private Integer loadBalance(GroupConsumer groupConsumer) {
        return null;
    }
}
