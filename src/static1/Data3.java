package static1;

public class Data3 {
  public String name;
  public static int count;

  public Data3(String name) {
    this.name = name;
    count++; // Data3.count++
    // 클래스 내부의 변수로 사용하므로
    // Data3 클래스명을 생략할 수 있다.
  }
}
// static 변수는 클래스에 직접 접근할 수 있다.
// 예) Data3.count
// 잘못된 예) this.name -> Data3.name(X)
// name 은 static 변수가 아니다.