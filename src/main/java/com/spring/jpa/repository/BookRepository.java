package com.spring.jpa.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import com.spring.jpa.entity.Book;

public interface BookRepository extends BaseRepository<Book, Long> {
	Page<Book> findByAuthorsFirstNameAndAuthorsLastName(@Param("firstName")String firstName,@Param("lastName")String lastName,Pageable pageable);
	
	List<Book> findFirst5ByAuthorsFirstNameAndAuthorsLastName(@Param("firstName")String firstName,@Param("lastName")String lastName);
}
