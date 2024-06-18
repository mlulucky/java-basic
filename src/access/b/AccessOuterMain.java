package access.b;

import access.a.AccessData;

// b 패키지 클래스
public class AccessOuterMain {
  public static void main(String[] args) {
    // a 패키지 클래스
    AccessData data = new AccessData();

    // public 접근 가능
    data.publicFeild = 1;
    data.publicMethod();

    // default 접근 불가
    // 같은 패키지내만 가능
//    data.defaultFeild = 2;
//    data.defaultMethod();

    // private 접근 불가
    // 해당 클래스내만 가능
//    data.privateFeild = 3;
//    data.privateMethod();

    // 클래스 내부 public 제어자로 클래스내 데이터 접근가능
    data.innerAccess();
  }
}
