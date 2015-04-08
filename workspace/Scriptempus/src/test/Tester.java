package test;

public class Tester {

	public static void main(String[] args) {
        TimeGenerator tg = new TimeGenerator(0, 0);

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 59; j++) {
            	tg = new TimeGenerator(i, j);
                System.out.println(i + ":" + j + " -> " + tg);
            }
        }
    }


}
