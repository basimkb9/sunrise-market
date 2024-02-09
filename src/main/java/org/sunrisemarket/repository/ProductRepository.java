package org.sunrisemarket.repository;

import org.sunrisemarket.dbcon.SunriseMarketDB;
import org.sunrisemarket.mapper.ProductMapper;
import org.sunrisemarket.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductRepository extends SunriseMarketDB implements BaseRepository<Product> {
    private final ProductMapper productMapper = new ProductMapper();

    @Override
    public void insert(Product obj) throws SQLException{
        PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.INSERT_INTO_PRODUCT);
        ps.setString(1,obj.getTitle());
        ps.setDouble(2,obj.getPrice());
        ps.setLong(3,obj.getQuantity());

        ps.executeUpdate();
    }

    @Override
    public List<Product> getAll() {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_ALL_PRODUCT);

            ResultSet rs = ps.executeQuery();

            return productMapper.resultSetToList(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product getById(Long id) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_BY_ID);
            ps.setLong(1,id);

            ResultSet rs = ps.executeQuery();

            return productMapper.resultSetToObject(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product obj, Long id) throws SQLException{
        PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.UPDATE_PRODUCT);
        ps.setString(1,obj.getTitle());
        ps.setDouble(2,obj.getPrice());
        ps.setLong(3,obj.getQuantity());
        ps.setLong(4,id);

        ps.executeUpdate();
    }

    @Override
    public void deleteById(Long id) throws SQLException{
        PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.DELETE_PRODUCT);
        ps.setLong(1,id);

        ps.executeUpdate();
    }

    public Product getByTitle(String title) {
        try {
            PreparedStatement ps = DBConn.prepareStatement(SQL_QUERY_CONSTANTS.GET_BY_NAME);
            ps.setString(1,title);

            ResultSet rs = ps.executeQuery();

            return productMapper.resultSetToObject(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    static class SQL_QUERY_CONSTANTS{
        private static final String INSERT_INTO_PRODUCT = "INSERT INTO PRODUCT(title, price, quantity) VALUES(?,?,?)";
        private static final String GET_ALL_PRODUCT = "SELECT * FROM PRODUCT";
        private static final String GET_BY_ID = "SELECT * FROM PRODUCT WHERE id=?";
        private static final String GET_BY_NAME = "SELECT * FROM PRODUCT WHERE title=?";
        private static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET title=?, price=?, quantity=? where id=?";
        private static final String DELETE_PRODUCT = "DELETE FROM PRODUCT WHERE id=?";
    }
}
