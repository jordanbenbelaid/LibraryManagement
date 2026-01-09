package com.qa.coresolution;

public abstract class LibraryItem {

    private int id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }

    public void returnItem() {
        isBorrowed = false;
    }

    public abstract String getItemType();

    public abstract String getDescription();
}
