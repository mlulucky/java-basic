package construct;

public class MemberInit { // 회원객체
  String name;
  int age;
  int grade;

  // 회원객체의 초기값 설정 기능을 제공하는 메서드
  void initMember(String name, int age, int grade) {
//    name = name;
//    age = age;
//    grade = grade;
    // 인자, 멤버변수 이름이 같은 경우 -> 어느쪽 변수를 말하는지 모른다.
    // 멤버변수를 의미하는 경우 this.name 으로 구분을 한다.
    // this 는 자기자신의 인스턴스 변수(참조값)를 가리킨다.

      this.name = name; // 멤버변수 = 매개변수 변수
      this.age = age;
      this.grade = grade;
  }
}

