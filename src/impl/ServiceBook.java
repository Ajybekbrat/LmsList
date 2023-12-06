package impl;


import models.Book;

import java.util.ArrayList;

public interface ServiceBook {
    Book saveBook(Long libraryId,Book book);

    ArrayList<String> getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);

}
