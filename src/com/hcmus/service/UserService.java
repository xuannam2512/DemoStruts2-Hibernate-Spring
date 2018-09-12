package com.hcmus.service;

import org.springframework.stereotype.Service;

import com.hcmus.dao.UserDAO;
import com.hcmus.model.User;

@Service
public class UserService
{
    private UserDAO userDao = new UserDAO();
    
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
