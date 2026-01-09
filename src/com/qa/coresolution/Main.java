package com.qa.coresolution;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add items
        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Book(4, "Code Complete", "Steve McConnell", 960));
        library.addItem(new Magazine(3, "Tech Monthly", 42));

        // Users
        User alice = new User(1, "Alice", 2);
        User bob = new User(2, "Bob", 3);

        System.out.println("\n--- Borrowing Items ---");
        library.borrowItem(1, alice); // Alice borrows 1984
        library.borrowItem(2, alice); // Alice borrows Clean Code
        library.borrowItem(4, alice); // Alice reaches limit
        library.borrowItem(3, bob);   // Bob borrows Tech Monthly
        library.borrowItem(4, bob);   // Bob borrows Code Complete

        System.out.println("\n--- Library Status ---");
        library.listItems();

        System.out.println("\n--- Returning Items ---");
        library.returnItem(1, alice);
        library.returnItem(3, alice); // Not Alice's item
        library.returnItem(4, bob);

        System.out.println("\n--- Library Status After Returns ---");
        library.listItems();
    }
}



