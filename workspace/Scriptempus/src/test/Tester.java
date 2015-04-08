package test;

import java.time.LocalTime;

public class Tester {

	public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        TimeGenerator tg = new TimeGenerator(time.getHour(), time.getMinute());
        System.out.println(tg);
    }


}
