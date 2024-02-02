package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CartMapper implements IMapper<Cart> {
    @Override
    public List<Cart> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public Cart resultSetToObject(ResultSet rs) throws SQLException {
        return null;
    }
}
