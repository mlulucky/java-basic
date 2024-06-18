package class1;

public class ClassStart2 {
  public static void main(String[] args) {
    // 배열 사용으로 코드 중복 해결해보기
    // 배열은 같은 타입끼리 묶을 수 있다.
    String[] studentNames = {"학생1", "학생2"};
    int[] studentAges = {15, 16};
    int[] studentScores = {90, 80};

    for(int i=0; i<studentNames.length; i++) {
      System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentScores[i]);
    }

  }
}
