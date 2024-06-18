package access.ex.maxCount;

public class MaxCounter {
  private int count;
  private int max;

  // public 다른패키지에서도 사용가능
  public MaxCounter(int max) {
    this.max = max;
  }

  public void increment(){
    if(count<max) {
      count++;
    } else {
      System.out.println("최대값을 초과할 수 없습니다.");
    }
  }

  public int getCount(){
    return count;
  }
}
