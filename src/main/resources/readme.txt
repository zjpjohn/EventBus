基于主题topic的时间总线的设计

事件生产者 发送事件指定主题
事件消费者 根据分组-主题消费事件
同一个主题内：多个分组都订阅事件
            每个分组内的多个订阅者只有一个消费事件

topic-group
事件路由格式
MultiMap<String,String> topic-group
MultiMap<String,EventConsumer> group

根据订阅者组织事件路由网