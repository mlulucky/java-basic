package construct.ex;

public class Book { // 책 객체
  String title;  // 책 제목
  String author; // 책 저자
  int page; // 책 페이지 수

  // 문제 - 생성자 오버로딩
  Book() {
    this("", "", 0);
  }

  Book(String title, String author) {
    this(title, author, 0);
  }

  Book(String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
  }

  void displayInfo() {
    System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
  }

}
