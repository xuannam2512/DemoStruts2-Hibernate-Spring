package com.hcmus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "subject")
public class Subjects
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    
    @Column (name = "name")
    private String name;
    
    @OneToOne(mappedBy = "teacherId")
    Teacher teacherId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Teacher getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId)
    {
        this.teacherId = teacherId;
    }
}
