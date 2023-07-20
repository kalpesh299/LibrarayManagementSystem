package org.example;

import java.util.ArrayList;

public class Libraray {
    ArrayList<Book>books;
    Libraray(){
        this.books=new ArrayList<>();
    }

    public void addbook(Book book){
        books.add(book);
    }

    public void DisplayLibraryBooks(){
        System.out.println("Available Books");
        for(Book book:books){
            if(!book.isBorrowed()){
                System.out.println("Title: "+book.getTitle()+",Author: "+book.getAuthor()+",Gener: "+book.getGenere());
            }
        }
    }

    public void BorrowBook(String title){
        for(Book book:books){
          if(book.getTitle().equals(title)&& !book.isBorrowed()){
              book.setBorrowed(true);
              System.out.println("Book SUccessfully Borrowed");
              return;
          }
       }
        System.out.print("Book Not Found Alredy Bowrrowed with title"+title);
    }

    public void returnBook(String title){
      for(Book book:books){
          if(book.isBorrowed()){
              book.setBorrowed(false);
              System.out.println("Book is Successfully returned with title"+ title);
          }
      }
    }

}
