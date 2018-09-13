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
public class RegisterAction extends ActionSupport implements ModelDriven<StudentServiceImpl>
{
    private Student student;
    @Autowired(required = true)
    private StudentServiceImpl studentService;
    
    @Action(value = "register", results = { @Result(name = "success", location = "/index.jsp", type = "redirect"),
            @Result(name = "error", location = "/error.jsp") })
    public String execute() throws Exception
    {
        System.out.println("Register");
        Student newStudent = studentService.create(student);
        
        if (newStudent == null)
            return ERROR;
        
        return SUCCESS;
    }
    
    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    @Override
    public StudentServiceImpl getModel()
    {
        return this.studentService;
    }
    
    public StudentServiceImpl getUserService()
    {
        return this.studentService;
    }
    
    public void setUserService(StudentServiceImpl studentService)
    {
        this.studentService = studentService;
    }
    
}
