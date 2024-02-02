package org.sunrisemarket.unitofwork;

import org.sunrisemarket.repository.*;

public class UnitOfWork {
    private CategoryRepository categoryRepository;
    private CartRepository cartRepository;
    private ProductRepository productRepository;
    private CartItemRepository cartItemRepository;
    private PurchaseRepository purchaseRepository;
    private SoldItemsRepository soldItemsRepository;
    private PaymentRepository paymentRepository;

    public UnitOfWork(){
        this.categoryRepository = new CategoryRepository();
        this.cartRepository = new CartRepository();
        this.productRepository = new ProductRepository();
        this.cartItemRepository = new CartItemRepository();
        this.purchaseRepository = new PurchaseRepository();
        this.soldItemsRepository = new SoldItemsRepository();
        this.paymentRepository = new PaymentRepository();
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public CartRepository getCartRepository() {
        return cartRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public CartItemRepository getCartItemRepository() {
        return cartItemRepository;
    }

    public PurchaseRepository getPurchaseRepository() {
        return purchaseRepository;
    }

    public SoldItemsRepository getSoldItemsRepository() {
        return soldItemsRepository;
    }

    public PaymentRepository getPaymentRepository() {
        return paymentRepository;
    }


}
