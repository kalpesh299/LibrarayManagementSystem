package org.example;

public class Main {
    public static void main(String[] args) {
       FictionBook book1=new FictionBook("Bhagwath Geeta","swami","Spriritual");
        FictionBook book2=new FictionBook("Ramayan","narayan babu","Spriritual");

        NonFictionBook book3=new NonFictionBook("chawa","s.a patil","motivational");
        NonFictionBook book4=new NonFictionBook("shivaji","abc","motivational");

        Libraray library=new Libraray();
        library.addbook(book1);
        library.addbook(book2);
        library.addbook(book3);
        library.addbook(book4);


        library.BorrowBook("chawa");

        library.returnBook("chawa");
        library.DisplayLibraryBooks();


    }
}