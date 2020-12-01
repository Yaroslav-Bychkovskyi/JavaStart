package com.github.yb.section8.bookpack;

public class Book1 {
    protected String title;
    protected String author;
    protected int pubDate;

    Book1(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class ExtBook extends Book1 {
    private String publisher;

    ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    public String getTitle(){return title;}
    public void setTitle(String t){title = t;}
    public String getAuthor(){return author;}
    public void setAuthor(String a){author = a;}
    public int getPubDate(){return pubDate;}
    public void setPubDate(int d){pubDate = d;}

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

