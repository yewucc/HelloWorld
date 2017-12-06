package producerconsumer;

import java.util.Random;

public class ConsumerThread extends Thread {
	private Panzi panzi;

	public ConsumerThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Cake cake = panzi.getcake();
			System.out.println(Thread.currentThread().getName() + "ฯ๛ทัมห" + cake);
			try {
				Thread.sleep(new Random().nextInt(3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
