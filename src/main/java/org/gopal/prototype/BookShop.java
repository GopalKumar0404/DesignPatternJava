package org.gopal.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookShop implements Cloneable{
    private String shopname;
    private List<Book> books = new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
//        bookShop.setBooks(this.getBooks());
        for(Book book : this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData() {
        List<Book> collect = IntStream.rangeClosed(1,5).mapToObj(i -> new Book(i, "Book" + i, "Author" + i)).collect(Collectors.toList());
        this.setBooks(collect);
    }
}
