# spring-cloud-config-server

本示例通过Kafka消息总线动态刷新配置。

修改配置并commit后，向config-server发送请求，config-server会通过消息总线通知应用重新拉取配置。
```
curl -X POST http://localhost:9131/bus/refresh
```
