package org.gopal.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopname("first Book Shop");
        bs.loadData();

        BookShop bs2 = bs.clone();
        bs.getBooks().remove(1);
        bs2.setShopname("second Book Shop");
        System.out.println(bs);
        System.out.println(bs2);
    }
}
