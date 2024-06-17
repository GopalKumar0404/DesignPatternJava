package org.gopal.prototype;

public class Book {
    private int bookId;
    private String bookname;
    private String author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int bookId, String bookname, String author) {
        this.bookId = bookId;
        this.bookname = bookname;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
