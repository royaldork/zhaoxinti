package com.mapper;

import com.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();
    void add(User user);
    void delete(User user);
}
