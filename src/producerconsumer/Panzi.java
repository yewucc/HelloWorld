package producerconsumer;

import java.util.LinkedList;

public class Panzi {
	LinkedList<Cake> list = new LinkedList<Cake>();// ʹ��linkedlistʵ�ֶ��в���

	public synchronized void putcake(Cake cake) {
		list.addLast(cake);
		notifyAll();
		System.out.println("����������");
	}

	public synchronized Cake getcake() {
		while (list.size() == 0) {
			try {
				System.out.println("��һ�°ɣ�");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = list.removeFirst();
		return cake;
	}

}
