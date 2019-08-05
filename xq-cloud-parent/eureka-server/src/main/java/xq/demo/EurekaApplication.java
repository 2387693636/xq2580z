package xq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 20:23
 */

@EnableEurekaServer //启用Eureka服务
@SpringBootApplication
public class EurekaApplication {

//    Eureka做集群
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class , args);
    }
}
