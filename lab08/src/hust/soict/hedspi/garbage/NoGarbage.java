package hust.soict.hedspi.garbage;

import java.util.Random;

public class NoGarbage {

	public static void main(String[] args) {
		Random r = new Random(123);
		String s = "";	
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < 65536 ; i++)
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis()-start);
	}

}
