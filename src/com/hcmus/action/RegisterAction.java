package com.hcmus.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcmus.model.User;
import com.hcmus.service.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component
public class RegisterAction extends ActionSupport implements ModelDriven<UserServiceImpl>
{
    private User user;
    @Autowired(required = true)
    private UserServiceImpl userService;
    
    @Action(value = "register", results = { @Result(name = "success", location = "/index.jsp", type = "redirect"),
            @Result(name = "error", location = "/error.jsp") })
    public String execute() throws Exception
    {
        System.out.println("Register");
        User newUser = userService.create(user);
        
        if (newUser == null)
            return ERROR;
        
        return SUCCESS;
    }
    
    @Override
    public UserServiceImpl getModel()
    {
        return this.userService;
    }
    
    public UserServiceImpl getUserService()
    {
        return userService;
    }
    
    public void setUserService(UserServiceImpl userService)
    {
        this.userService = userService;
    }
    
    public User getUser()
    {
        return user;
    }
    
    public void setUser(User user)
    {
        this.user = user;
    }
}
