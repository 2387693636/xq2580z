<<<<<<< HEAD
#Eureka 服务注册中心<br>
<br>
1.这个服务注册中心eureka-server 可以把自己当做客户端 自己发现自己<br>
eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成）<br>
在默认情况下erureka server也是一个eureka client ,必须要指定一个 server。
<br>
配置文件:

```
server:
  port: 10086
spring:
  application:
    name: eureka-server
eureka:
  client:
    service-url:
      defaultZone: http://127.0.0.1:10086/eureka
```

<label style="color:red">2.Application.java启动文件</label><br>

```
@EnableEurekaServer //启用Eureka服务
@SpringBootApplication
public class EurekaApplication {

//    Eureka做集群
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class , args);
    }
}
```
其中@EnableEurekaServer 注解是启用Eureka服务<br>

这个注册中心只需服务提供方和消费方调用即可<br>

#注意
eureka server是有界面的，启动工程,打开浏览器访问即可见：
 

<br>[希望有朋友关注一下](xq2580z.top)