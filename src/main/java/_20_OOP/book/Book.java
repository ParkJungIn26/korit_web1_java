package _20_OOP.book;

public class Book {
    String title; // 제목
    String author; // 저자

    // 생성자 : 메서드랑 비슷하지만 리턴타입 x 이름은 클래스와 동일해야 한다.
    // title과 author를 초기화하는 생성자를 만들어 주세요
    // alt + Insert

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        String bookInfo = "제목 : " + title + "저자 : " + author;
        return bookInfo;
    }

}
