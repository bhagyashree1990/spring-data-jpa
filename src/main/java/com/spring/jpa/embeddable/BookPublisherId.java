package com.spring.jpa.embeddable;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BookPublisherId implements Serializable {
	private Long bookId;
	
	private Long publisherId;

	public BookPublisherId() {
		super();
	}

	public BookPublisherId(Long bookId, Long publisherId) {
		super();
		this.bookId = bookId;
		this.publisherId = publisherId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((publisherId == null) ? 0 : publisherId.hashCode());
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
		BookPublisherId other = (BookPublisherId) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId)) {
			return false;
		}
		if (publisherId == null) {
			if (other.publisherId != null)
				return false;
		} else if (!publisherId.equals(other.publisherId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "BookPublisherId [bookId=" + bookId + ", publisherId=" + publisherId + "]";
	}

	public Long getBookId() {
		return bookId;
	}
	
	public Long getPublisherId() {
		return publisherId;
	}
}
