package com.hcmus.dao;

import java.util.List;

public interface GenericDAO<E>
{
    public E create(E entity);
    
    public E update(int id);
    
    public List<E> getList();
    
    public Boolean delete(int id);
}
