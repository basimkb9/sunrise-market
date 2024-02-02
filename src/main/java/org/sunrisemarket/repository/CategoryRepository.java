package org.sunrisemarket.repository;

import org.sunrisemarket.dbcon.SunriseMarketDB;
import org.sunrisemarket.model.Category;
import org.sunrisemarket.mapper.CategoryMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoryRepository extends SunriseMarketDB implements BaseRepository<Category> {
    private final CategoryMapper categoryMapper = new CategoryMapper();

    @Override
    public int insert(Category obj) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.INSERT_INTO_CATEGORY);
            ps.setString(1,obj.getTitle());

            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
    public int update(Category obj, Long id) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.UPDATE_CATEGORY);
            ps.setString(1,obj.getTitle());
            ps.setLong(2,id);

            return ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteById(Long id) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.DELETE_CATEGORY);
            ps.setLong(1,id);

            return ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    static class SQL_QUERY_CONSTANTS{
        private static final String INSERT_INTO_CATEGORY = "INSERT INTO CATEGORY(title) VALUES(?)";
        private static final String GET_ALL_CATEGORY = "SELECT * FROM CATEGORY";
        private static final String GET_BY_ID = "SELECT * FROM CATEGORY WHERE id=?";
        private static final String UPDATE_CATEGORY = "UPDATE CATEGORY SET title=? where id=?";
        private static final String DELETE_CATEGORY = "DELETE FROM CATEGORY WHERE id=?";
    }
}
