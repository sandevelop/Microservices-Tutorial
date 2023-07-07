package com.user.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.service.entity.User;

@Service
public interface UserService {

	User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String userId);
}
