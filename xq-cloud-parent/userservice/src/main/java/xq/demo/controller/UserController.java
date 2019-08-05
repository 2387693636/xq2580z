package xq.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xq.demo.pojo.User;
import xq.demo.service.UserService;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 19:06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id){
        return userService.queryById(id);
    }
}
