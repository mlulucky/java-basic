package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
  public void order() { // 주문 서비스.
    User user = new User();
    Product product = new Product();
    Order order = new Order(user, product);
  }
}
