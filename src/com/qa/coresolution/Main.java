package com.qa.coresolution;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Magazine(3, "Tech Monthly", 42));

        // Attempt to add a duplicate ID
        library.addItem(new Book(2, "Duplicate Book", "Author X", 123));

        System.out.println("\nCurrent Library:");
        library.listItems();
    }
}
