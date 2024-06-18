package static2;

public class DecoMain2 {
  public static void main(String[] args) {
    String s = "hello java";

    // static 메서드 - 클래스 직접 접근
    // 클래스가 로딩될 때 클래스 소속으로 생성되므로. 바로 불러다 쓸수 있다.
    String deco = DecoUtil2.deco(s);

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
  }
}
