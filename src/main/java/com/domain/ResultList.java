package com.domain;

import org.springframework.stereotype.Component;

import java.util.List;
@Component("resultList")
public class ResultList {
    private List<User> userList;
    private int status;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultList{" +
                "userList=" + userList +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
