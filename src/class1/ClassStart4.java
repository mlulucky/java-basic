package class1;

public class ClassStart4 {
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

    // 배열 생성
    Student[] students = new Student[2];
    students[0] = student1;
    students[1] = student2;

    System.out.println("객체 비교 " +(students[0] == student1));

    System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
    System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    // 객체는 참조값을 반환한다.
    System.out.println(student1);
    System.out.println(student2);
  }
}
