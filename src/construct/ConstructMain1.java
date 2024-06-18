package construct;

public class ConstructMain1 {
  public static void main(String[] args) {
    // new MemberConstruct() : 객체 생성 및 생성자를 부른다. // 객체가 메모리에 생성되고 바로 생성자를 호출한다.
    // new MemberConstruct : 객체 생성
    // MemberConstruct() : 생성자 호출
    MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // ctrl + p : 파라미터정보 확인
    MemberConstruct member2 = new MemberConstruct("user2", 16, 80); // ctrl + p : 파라미터정보 확인

    MemberConstruct[] members = {member1, member2};

    for(MemberConstruct m : members) {
      System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
    }

  }
}
