package org.sunrisemarket.repository;

import org.sunrisemarket.model.Purchase;

import java.util.List;

public class PurchaseRepository implements BaseRepository<Purchase>{
    @Override
    public int insert(Purchase obj) {
        return 0;
    }

    @Override
    public List<Purchase> getAll() {
        return null;
    }

    @Override
    public Purchase getById(Long id) {
        return null;
    }

    @Override
    public int update(Purchase obj, Long id) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }
}
