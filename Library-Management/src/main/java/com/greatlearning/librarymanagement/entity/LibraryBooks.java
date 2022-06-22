package com.greatlearning.librarymanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryBooks {

    @Id
    private long bookId;
    private String bookName;
    private String author;
    private float cost;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
