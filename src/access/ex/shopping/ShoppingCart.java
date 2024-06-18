package access.ex.shopping;

public class ShoppingCart {
  // 아이템 개수 10개 제한
  private Item[] items = new Item[10]; // 0 ~ 9
  private int itemCount; // 초기값 0

  public void addItem(Item item) {
    if (itemCount >= items.length) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    }
    items[itemCount++] = item;
  }

  public void displayItems() {
    System.out.println("장바구니 상품 출력");
    for (int i = 0; i < itemCount; i++) {
      Item item = items[i];
      System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
    }
    System.out.println("전체 가격 합: " + calculateTotalPrice());
  }

  private int calculateTotalPrice() { // 내부에서 사용 -> private
    int totalPrice = 0;
    for (Item item : items) { // items 기본 10개 -> 있는것만 출력하기.
      if (item != null) {
        totalPrice += item.getTotalPrice();
      }
    }
    return totalPrice;
  }


}
