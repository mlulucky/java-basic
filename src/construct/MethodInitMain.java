package construct;

public class MethodInitMain {
  public static void main(String[] args) {
    // 회원객체 정의 및 데이터 사용
    // 데이터 초기화 -> 중복코드 발생
    MemberInit member1 = new MemberInit();
    member1.name = "user1";
    member1.age = 15;
    member1.grade = 90;

    MemberInit member2 = new MemberInit();
    member2.name = "user2";
    member2.age = 16;
    member2.grade = 80;

    MemberInit[] members  = {member1, member2};

    for(MemberInit m : members) {
      System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
    }
  }
}
