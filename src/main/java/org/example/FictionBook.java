package org.example;



class FictionBook extends Book {

    String genere;

    FictionBook(String title,String author,String genere){
        super(title,author);
        this.genere=genere;
    }

    @Override
    public String getGenere(){
        return this.genere;
    }


}
