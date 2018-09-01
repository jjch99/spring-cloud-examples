官方已不推荐自定义zipkin-server，`EnableZipkinServer`被标记为`Deprecated`，建议使用官方提供的包。

```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```