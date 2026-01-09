package com.qa.coresolution;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void listItems() {
        for (LibraryItem item : items) {
            String status = item.isBorrowed() ? "Borrowed" : "Available";
            System.out.println(item.getDescription() + " - " + status);
        }
    }

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
}
