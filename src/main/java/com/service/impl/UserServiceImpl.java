package com.service.impl;

import com.domain.ResultList;
import com.domain.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private ResultList resultList;
    @Override
    public ResultList getAll() {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getAll();
            if(userList!=null){
                resultList.setUserList(userList);
                resultList.setStatus(200);
                return resultList;
            }else{
                resultList.setStatus(403);
                resultList.setMessage("无数据");
                return resultList;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            resultList.setStatus(403);
            resultList.setMessage("查询失败");
            return null;
        }


    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
