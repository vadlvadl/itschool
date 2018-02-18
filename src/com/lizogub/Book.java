package com.lizogub;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public void show(){
//        System.out.println(this.title + " - " + this.author + "\n");
//        System.out.println(this.content + " (" + this.pageCount + " страниц)");
        this.title.show();
        this.content.show();
        this.author.show();
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public static void main(String[] args){
        Book myBook = new Book();

        Title mytitle = new Title();
        myBook.title = mytitle;

        myBook.show();
    }
}
