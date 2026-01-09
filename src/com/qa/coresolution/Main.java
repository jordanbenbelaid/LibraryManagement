package com.qa.coresolution;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Magazine(3, "Tech Monthly", 42));

        User alice = new User(1, "Alice", 2);

        System.out.println("\n--- Borrowing Items ---");
        library.borrowItem(1, alice); // Success
        library.borrowItem(1, alice); // Already borrowed
        library.borrowItem(2, alice); // Success
        library.borrowItem(3, alice); // Limit reached

        System.out.println("\n--- Returning Items ---");
        library.returnItem(3, alice); // Not borrowed
        library.returnItem(1, alice); // Success

        System.out.println("\n--- Final Library Status ---");
        library.listItems();
    }
}




