package org.sunrisemarket.repository;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<T>{
    void insert(T obj) throws SQLException;
    List<T> getAll();
    T getById(Long id);
    void update(T obj, Long id) throws SQLException;
    void deleteById(Long id) throws SQLException;
}
