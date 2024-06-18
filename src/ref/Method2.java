package ref;

public class Method2 {
  public static void main(String[] args) {
    // class1.ClassStart3 리팩토링
    Student student1 = createStudent("학생1", 15, 90);
    System.out.println("student1 = " + student1);
    Student student2 = createStudent("학생2", 16, 80);
    System.out.println("student2 = " + student2);

    printStudent(student1);
    printStudent(student2);
  }

  static Student createStudent(String name, int age, int grade) { // 메서드 호출시
    Student student = new Student(); // 객체 생성 // x001
    System.out.println("student = " + student);
    student.name = name; // 초기값 설정
    student.age = age;
    student.grade = grade;
    return student;
  }

  private static void printStudent(Student student) {
    System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
  }
}
