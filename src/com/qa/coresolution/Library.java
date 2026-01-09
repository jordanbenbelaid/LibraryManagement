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
                item.borrowItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void returnItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
