package org.example;

public class NonFictionBook extends Book{

    String genere;

    NonFictionBook(String title,String author,String genere){
        super(title,author);
        this.genere=genere;
    }

    @Override
    public String getGenere(){
        return this.genere;
    }


}
