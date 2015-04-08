package test;

import java.time.LocalTime;

public class Tester {

	public static void main(String[] args) {
		TimeGenerator tg = new TimeGenerator(LocalTime.now());
		System.out.println(tg);
	}

}
