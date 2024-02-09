package org.sunrisemarket.services;

import java.util.List;

public interface BaseService<T>{
    void insert(T obj);
    void update(T obj, Long id);
    void delete(Long id);
    T getById(Long id);
    List<T> getAll();
}
