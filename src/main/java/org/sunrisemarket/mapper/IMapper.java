package org.sunrisemarket.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IMapper <T>{

    //extracts multiple data fields from resultSet
    List<T> resultSetToList(ResultSet rs) throws SQLException;

    //extracts single field from resultSet if it returns only 1 row.
    T resultSetToObject(ResultSet rs) throws SQLException;
}
