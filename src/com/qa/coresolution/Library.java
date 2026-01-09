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

    private LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    // Borrow with try/catch
    public void borrowItem(int id, User user) {
        LibraryItem item = findItemById(id);
        if (item == null) {
            System.out.println("Item not found.");
            return;
        }
        try {
            user.borrowItem(item);
        } catch (BorrowLimitExceededException | ItemAlreadyBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }

    // Return with try/catch
    public void returnItem(int id, User user) {
        LibraryItem item = findItemById(id);
        if (item == null) {
            System.out.println("Item not found.");
            return;
        }
        try {
            user.returnItem(item);
        } catch (ItemNotBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }
}





