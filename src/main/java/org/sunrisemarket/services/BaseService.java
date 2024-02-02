package org.sunrisemarket.services;

import java.util.List;

public interface BaseService<T>{
    int insert(T obj);
    int update(T obj, Long id);
    int delete(Long id);
    T getById(Long id);
    List<T> getAll();
}
