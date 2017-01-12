# EventBus
参考guava eventbus实现基于topic-group的事件总线

guava eventbus 是基于事件类型进行分发

本EventBus是基于topic进行分发

每个topic可以接受多个分组

每个分组内可以拥有多个事件订阅者

每个分组内的订阅者只有一个订阅者消费事件

同时与spring整合，完全基于注解配置，使用简单，使用可参照测试例子
