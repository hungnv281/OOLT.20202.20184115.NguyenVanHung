package lab3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
		assertTrue(md.print().equals("12 Mar 2021"));
	}
}
