package mg.rojo.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void getNameTest() {
		Date today = new Date();
		Company c = new Company("CEO", 2011);
		Person person = new Person("George", "Bush", true, today, c);
		assertEquals("Bush", person.getLastName());
		
	}
	@Test(expected = NullPointerException.class)
	public void testNameNull() {
		Date today = new Date();
		Company c = new Company("MIA", 2012);
		new Person("Steeve", null, true, today, c);
		fail("Name is null !! ");
	}
	@Test(expected = NullPointerException.class)
	public void testDateNull() {
		Date today = new Date();
		Company c = new Company("MIA", 2012);
		new Person("Carter", "C.", true, null, c);
		fail("Name is null !! ");
	}
	@Test(expected = NullPointerException.class)
	public void testCompanyNull() {
		Date today = new Date();
		new Person("Carter", "C.", true, today, null);
		fail("Name is null !! ");
	}
	@Test
	public void testPersonEquals() {
		Date today = new Date();
		Company c = new Company("MIA", 2012);
		Person p1 = new Person("Carter", "C.", true, today, c);
		Person p2 = new Person("John", "S.", true, today, c);
		assertFalse(p1.equals(p2));
	}
	@Test
	public void testPersonHashCode() {
		Date today = new Date();
		Company c = new Company("MIA", 2012);
		Person p1 = new Person("Carter", "C.", true, today, c);
		Person p2 = new Person("John", "S.", true, today, c);
		assertFalse(p1.hashCode() == p2.hashCode());
	}
		
	

}
