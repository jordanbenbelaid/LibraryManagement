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

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }

    // Borrow logic is inside LibraryItem
    public boolean borrowItem() {
        if (isBorrowed) return false;
        isBorrowed = true;
        return true;
    }

    public boolean returnItem() {
        if (!isBorrowed) return false;
        isBorrowed = false;
        return true;
    }

    public abstract String getItemType();
    public abstract String getDescription();

    @Override
    public String toString() { return getDescription(); }
}

