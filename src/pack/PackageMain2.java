package pack;

import pack.a.User;

public class PackageMain2 {
  // 같은 패키지내 파일 -> 바로 생성자 호출 (패키지 경로 생략)
  Data data = new Data();

  // 다른 패키지 파일 -> import
  User user = new User();

}
