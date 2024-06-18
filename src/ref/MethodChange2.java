package ref;

public class MethodChange2 {
  public static void main(String[] args) {
    Data dataA = new Data(); // x001
    dataA.value = 10; // x001.value = 10;
    System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
    System.out.println("dataA = " + dataA);
    changeReference(dataA);
    System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
  }

  private static void changeReference(Data dataX) { // dataX = dataA(x001)
    System.out.println("dataX = " + dataX);
    dataX.value = 20; // x001.value = 20;
    // dataX 와 dataA 는 동일한 객체의 참조값(위치) 를 가리킨다.
  }
}
