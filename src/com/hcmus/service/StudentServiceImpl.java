package com.hcmus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcmus.dao.StudentDAOImpl;
import com.hcmus.model.Student;
import com.opensymphony.xwork2.ModelDriven;


@Component
public class StudentServiceImpl implements ModelDriven<StudentDAOImpl>, GenericService<Student>
{
    @Autowired (required = true)
    private StudentDAOImpl studentDao;
    
    public Student findByName(String username) {
        return studentDao.findByName(username);
    }

    @Override
    public StudentDAOImpl getModel()
    {
        return this.studentDao;
    }

    @Override
    public Student create(Student entity)
    {
        try
        {
            Student student = studentDao.create(entity);
            return student;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public Student update(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Student> getList()
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
