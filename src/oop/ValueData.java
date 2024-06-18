package oop;

public class ValueData {
  // 속성 - 데이터
  int value;
  // 기능 - 메서드
  void add() {
    value++; // 객체자신의 멤버변수
    System.out.println("숫자 증가 value = " + value);
  }
}
