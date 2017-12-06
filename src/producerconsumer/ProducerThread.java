package producerconsumer;

import java.util.Random;

public class ProducerThread extends Thread {
	private Panzi panzi;

	public ProducerThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Cake cake = new Cake("no." + i);
			System.out.println(Thread.currentThread().getName() + "Éú²úÁË" + cake);
			panzi.putcake(cake);
			try {
				Thread.sleep(new Random().nextInt(3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
