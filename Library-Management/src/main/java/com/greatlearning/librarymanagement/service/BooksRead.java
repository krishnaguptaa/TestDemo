package com.greatlearning.librarymanagement.service;

import com.greatlearning.librarymanagement.entity.LibraryBooks;

import java.util.List;
import java.util.Optional;

public interface BooksRead {
    List<LibraryBooks> getAllBooks();

    Optional<LibraryBooks> getBooksById(Long id);

    public LibraryBooks getBooksByName(String bookName);

    public LibraryBooks getBooksByAuthor(String author);

    public LibraryBooks getBooksByLastAdded();

    List<LibraryBooks> getBooksByAscendingOrder();



}
