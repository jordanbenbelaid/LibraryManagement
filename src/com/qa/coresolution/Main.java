package com.qa.coresolution;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Magazine(3, "Tech Monthly", 42));

        // Try duplicate ID
        library.addItem(new Book(2, "Duplicate Book", "Author X", 123));

        System.out.println("\nCurrent Library:");
        library.listItems();

        library.borrowItem(1);
        library.borrowItem(3);

        System.out.println("\nAfter Borrowing:");
        library.listItems();

        library.returnItem(1);

        System.out.println("\nAfter Returning:");
        library.listItems();
    }
}

