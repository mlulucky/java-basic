package ref;

public class InitMain {
  public static void main(String[] args) {
    InitData data = new InitData();
    System.out.println("value1 = " + data.value1); // 0
    System.out.println("value2 = " + data.value2); // 10

    // data 의 value1 은 값을 초기화 하지 않았지만. 자동으로 초기화 된다.
    // 멤버변수는 인스턴스 생성시 자동으로 값이 초기화 된다. 숫자는 0 으로
  }
}
