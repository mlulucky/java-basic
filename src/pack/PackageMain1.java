package pack;

public class PackageMain1 {
  // 같은 패키지내 파일 -> 바로 생성자 호출 (패키지 경로 생략)
  Data data = new Data();

  // 다른 패키지 파일 -> 패키지명 포함 풀 네임으로 생성자 호출
  pack.a.User user = new pack.a.User();

}
