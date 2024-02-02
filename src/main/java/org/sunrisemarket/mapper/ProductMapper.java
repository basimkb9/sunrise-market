package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductMapper implements IMapper<Product> {
    @Override
    public List<Product> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public Product resultSetToObject(ResultSet rs) throws SQLException {
        return null;
    }
}
