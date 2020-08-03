package com.spring.jpa.comparator;

import java.util.Comparator;

import com.spring.jpa.entity.Book;

public class SortByTitle implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getTitle().compareTo(book2.getTitle());
	}

}
