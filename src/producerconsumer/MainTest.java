package producerconsumer;

public class MainTest {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		ProducerThread producer = new ProducerThread("生产者", panzi);
		producer.start();
		ConsumerThread consumer = new ConsumerThread("消费者", panzi);
		consumer.start();
	}
}
