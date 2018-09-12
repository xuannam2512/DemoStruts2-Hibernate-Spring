package com.hcmus.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcmus.model.User;
import com.hcmus.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport
{
    private User user;
    @Autowired
    private UserService userService = new UserService();
    
    @Action(value = "register",
        results = { @Result(name = "success", location = "/index.jsp", type = "redirect") })
    public String execute() throws Exception
    {
        System.out.println("Register");
        if (userService.createUser(user)) {
            System.out.println(user);
            return SUCCESS;
        }
        return SUCCESS;
    }

    public UserService getUserService()
    {
        return userService;
    }

    public void setUserService(UserService userService)
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
