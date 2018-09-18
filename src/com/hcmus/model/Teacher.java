package com.hcmus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "teacher")
public class Teacher
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    
    @Column (name = "firstname")
    private String firstname;
    
    @Column (name = "lastname")
    private String lastname;
    
    @Column (name = "salary")
    private Integer salary;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public Integer getSalary()
    {
        return salary;
    }

    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }
    
    
}
