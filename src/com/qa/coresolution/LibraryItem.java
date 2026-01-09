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

    // Borrowing now throws exception
    public void borrowItem() throws ItemAlreadyBorrowedException {
        if (isBorrowed) {
            throw new ItemAlreadyBorrowedException(getTitle() + " is already borrowed.");
        }
        isBorrowed = true;
    }

    // Returning now throws exception
    public void returnItem() throws ItemNotBorrowedException {
        if (!isBorrowed) {
            throw new ItemNotBorrowedException(getTitle() + " was not borrowed.");
        }
        isBorrowed = false;
    }

    public abstract String getItemType();
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}


