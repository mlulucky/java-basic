package access.ex.shopping;

public class Item {
  private String name;
  private int price;
  private int quantity;

  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  // 합계금액 계산 메서드
  public int getTotalPrice() {
    // 아이템의 가격 * 수량
    return price * quantity;
  }
}
