package com.hcmus.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcmus.model.Student;
import com.hcmus.service.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component
public class LoginAction extends ActionSupport implements ModelDriven<StudentServiceImpl>
{
    private String username;
    private String password;
    
    @Autowired
    private StudentServiceImpl studentService;
    
    @Action(value = "login", results = { @Result(name = "success", location = "/view/viewDashBoard.jsp"),
            @Result(name = "error", location = "/error.jsp") })
    public String execute() throws Exception
    {
        System.out.println("username: " + this.username);
        System.out.println("Password: " + this.password);
        
        Student student = studentService.findByName(this.username);
        
        if (student == null)
            return ERROR;
        
        if (student.getPassword().equals(password) == false)
            return ERROR;
        
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
    
    @Override
    public StudentServiceImpl getModel()
    {
        // TODO Auto-generated method stub
        return this.studentService;
    }
    
    public StudentServiceImpl getStudentService()
    {
        return studentService;
    }
    
    public void setStudentService(StudentServiceImpl studentService)
    {
        this.studentService = studentService;
    }
    
}
