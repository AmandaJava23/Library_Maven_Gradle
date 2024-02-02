package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(2, "Min bok", "Amanda Vasilis", "1234512345123", "Sci-fi", 250);
		Book book2 = new Book(2, "Min bok", "Amanda Vasilis", "1234512345123", "Sci-fi", 250);

		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book3 = new Book(2, "Min bok", "Amanda Vasilis", "1234512345123", "Sci-fi", 250);
		Book book4 = new Book(4, "Min bok", "Amanda Vasilis", "1234512345123", "Sci-fi", 250);
		assertNotEquals(book4, book3);
	}

}
