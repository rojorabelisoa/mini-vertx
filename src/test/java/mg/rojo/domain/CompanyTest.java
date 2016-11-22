package mg.rojo.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CompanyTest {
	@Test
	public void getBrandTest() {
		Company c = new Company("Apple", 1990);
		assertEquals("Apple", c.getBrand());
	}
	@Test(expected = IllegalAccessError.class)
	public void getYearNegativeTest() {
		new Company("Microsoft", -1980);
		fail("Number format error !! ");
	}
	@Test(expected = IllegalAccessError.class)
	public void getYearZeroTest() {
		new Company("Microsoft", 0);
		fail("Number format error !! ");
	}

}
