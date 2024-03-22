package in.mastanIt;

public class Demo3 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 11; i <=20; i++) {
				System.out.println(i);
			}

		};
		runnable.run();
	}

}
