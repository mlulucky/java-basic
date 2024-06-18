package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
  User user; // 주문한 유저
  Product product; // 주문한 상품

  public Order(User user, Product product) {
    this.user = user;
    this.product = product;
  }
  // 생성자 public
  // 어느 패키지에서든 호출. 생성할 수 있다.
}
