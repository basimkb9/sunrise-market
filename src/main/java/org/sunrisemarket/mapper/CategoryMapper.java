package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Category;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryMapper implements IMapper<Category> {
    private final String ID = "ID";
    private final String TITLE = "TITLE";

    @Override
    public List<Category> resultSetToList(ResultSet rs) throws SQLException {
        List<Category> categoryList = new ArrayList<>();

        while(rs.next()){
            Category category = Category.builder()
                    .id(rs.getLong(ID))
                    .title(rs.getString(TITLE))
                    .build();

            categoryList.add(category);
        }

        return categoryList;
    }

    @Override
    public Category resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            return Category.builder()
                    .id(rs.getInt(ID))
                    .title(rs.getString(TITLE))
                    .build();
        }
        return null;
    }
}
