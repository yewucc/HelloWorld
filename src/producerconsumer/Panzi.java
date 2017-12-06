package producerconsumer;

import java.util.LinkedList;

public class Panzi {
	LinkedList<Cake> list = new LinkedList<Cake>();// 使用linkedlist实现队列操作

	public synchronized void putcake(Cake cake) {
		list.addLast(cake);
		notifyAll();
		System.out.println("蛋糕来啦！");
	}

	public synchronized Cake getcake() {
		while (list.size() == 0) {
			try {
				System.out.println("等一下吧！");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = list.removeFirst();
		return cake;
	}

}
