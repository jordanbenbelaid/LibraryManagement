package com.qa.coresolution;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Book(4, "Code Complete", "Steve McConnell", 960));
        library.addItem(new Magazine(3, "Tech Monthly", 42));

        System.out.println("\n--- All Items ---");
        library.listItems();

        System.out.println("\n--- Search by title 'Code' ---");
        library.searchByTitle("Code");

        System.out.println("\n--- Borrowing Items ---");
        library.borrowItem(1);
        library.borrowItem(3);

        System.out.println("\n--- Available Items ---");
        library.listAvailableItems();

        System.out.println("\n--- Borrowed Items ---");
        library.listBorrowedItems();
    }
}


