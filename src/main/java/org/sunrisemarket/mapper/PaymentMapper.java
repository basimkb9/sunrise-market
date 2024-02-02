package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Payment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PaymentMapper implements IMapper<Payment>{
    @Override
    public List<Payment> resultSetToList(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public Payment resultSetToObject(ResultSet rs) throws SQLException {
        return null;
    }
}
