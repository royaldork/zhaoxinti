package com.service;

import com.domain.ResultList;
import com.domain.User;

import java.sql.ResultSet;
import java.util.List;

public interface UserService {
    ResultList getAll();
    void add(User user);
    void delete(User user);
}
