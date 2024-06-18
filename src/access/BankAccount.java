package access;

public class BankAccount {
  private int balance;

  // 계좌생성
  public BankAccount() {
    balance = 0;
  }

  // public 메서드 - 입금
  public void deposit(int amount) {
    if(isAmountValid(amount)) {
      balance += amount;
    } else {
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  // 출금
  public void withdraw(int amount) {
    if(isAmountValid(amount) && balance >= amount ) {
      balance -= amount;
    } else {
      System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }
  }

  // 내부에서만 사용할 메서드라서 private 제어자 사용
  private boolean isAmountValid(int amount) {
    // 금액이 0 보다 커야함
    return amount > 0;
  }

  public int getBalance() {
    return balance;
  }
}
