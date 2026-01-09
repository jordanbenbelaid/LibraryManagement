package com.qa.coresolution;

public class Magazine extends LibraryItem {

    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public String getDescription() {
        return this.toString(); // Optional: delegate to toString
    }

    @Override
    public String toString() {
        return getItemType() + ": " + getTitle() + " (Issue " + issueNumber + ")";
    }
}
