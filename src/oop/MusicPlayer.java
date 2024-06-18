package oop;

public class MusicPlayer {
  int volume = 0;
  boolean isOn = false;

  // static 은 객체 생성없이 데이터를 부르는 것.
  // 현재 인스턴스 생성하고 메서드 사용할 것이므로.
  // static 사용 X

  void on() {
    isOn = true; // 객체 자신의 멤버변수를 사용하므로. 메서드의 인자로 외부에서 데이터를 받아올 필요가 없다.
    System.out.println("음악 플레이어를 시작합니다.");
  }

  void off() {
    isOn = false;
    System.out.println("음악 플레이어를 종료합니다.");
  }

  void volumeUp() {
    volume++;
    System.out.println("음악 플레이어 볼륨: " + volume);
  }

  void volumeDown() {
    volume--;
    System.out.println("음악 플레이어 볼륨: " + volume);
  }

  void showStatus() {
    System.out.println("음악 플레이어 상태 확인");
    if(isOn) {
      System.out.println("음악 플레이어 ON, 볼륨: " + volume);
    } else {
      System.out.println("음악 플레이어 OFF");
    }
  }

}
