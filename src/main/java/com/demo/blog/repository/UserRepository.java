package com.demo.blog.repository;

import com.demo.blog.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {


}
