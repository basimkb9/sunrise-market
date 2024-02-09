package org.sunrisemarket.repository;

import org.sunrisemarket.dbcon.SunriseMarketDB;
import org.sunrisemarket.model.Category;
import org.sunrisemarket.mapper.CategoryMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

public class CategoryRepository extends SunriseMarketDB implements BaseRepository<Category> {
    private final CategoryMapper categoryMapper = new CategoryMapper();

    @Override
    public void insert(Category obj) throws SQLException {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.INSERT_INTO_CATEGORY);
            ps.setString(1,obj.getTitle());

            ps.executeUpdate();
    }

    @Override
    public List<Category> getAll() {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_ALL_CATEGORY);

            ResultSet rs = ps.executeQuery();
            return categoryMapper.resultSetToList(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Category getById(Long id) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_BY_ID);
            ps.setLong(1,id);

            ResultSet rs = ps.executeQuery();
            return categoryMapper.resultSetToObject(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Category obj, Long id) throws SQLException{
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.UPDATE_CATEGORY);
            ps.setString(1,obj.getTitle());
            ps.setLong(2,id);

            ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(Long id) throws SQLException{
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.DELETE_CATEGORY);
            ps.setLong(1,id);

            ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Category getByName(String name){
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_BY_NAME);
            ps.setString(1,name);

            ResultSet rs = ps.executeQuery();

            return categoryMapper.resultSetToObject(rs);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    static class SQL_QUERY_CONSTANTS{
        private static final String INSERT_INTO_CATEGORY = "INSERT INTO CATEGORY(title) VALUES(?)";
        private static final String GET_ALL_CATEGORY = "SELECT * FROM CATEGORY";
        private static final String GET_BY_ID = "SELECT * FROM CATEGORY WHERE id=?";
        private static final String GET_BY_NAME = "SELECT * FROM CATEGORY WHERE title=?";
        private static final String UPDATE_CATEGORY = "UPDATE CATEGORY SET title=? where id=?";
        private static final String DELETE_CATEGORY = "DELETE FROM CATEGORY WHERE id=?";
    }
}
