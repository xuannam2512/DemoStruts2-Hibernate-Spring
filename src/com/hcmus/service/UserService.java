package com.hcmus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmus.dao.UserDAO;
import com.hcmus.model.User;

@Service
public class UserService
{
    @Autowired
    private UserDAO userDao;
    
    public Boolean createUser(User user) {
        try
        {
            userDao.createUser(user);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
}
