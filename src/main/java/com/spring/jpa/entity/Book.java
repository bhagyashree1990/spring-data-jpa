package com.spring.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

@Entity
public class Book implements Comparable<Book>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	@OneToOne(mappedBy = "book")
	private Manuscript manuscript;
	
	@OneToMany(mappedBy = "book")	
	private List<Review> reviews=new ArrayList<>();

	@ManyToMany
	@JoinTable(name="book_author",
				joinColumns = {@JoinColumn(name="book_id", foreignKey = @ForeignKey(name="book_author_fk_1"))},
				inverseJoinColumns = {@JoinColumn(name="author_id",foreignKey = @ForeignKey(name="book_author_fk_2"))}
			)
	@OrderBy("dateOfBirth DESC")
	private List<Author> authors=new ArrayList<>();
	
	@OneToMany(mappedBy = "book")
	private List<BookPublisher> bookPublishers;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Manuscript getManuscript() {
		return manuscript;
	}
	
	public void setManuscript(Manuscript manuscript) {
		this.manuscript = manuscript;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Author> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	public List<BookPublisher> getBookPublishers() {
		return bookPublishers;
	}
	
	public void setBookPublishers(List<BookPublisher> bookPublishers) {
		this.bookPublishers = bookPublishers;
	}
	
	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (title != null && !title.trim().isEmpty())
			result += "title: " + title;
		return result;
	}

	@Override
	public int compareTo(Book book) {
		return this.id.compareTo(book.getId());
	}	
	
}
