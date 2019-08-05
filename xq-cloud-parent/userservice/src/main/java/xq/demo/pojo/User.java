package xq.demo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @auther: xq2580z
 * @date: 2019/8/5 18:27
 */
@Table(name="tb_user")
@Data
public class User{

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String username;
    private String password;
    private String name;
    private Integer age;
    private Integer male;
    private Date birthday;
    private Date created;
    private Date updated;
    private String note;
}
