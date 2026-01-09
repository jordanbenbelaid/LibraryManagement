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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Attempt to borrow an item
    public boolean borrowItem(LibraryItem item) {
        if (borrowedItems.size() >= borrowLimit) {
            System.out.println(name + " has reached the borrow limit of " + borrowLimit + " items.");
            return false;
        }

        if (!item.borrowItem()) {
            System.out.println(item.getTitle() + " is already borrowed.");
            return false;
        }

        borrowedItems.add(item);
        System.out.println(name + " successfully borrowed: " + item);
        return true;
    }

    // Return an item
    public boolean returnItem(LibraryItem item) {
        if (!borrowedItems.contains(item)) {
            System.out.println(name + " did not borrow " + item.getTitle() + ".");
            return false;
        }

        item.returnItem();
        borrowedItems.remove(item);
        System.out.println(name + " successfully returned: " + item);
        return true;
    }
}

