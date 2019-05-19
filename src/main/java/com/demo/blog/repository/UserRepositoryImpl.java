package com.demo.blog.repository;

import com.demo.blog.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryImpl implements  UserRepository{

    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<Long,User>();

    @Override
    public User saveOrUpdateUser(User user) {

        Long id = user.getId();
        if(StringUtils.isEmpty(id)){
            id=counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {

        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList(userMap.values());
    }
}
