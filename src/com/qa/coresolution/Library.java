package com.qa.coresolution;

import java.util.ArrayList;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    // Add new item with unique ID validation
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

    // Borrow an item by ID
    public void borrowItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                if (item.borrowItem()) {
                    System.out.println("Item borrowed successfully.");
                } else {
                    System.out.println("Item is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Return an item by ID
    public void returnItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                if (item.returnItem()) {
                    System.out.println("Item returned successfully.");
                } else {
                    System.out.println("Item was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // --- Extension 4: Search Features ---

    // Search items by partial title (case-insensitive)
    public void searchByTitle(String query) {
        System.out.println("Search results for: \"" + query + "\"");
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase())) {
                String status = item.isBorrowed() ? "Borrowed" : "Available";
                System.out.println(item + " - " + status);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found.");
        }
    }

    // List only available items
    public void listAvailableItems() {
        System.out.println("Available items:");
        boolean found = false;
        for (LibraryItem item : items) {
            if (!item.isBorrowed()) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available items.");
        }
    }

    // List only borrowed items
    public void listBorrowedItems() {
        System.out.println("Borrowed items:");
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.isBorrowed()) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No borrowed items.");
        }
    }
}


