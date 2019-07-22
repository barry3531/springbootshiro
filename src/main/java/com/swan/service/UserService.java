package com.swan.service;

import com.swan.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);

}
