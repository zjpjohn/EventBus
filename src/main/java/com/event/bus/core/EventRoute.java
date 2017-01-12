package com.event.bus.core;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project: EventBus
 * Module Desc:com.event.bus.core
 * User: zjprevenge
 * Date: 2017/1/12
 * Time: 10:35
 */
public class EventRoute {

    //topic-group映射关系
    public static Map<String, CopyOnWriteArrayList<String>> topicGroup = Maps.newConcurrentMap();
    //group-consumer映射关系
    public static Map<String, CopyOnWriteArrayList<EventConsumer>> groupConsumer = Maps.newConcurrentMap();
}
