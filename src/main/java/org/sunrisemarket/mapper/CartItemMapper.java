package org.sunrisemarket.mapper;

import org.sunrisemarket.model.CartItem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CartItemMapper implements IMapper<CartItem> {
    @Override
    public List<CartItem> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public CartItem resultSetToObject(ResultSet rs) throws SQLException {
        return null;
    }
}
