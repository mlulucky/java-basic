package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int N = scanner.nextInt(); // 3\n -> 3 만 읽어들인다. \n(개행문자) 남음
    scanner.nextLine(); // 개행문자(엔터 \n) 소비

    ProductOrder[] orders = new ProductOrder[N];

    for(int i=0; i<N; i++) {
      System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
      System.out.print("상품명: ");
      String productName = scanner.nextLine();
      System.out.print("가격: ");
      int price = scanner.nextInt();
      System.out.print("수량: ");
      int quantity = scanner.nextInt(); //  3\n
      scanner.nextLine(); // 개행문자(\n) 소비 -> 입력버퍼를 비우기위한 코드
      orders[i] = createOrder(productName, price, quantity);
    }
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
