# spring-cloud-consul-provider

Consul作为注册中心和配置中心的示例

下载、运行`consul`
```bash
# mac
wget https://releases.hashicorp.com/consul/1.3.0/consul_1.3.0_darwin_amd64.zip
unzip consul_1.3.0_darwin_amd64.zip

# Linux
wget https://releases.hashicorp.com/consul/1.3.0/consul_1.3.0_linux_amd64.zip
unzip consul_1.3.0_linux_amd64.zip

# dev 模式启动
# 可选 绑定到所有地址，允许非本机IP连接
consul agent -dev [-client 0.0.0.0]
```

浏览器打开
> http://localhost:8500

添加配置
```bash
consul kv put config/service-provider/configuration hello=Hello
consul kv get config/service-provider/configuration
```
