package hello;

public class EvenThread extends Thread {
	@Override
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("ż����" + i);
		}
	}
}
