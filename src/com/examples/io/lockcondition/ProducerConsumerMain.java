package com.examples.io.lockcondition;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer pc = new ProducerConsumer();
		Producer p = new Producer(pc);
		p.setName("producer thread");
		Consumer c = new Consumer(pc);
		c.setName("consumer thread");

		p.start();

		c.start();
	
	}

}
