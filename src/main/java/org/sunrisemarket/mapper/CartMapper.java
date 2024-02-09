package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartMapper implements IMapper<Cart> {
    private final String ID = "ID";
    private final String USERID = "USERID";
    private final String CREATEDAT = "CREATEDAT";
    private final String UPDATEDAT = "UPDATEDAT";

    @Override
    public List<Cart> resultSetToList(ResultSet rs) throws SQLException {
        List<Cart> carts = new ArrayList<>();
        while(rs.next()){
            Cart cart = Cart.builder()
                    .id(rs.getLong(ID))
                    .userId(rs.getLong(USERID))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();

            carts.add(cart);
        }
        return carts;
    }

    @Override
    public Cart resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            Cart cart = Cart.builder()
                    .id(rs.getLong(ID))
                    .userId(rs.getLong(USERID))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();

            return cart;
        }
        else{
            return null;
        }
    }
}
