package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Purchase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PurchaseMapper implements IMapper<Purchase> {
    @Override
    public List<Purchase> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public Purchase resultSetToObject(ResultSet rs) throws SQLException {
        return null;
    }
}
