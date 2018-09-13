package com.hcmus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "student")
public class Student
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @Column (name = "firstname")
    private String firstname;
    
    @Column (name = "lastname")
    private String lastname;
    
    @Column (name = "cardStudent")
    private String cardStudent;
    
    @Column (name = "birthday")
    private Date birthday;
    
    @Column (name = "username")
    private String username;
    
    @Column (name = "password")
    private String password;

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

    public String getCardStudent()
    {
        return cardStudent;
    }

    public void setCardStudent(String cardStudent)
    {
        this.cardStudent = cardStudent;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
    
    
}
