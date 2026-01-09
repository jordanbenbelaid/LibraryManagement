package com.qa.coresolution;

public class Book extends LibraryItem {

    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getDescription() {
        return this.toString(); // Optional: delegate to toString
    }

    @Override
    public String toString() {
        return getItemType() + ": " + getTitle() + " by " + author + " (" + pages + " pages)";
    }
}

