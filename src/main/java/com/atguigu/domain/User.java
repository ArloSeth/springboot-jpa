package com.atguigu.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id // 指定主键
    @GeneratedValue(strategy = GenerationType.AUTO) // 自动匹配自动增加一般使用GenerationType.IDENTITY
    @Column(name = "id")
    private Integer id;


    @Column(name = "username")
    private String username;

    private String password;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
