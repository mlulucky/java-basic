package ref;

public class VarChange2 {
  public static void main(String[] args) {
    Data dataA = new Data(); // x001
    dataA.value = 10;
    Data dataB = dataA; // x001 // 참조값을 복사해서 대입
    // dataA 와 dataB 는 동일한 객체.참조값x001 을 가리키고 있다.

    System.out.println("Data dataB = dataA");
    System.out.println("dataA 참조값 = " + dataA);
    System.out.println("dataB 참조값 = " + dataB);
    System.out.println("dataA.value = " + dataA.value);
    System.out.println("dataB.value = " + dataB.value);

    // dataA 변경
    dataA.value = 20;
    System.out.println("변경 dataA.value = 20");
    System.out.println("dataA.value = " + dataA.value);
    System.out.println("dataB.value = " + dataB.value);

    // dataB 변경
    dataB.value = 30;
    System.out.println("변경 dataB.value = 30");
    System.out.println("dataA.value = " + dataA.value);
    System.out.println("dataB.value = " + dataB.value);


  }
}
