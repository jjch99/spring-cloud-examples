# spring-cloud-consul-provider

Consul作为注册中心和配置中心的示例

下载、运行`consul`
```bash
wget https://releases.hashicorp.com/consul/1.3.0/consul_1.3.0_darwin_amd64.zip
unzip consul_1.3.0_darwin_amd64.zip
consul agent -dev
```

浏览器打开
> http://localhost:8500

添加配置
```bash
consul kv put config/consul-provider/configuration hello=Hello
consul kv get config/consul-provider/configuration
```
