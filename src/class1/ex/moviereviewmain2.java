package class1.ex;

public class moviereviewmain2 {
  public static void main(String[] args) {
    // 기존 문제(moviereviewmain1)를 배열에서 관리하자.

    // 영화 리뷰 정보 선언
    MovieReview inception = new MovieReview();
    inception.title = "인셉션";
    inception.review = "인생은 무한 루프";

    MovieReview aboutTime = new MovieReview();
    aboutTime.title = "어바웃 타임";
    aboutTime.review = "인생 시간 영화!";

    MovieReview[] movieReviews = new MovieReview[2]; // x005
    movieReviews[0] = inception; // x001
    movieReviews[1] = aboutTime; // x002

    for(MovieReview movieReview : movieReviews) {
      System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
    }
  }
}
