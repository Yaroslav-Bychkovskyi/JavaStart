package com.github.yb.section8.bookpack;

import com.github.yb.section8.bookpack.bok.ExtBook;

public class Book1 {
    protected String title;
    protected String author;
    protected int pubDate;

    public Book1(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class ProtectDemo{
    public static void main(String args[]){
        ExtBook books[] = new ExtBook[5];
        books[0] = new ExtBook("Java: A Beginner's Guide","Schildt", 2007,"Osborne/McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference","Schildt", 2007,"Osborne/McGraw-Hill");
        books[2] = new ExtBook("The Art of Java","Schildt and Holmes", 2003,"Osborne/McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising","Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road","Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) books [i].show();
        System.out.println("Showing all books by Schildt.");
        for (int i = 0; i<books.length;i++)
            if(books[i].getAuthor()=="Schildt")
                System.out.println(books[i].getTitle());
    }
}

