package xq.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xq.demo.mapper.UserMapper;
import xq.demo.pojo.User;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 19:02
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id); //通过ID查询
    }

}
