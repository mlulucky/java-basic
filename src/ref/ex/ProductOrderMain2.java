package ref.ex;

public class ProductOrderMain2 {
  public static void main(String[] args) {
    // 메서드 - ProductOrder 생성하고 매개변수 초기값 설정 후 객체(참조값) 반환
    // 배열을 받아서 전체 ProductOrder 의 상품명, 가격, 수량 출력
    // 배열을 받아서 전체 ProductOrder 총 결제금액 계산. 계산결과 반환
    ProductOrder[] orders = new ProductOrder[3];
    orders[0] = createOrder("두부", 2000, 2);
    orders[1] = createOrder("김치", 5000, 1);
    orders[2] = createOrder("콜라", 1500, 2);
    printOrders(orders);
    int sum = getTotalAmount(orders);
    System.out.println("총 결제 금액: " + sum);
  }

  private static int getTotalAmount(ProductOrder[] orders) {
    int sum = 0;
    for (ProductOrder order : orders) {
      sum += order.price * order.quantity;
    }
    return sum;
  }

  private static void printOrders(ProductOrder[] orders) {
    for(ProductOrder order : orders) {
      System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }

  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder order = new ProductOrder();
    order.productName = productName;
    order.price = price;
    order.quantity = quantity;
    return order;
  }
}
