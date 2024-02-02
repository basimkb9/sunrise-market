package org.sunrisemarket.services;

import org.sunrisemarket.model.Payment;

import java.util.List;

public class PaymentService implements BaseService<Payment> {
    @Override
    public int insert(Payment obj) {
        return 0;
    }

    @Override
    public int update(Payment obj, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Payment getById(Long id) {
        return null;
    }

    @Override
    public List<Payment> getAll() {
        return null;
    }
}
