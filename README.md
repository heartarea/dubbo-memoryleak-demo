本示例项目用于演示dubbo内存泄漏问题

## 操作步骤
1. 注册中心使用zookeeper，启动一个provider和consumer（启动类DemoConsumer和DemoProvider）
2. 关停provider进程，等待40s（dubbo与zookeeper的会话超时时间）
3. 启动provider进程。

