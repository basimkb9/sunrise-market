package org.sunrisemarket.mapper;

import org.sunrisemarket.model.CartItem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CartItemMapper implements IMapper<CartItem> {
    private static final String ID = "ID";
    private static final String PRODUCT_ID = "PRODUCTID";
    private static final String PRICE = "PRICE";
    private static final String CARTID = "CARTID";
    private static final String DISCOUNT = "DISCOUNT";
    private static final String QUANTITY = "QUANTITY";
    private static final String CREATEDAT = "CREATEDAT";
    private static final String UPDATEDAT = "UPDATEDAT";

    @Override
    public List<CartItem> resultSetToList(ResultSet rs) throws SQLException {
        List<CartItem> cartItemList = new ArrayList<>();

        while(rs.next()){
            CartItem cartItem = CartItem.builder()
                    .id(rs.getLong(ID))
                    .productId(rs.getLong(PRODUCT_ID))
                    .price(rs.getDouble(PRICE))
                    .cartId(rs.getLong(CARTID))
                    .quantity(rs.getLong(QUANTITY))
                    .discount(rs.getDouble(DISCOUNT))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();

            cartItemList.add(cartItem);
        }

        return cartItemList;
    }

    @Override
    public CartItem resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            CartItem cartItem = CartItem.builder()
                    .id(rs.getLong(ID))
                    .productId(rs.getLong(PRODUCT_ID))
                    .price(rs.getDouble(PRICE))
                    .cartId(rs.getLong(CARTID))
                    .quantity(rs.getLong(QUANTITY))
                    .discount(rs.getDouble(DISCOUNT))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();

            return cartItem;
        }
        else{
            return null;
        }
    }
}
