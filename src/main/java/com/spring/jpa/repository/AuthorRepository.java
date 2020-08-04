package com.spring.jpa.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.spring.jpa.entity.Author;

public interface AuthorRepository extends BaseRepository<Author,Long> {
	/**
	 * ORDER BY Clause in JPQL Query
	 * @param firstName
	 * @return
	 */
	@Query("FROM Author where firstName = ?1 ORDER BY lastName desc")
	List<Author> findByFirstNameOrderByLastName(@Param("firstName") String firstName);
	
	/**
	 * Add Sort parameter in repository method
	 * Using expression to set Entity Name
	 * @param firstName
	 * @param sort
	 * @return
	 */
	@Query("FROM #{#entityName} where firstName = ?1")
	List<Author> findByFirstName(@Param("firstName") String firstName, Sort sort);
	
	/**
	 * LIKE in JPQL Query
	 * @param firstName
	 * @return
	 */
	@Query("FROM #{#entityName} where UPPER(firstName) LIKE %?#{[0].toUpperCase()}%")
	List<Author> findByFirstNameContainingIgnoreCase(@Param("firstName") String firstName);
	
	/**
	 * Native Query
	 * @param lastName
	 * @return
	 */
	@Query(value="select * from author where last_name = :lastName",nativeQuery = true)
	List<Author> findByLastName(@Param("lastName") String lastName);
	
	/**
	 * Modifying Query
	 * @param dateOfBirth
	 * @param id
	 */
	@Query("UPDATE Author SET dateOfBirth = :dateOfBirth where id = :id")
	@Modifying
	@Transactional
	Integer updateDateOfBirth(
			@DateTimeFormat(iso = ISO.DATE)
			@Param("dateOfBirth")LocalDate dateOfBirth,@Param("id")Long id);
	
	List<Author> findByBooksTitle(@Param("title") String title,Sort sort);
	List<Author> findByBooksTitleContaining(@Param("title") String title);
	List<Author> findByBooksTitleContainingIgnoreCase(@Param("title") String title);
	List<Author> findByBooksTitleOrderByLastNameDesc(@Param("title") String title);
	
}
