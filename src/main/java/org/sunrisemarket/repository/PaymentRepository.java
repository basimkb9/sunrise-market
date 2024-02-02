package org.sunrisemarket.repository;

import org.sunrisemarket.model.Payment;

import java.util.List;

public class PaymentRepository implements BaseRepository<Payment> {
    @Override
    public int insert(Payment obj) {
        return 0;
    }

    @Override
    public List<Payment> getAll() {
        return null;
    }

    @Override
    public Payment getById(Long id) {
        return null;
    }

    @Override
    public int update(Payment obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
