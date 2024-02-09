package org.sunrisemarket.mapper;

import org.sunrisemarket.model.Payment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentMapper implements IMapper<Payment>{
    private final String ID = "ID";
    private final String USERID = "ID";
    private final String PURCHASEID = "PURCHASEID";
    private final String TYPE = "TYPE";
    private final String STATUS = "STATUS";
    private final String CREATEDAT = "CREATEDAT";
    private final String UPDATEDAT = "UPDATEDAT";

    @Override
    public List<Payment> resultSetToList(ResultSet rs) throws SQLException {
        List<Payment> payments = new ArrayList<>();

        while (rs.next()){
            Payment payment = Payment.builder()
                    .id(rs.getLong(ID))
                    .userId(rs.getLong(USERID))
                    .purchaseId(rs.getLong(PURCHASEID))
                    .type(rs.getString(TYPE))
                    .status(rs.getString(STATUS))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();

            payments.add(payment);
        }
        return payments;
    }

    @Override
    public Payment resultSetToObject(ResultSet rs) throws SQLException {
        if(rs.next()){
            return Payment.builder()
                    .id(rs.getLong(ID))
                    .userId(rs.getLong(USERID))
                    .purchaseId(rs.getLong(PURCHASEID))
                    .type(rs.getString(TYPE))
                    .status(rs.getString(STATUS))
                    .createdAt(rs.getTimestamp(CREATEDAT).toLocalDateTime())
                    .updatedAt(rs.getTimestamp(UPDATEDAT).toLocalDateTime())
                    .build();
        }
        else{
            return null;
        }
    }
}
