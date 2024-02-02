package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	Customer customer = new Customer("Mrs", "Amanda", "", "", "", "", 1, GenderType.FEMALE);
	Book book = new Book(4,"Lisas bok", "Lisa", "", "", 0);
	Loan loan = new Loan(1, customer, book);
	LocalDate localDate = LocalDate.now();


	//VG
	@Test
	public void testDueDate() {
		assertEquals(localDate.plusDays(14), loan.getDueDate());
		assertNotEquals(localDate.plusDays(13), loan.getDueDate());
   }
}