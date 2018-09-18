package com.hcmus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmus.dao.SubjectDAOImpl;
import com.hcmus.model.Subjects;
import com.opensymphony.xwork2.ModelDriven;

@Service
public class SubjectServiceImpl implements GenericService<Subjects>, ModelDriven<SubjectDAOImpl>
{
    @Autowired
    SubjectDAOImpl subjectDao;

    @Override
    public SubjectDAOImpl getModel()
    {
        // TODO Auto-generated method stub
        return this.subjectDao;
    }

    @Override
    public Subjects create(Subjects entity)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Subjects update(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Subjects> getList()
    {
        // TODO Auto-generated method stub
        return subjectDao.getList();
    }

    @Override
    public Boolean delete(int id)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public SubjectDAOImpl getSubjectDao()
    {
        return subjectDao;
    }

    public void setSubjectDao(SubjectDAOImpl subjectDao)
    {
        this.subjectDao = subjectDao;
    }
    
}
