package producerconsumer;

public class MainTest {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		ProducerThread producer = new ProducerThread("������", panzi);
		producer.start();
		ConsumerThread consumer = new ConsumerThread("������", panzi);
		consumer.start();
	}
}
