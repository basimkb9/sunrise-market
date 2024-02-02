package org.sunrisemarket.repository;

import java.util.List;

public interface BaseRepository<T>{
    int insert(T obj);
    List<T> getAll();
    T getById(Long id);
    int update(T obj, Long id);
    int deleteById(Long id);
}
