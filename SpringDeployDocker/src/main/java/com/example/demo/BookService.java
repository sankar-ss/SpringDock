package com.example.demo;

import java.util.HashSet;

public interface BookService {
	HashSet<Book> findAllBook();
	Book findBookByID(long id);
	void addBook(Book b);
	void deleteAllData();
}
