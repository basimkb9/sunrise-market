package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Category;
import org.sunrisemarket.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper implements IMapper<Product> {
    private final String ID = "ID";
    private final String TITLE = "TITLE";
    private final String PRICE = "PRICE";
    private final String QUANTITY = "QUANTITY";
    private final String AVAILABLE = "AVAILABLE";
    @Override
    public List<Product> resultSetToList(ResultSet rs) throws SQLException {
        List<Product> productList = new ArrayList<>();

        while(rs.next()){
            Product product = Product.builder()
                    .id(rs.getInt(ID))
                    .title(rs.getString(TITLE))
                    .price(rs.getDouble(PRICE))
                    .quantity(rs.getLong(QUANTITY))
                    .available(rs.getBoolean(AVAILABLE))
                    .build();

            productList.add(product);
        }

        return productList;
    }

    @Override
    public Product resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            return Product.builder()
                    .id(rs.getInt(ID))
                    .title(rs.getString(TITLE))
                    .price(rs.getDouble(PRICE))
                    .quantity(rs.getLong(QUANTITY))
                    .available(rs.getBoolean(AVAILABLE))
                    .build();
        }
        return null;
    }
}
