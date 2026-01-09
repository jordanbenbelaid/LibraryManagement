package com.qa.coresolution;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        for (LibraryItem existingItem : items) {
            if (existingItem.getId() == item.getId()) {
                System.out.println("Cannot add item: ID " + item.getId() + " already exists.");
                return;
            }
        }
        items.add(item);
        System.out.println("Item added successfully: " + item);
    }

    public void listItems() {
        for (LibraryItem item : items) {
            String status = item.isBorrowed() ? "Borrowed" : "Available";
            System.out.println(item + " - " + status);
        }
    }

    // Borrow an item for a specific user
    public void borrowItem(int id, User user) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                user.borrowItem(item); // Delegates logic to User class
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Return an item for a specific user
    public void returnItem(int id, User user) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                user.returnItem(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }
}



