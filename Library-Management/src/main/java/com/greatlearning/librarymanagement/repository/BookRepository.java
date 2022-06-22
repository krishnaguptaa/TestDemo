package com.greatlearning.librarymanagement.repository;

import com.greatlearning.librarymanagement.entity.LibraryBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<LibraryBooks, Long> {

}
