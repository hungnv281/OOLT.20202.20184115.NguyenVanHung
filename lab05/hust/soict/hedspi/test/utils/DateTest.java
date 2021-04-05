package hust.soict.hedspi.test.utils;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import hust.soict.hedspi.aims.utils.MyDate;

class DateTest {

	@Test
	void test() {
		MyDate md = new MyDate();
		md.setString("june 15th 2018");
		assertTrue(md.accept().equals("15 6 2018"));
		//System.exit(0);
	}
	
	@Test
	void test1() {
		MyDate md = new MyDate();
		assertTrue(md.print1().equals("12 Mar 2021"));
	}
}
