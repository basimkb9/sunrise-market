package org.sunrisemarket.services;

import org.sunrisemarket.model.Purchase;

import java.util.List;

public class PurchaseService implements BaseService<Purchase> {
    @Override
    public int insert(Purchase obj) {
        return 0;
    }

    @Override
    public int update(Purchase obj, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Purchase getById(Long id) {
        return null;
    }

    @Override
    public List<Purchase> getAll() {
        return null;
    }
}
