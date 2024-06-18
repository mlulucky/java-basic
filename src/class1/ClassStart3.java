package class1;

public class ClassStart3 {
  public static void main(String[] args) {
    Student student1; // 학생을 담을 수 있는 변수
    student1 = new Student(); // x001   // 학생 생성 // 학생정보를 포함 // 실제 메모리에 생성
    student1.name = "학생1"; // 클래스 객체에는 . 을 통해 접근
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student(); // x002
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

    System.out.println(student1);
    System.out.println(student2);
  }
}
