package ref;

public class NullMain3 {
  public static void main(String[] args) {
    BigData bigData = new BigData();
    System.out.println("bigData.count = " + bigData.count); // int count
    System.out.println("bigData.data = " + bigData.data); // Data data
    // bigData.data 는 초기화하지 않음 -> null
    System.out.println("bigData.data.value = " + bigData.data.value);
    // null.value 는 NullPointerException 예외 발생
  }
}
