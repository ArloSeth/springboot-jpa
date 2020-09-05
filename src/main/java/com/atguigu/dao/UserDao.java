package com.atguigu.dao;

import com.atguigu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
// 使用jpa操作
public interface UserDao extends JpaRepository<User,Integer> {
}
