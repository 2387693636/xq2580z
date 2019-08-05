package xq.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xq.demo.pojo.User;

import java.util.List;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 19:31
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate; //远程访问 userservice的服务接口

    @Autowired
    private DiscoveryClient discoveryClient; //传入服务 实例

    @RequestMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id){
        //根据服务ID获取实例Instance Instance是对应服务的一条记录
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //从实例中取出IP 端口
        ServiceInstance serviceInstance = instances.get(0);
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;
        User user = restTemplate.getForObject(url, User.class);  //远程查询
        return user;
    }
}
