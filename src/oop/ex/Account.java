package oop.ex;

public class Account { // 은행 계좌
  // 속성(데이터)
  int balance; // 잔액

  // 기능(메서드)
  void deposit(int amount) { // 입금
    balance += amount;
  }

  void withdraw(int amount) { // 출금
    // 잔액이 부족한 경우 -> "잔액 부족" 출력
    if(balance < amount) {
      System.out.println("잔액 부족");
    } else {
      balance -= amount;
    }
  }

}
