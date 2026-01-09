package com.qa.coresolution;

import java.util.ArrayList;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    // Add item with unique ID check
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

    // List all items
    public void listItems() {
        for (LibraryItem item : items) {
            String status = item.isBorrowed() ? "Borrowed" : "Available";
            System.out.println(item + " - " + status);
        }
    }

    // --- Delegated borrowing & returning ---
    public void borrowItem(int itemId, User user) {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            user.borrowItem(item); // Delegated
        } else {
            System.out.println("Item not found.");
        }
    }

    public void returnItem(int itemId, User user) {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            user.returnItem(item); // Delegated
        } else {
            System.out.println("Item not found.");
        }
    }

    // Helper: find item by ID
    private LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }
}




