package com.demo.blog.repository;

import com.demo.blog.domain.User;

import java.util.List;

public interface UserRepository {

    /**
     * 创建或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUser();
}
