package hello;

import org.junit.Test;

public class ThreadTest {
	public static void main(String[] args) {
//		EvenThread even = new EvenThread();
//		even.start();
//		OddThread odd = new OddThread();
//		odd.start();
		
		NumThread even = new NumThread("ż���߳�",2);
		even.start();
		NumThread odd = new NumThread("�����߳�",1);
		odd.start();
		System.out.println("���߳�:" + Thread.currentThread().getName());
	}
	
	@Test
	public void testRunable(){
		MyRunable runable = new MyRunable();
		Thread th = new Thread(runable);
		th.start();
		
	}
}
