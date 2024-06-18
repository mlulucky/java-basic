package class1;

public class ClassStart5 {
  public static void main(String[] args) {
    // ClassStart4 배열 리팩토링
    Student student1; // 학생을 담을 수 있는 변수
    student1 = new Student(); // x001
    student1.name = "학생1"; // 클래스 객체에는 . 을 통해 접근
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student(); // x002
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    // 배열 생성과 초기화를 동시에 하는 경우 최적화
    Student[] students = {student1, student2};

    // 기본 for 문
    for(int i=0; i<students.length; i++) {
      System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
    }

    // for 문 최적화
    // 반복요소를 변수에 담아서 처리 -  변수명으로 간략히 사용하기
    // 향상된 for 문과 동일
    for(int i=0; i<students.length; i++) {
      Student s = students[i];
      System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
    }

    // 향상된 for 문 사용
    for(Student s : students) {
      System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
    }

  }
}
