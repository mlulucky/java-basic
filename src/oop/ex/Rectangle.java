package oop.ex;

public class Rectangle {
  // 속성
  int width;
  int height;

  // 기능
  int calculateArea() {
    return width * height;
  }

  int calculatePerimeter() {
    return 2 * (width + height);
  }

  boolean isSquare() {
    return width == height;
  }

}
