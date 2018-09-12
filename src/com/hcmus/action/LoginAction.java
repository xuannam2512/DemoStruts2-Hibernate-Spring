package com.hcmus.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class LoginAction extends ActionSupport
{
    @Autowired
    private String username;
    @Autowired
    private String password;
    
//    @Action (value = "login", results = { @Result( name = "success", location = "/jsp/viewDashBoard.jsp")})
    public String execute() throws Exception {
        System.out.println("username: " + this.username);
        System.out.println("Password: " + this.password);
        return SUCCESS;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
}
