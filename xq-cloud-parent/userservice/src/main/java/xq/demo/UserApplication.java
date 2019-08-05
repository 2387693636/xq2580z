package xq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 18:28
 */
@EnableDiscoveryClient //兼容其他注册中心
@SpringBootApplication
@MapperScan("xq.demo.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
