package com.hcmus.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcmus.model.Subjects;
import com.hcmus.service.StudentServiceImpl;
import com.hcmus.service.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component
public class RegisterSubjectAction extends ActionSupport implements ModelDriven<SubjectServiceImpl>
{
    List<Subjects> subjects;
    @Autowired
    SubjectServiceImpl subjectService;

    @Action (value = "registerSubject", results = { @Result(name = "success", location = "/view/registersubject.jsp"),
            @Result( name = "error", location = "/error.jsp")})
    public String execute() {
        this.subjects = subjectService.getList();
        
        if(subjects == null) 
            return ERROR;
        
        return SUCCESS;
    }
    
    @Override
    public SubjectServiceImpl getModel()
    {
        return this.subjectService;
    }
    
    public List<Subjects> getSubjects()
    {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects)
    {
        this.subjects = subjects;
    }

    public SubjectServiceImpl getSubjectService()
    {
        return subjectService;
    }

    public void setSubjectService(SubjectServiceImpl subjectService)
    {
        this.subjectService = subjectService;
    }
}
