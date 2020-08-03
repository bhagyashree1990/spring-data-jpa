package com.spring.jpa.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.spring.jpa.embeddable.BookPublisherId;
import com.spring.jpa.enumeration.Format;

@Entity
public class BookPublisher {
	@EmbeddedId
	private BookPublisherId id;
	
	@Enumerated(EnumType.STRING)
	private Format format;
	
	@ManyToOne
	@JoinColumn(name="book_id",foreignKey = @ForeignKey(name="book_publisher_fk_1"))
	@MapsId("bookId")
	private Book book;
	
	@ManyToOne
	@JoinColumn(name = "publisher_id",foreignKey = @ForeignKey(name="book_publisher_fk_2"))
	@MapsId("publisherId")
	private Publisher publisher;

	@Temporal(TemporalType.DATE)
	private Date dateOfPublishing;
	
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
		BookPublisher other = (BookPublisher) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public BookPublisherId getId() {
		return id;
	}

	public void setId(BookPublisherId id) {
		this.id = id;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public Date getDateOfPublishing() {
		return dateOfPublishing;
	}
	
	public void setDateOfPublishing(Date dateOfPublishing) {
		this.dateOfPublishing = dateOfPublishing;
	}
}
