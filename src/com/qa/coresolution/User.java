package com.qa.coresolution;

import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private ArrayList<LibraryItem> borrowedItems;
    private int borrowLimit;

    public User(int id, String name, int borrowLimit) {
        this.id = id;
        this.name = name;
        this.borrowLimit = borrowLimit;
        this.borrowedItems = new ArrayList<>();
    }

    public String getName() { return name; }

    // Borrow item with exception handling
    public void borrowItem(LibraryItem item) throws BorrowLimitExceededException, ItemAlreadyBorrowedException {
        if (borrowedItems.size() >= borrowLimit) {
            throw new BorrowLimitExceededException(name + " has reached the borrow limit of " + borrowLimit);
        }
        item.borrowItem(); // May throw ItemAlreadyBorrowedException
        borrowedItems.add(item);
        System.out.println(name + " successfully borrowed: " + item);
    }

    // Return item with exception handling
    public void returnItem(LibraryItem item) throws ItemNotBorrowedException {
        if (!borrowedItems.contains(item)) {
            throw new ItemNotBorrowedException(name + " did not borrow " + item.getTitle());
        }
        item.returnItem(); // May throw ItemNotBorrowedException
        borrowedItems.remove(item);
        System.out.println(name + " successfully returned: " + item);
    }
}



