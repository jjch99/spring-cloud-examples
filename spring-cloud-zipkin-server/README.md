官方已不推荐自定义zipkin-server，`EnableZipkinServer`被标记为`Deprecated`，建议使用官方提供的包。

```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

某些情况下无法使用官方包（如某环境的Kafka版本与官方zipkin-server里的kafka-clients不兼容），可根据情况自定义zipkin-server。

本示例直接调用官方`ZipkinServer`的`main`方法，打包时也未打入任何实际内容。

实际应用时一般采用Kafka接收brave上报的数据，用Elasticsearch来做存储。
