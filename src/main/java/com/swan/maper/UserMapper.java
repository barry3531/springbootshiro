package com.swan.maper;

import com.swan.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);




}
