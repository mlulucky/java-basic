package static2;

public class DecoData {
  // 인스턴스 변수
  private int instanceValue;

  // 클래스 변수
  private static int staticValue;

  // static 메서드
  public static void staticCall() {
    // 🪄 인스턴스 변수, 메서드 사용 - 컴파일 에러
//    instanceValue++;
//    instanceMethod();

    // static 변수, 메서드 사용
    staticValue++;
    staticMethod();
  }

  // 인스턴스 메서드
  public void instanceCall() {
    // 인스턴스 변수, 메서드 사용
    instanceValue++;
    instanceMethod();

    // static 변수, 메서드 사용
    staticValue++;
    staticMethod();
  }

  // 인스턴스 메서드
  private void instanceMethod() {
    System.out.println("instanceValue = " + instanceValue);
  }

  // 클래스 메서드
  private static void staticMethod() {
    System.out.println("staticValue = " + staticValue);

  }

}
