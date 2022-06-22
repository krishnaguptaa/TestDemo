package com.greatlearning.librarymanagement.serviceImpl;

import com.greatlearning.librarymanagement.entity.LibraryBooks;
import com.greatlearning.librarymanagement.repository.BookRepository;
import com.greatlearning.librarymanagement.service.BooksRead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksReadImpl implements BooksRead {

    @Autowired
    BookRepository readRepository;

    @Override
    public List<LibraryBooks> getAllBooks() {
        return readRepository.findAll();
    }

    @Override
    public Optional<LibraryBooks> getBooksById(Long id) {
        return readRepository.findById(id);
    }

    @Override
    public LibraryBooks getBooksByName(String bookName) {
        return null;
    }

    @Override
    public LibraryBooks getBooksByAuthor(String author) {
        return null;
    }

    @Override
    public LibraryBooks getBooksByLastAdded() {
        return null;
    }

    @Override
    public List<LibraryBooks> getBooksByAscendingOrder() {
        return null;
    }
}
