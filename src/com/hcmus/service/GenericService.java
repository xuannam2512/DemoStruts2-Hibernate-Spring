package com.hcmus.service;

import java.util.List;

public interface GenericService<E>
{
    public E create(E entity);
    
    public E update(int id);
    
    public List<E> getList();
    
    public Boolean delete(int id);
}
