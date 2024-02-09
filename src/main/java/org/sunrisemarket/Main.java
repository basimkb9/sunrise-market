package org.sunrisemarket;

import org.sunrisemarket.model.Category;
import org.sunrisemarket.model.Product;
import org.sunrisemarket.repository.CategoryRepository;
import org.sunrisemarket.repository.ProductRepository;
import org.sunrisemarket.services.CategoryService;
import org.sunrisemarket.services.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);

        Product product = Product.builder()
                .title("Bata Sneakers")
                .quantity(100)
                .price(2800D)
                .build();

        productService.update(product,1L);

        System.out.println(productService.getById(1L));
//        insertProduct("Bata Sneakers", 3200D, 20);
    }

    private static void insertCategory(String title) {
        CategoryRepository categoryRepository = new CategoryRepository();
        CategoryService categoryService = new CategoryService(categoryRepository);

        Category category1 = Category.builder()
                .title(title)
                .build();

        categoryService.insert(category1);
    }

    private static void insertProduct(String title, double price, long quantity) {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);

        Product product = Product.builder()
                .title(title)
                .price(price)
                .quantity(quantity)
                .build();

        productService.insert(product);
    }
}