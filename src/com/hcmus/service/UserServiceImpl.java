package com.hcmus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hcmus.dao.UserDAOImpl;
import com.hcmus.model.User;
import com.opensymphony.xwork2.ModelDriven;


@Component
public class UserServiceImpl implements ModelDriven<UserDAOImpl>, GenericService<User>
{
    @Autowired (required = true)
    private UserDAOImpl userDao;

    @Override
    public UserDAOImpl getModel()
    {
        return this.userDao;
    }

    @Override
    public User create(User entity)
    {
        try
        {
            User user = userDao.create(entity);
            return user;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public User update(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getList()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean delete(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
