package access.a;

// 필드, 메서드 접근제어자
public class AccessData {
  public int publicFeild;
  int defaultFeild; // 기본 접근제어자
  private int privateFeild;

  public void publicMethod() {
    System.out.println("publicMethod 호출 " + publicFeild);
  }

  void defaultMethod() {
    System.out.println("defaultMethod 호출 " + defaultFeild);
  }

  private void privateMethod() {
    System.out.println("privateMethod 호출 " + privateFeild);
  }

  // public 접근제어자로, 해당클래스의 필드, 메서드에 접근
  public void innerAccess() {
    System.out.println("내부 호출");
    publicFeild = 100;
    defaultFeild = 200;
    privateFeild = 300;
    publicMethod();
    defaultMethod();
    privateMethod();
  }

}
