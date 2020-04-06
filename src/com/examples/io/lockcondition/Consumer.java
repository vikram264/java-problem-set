package com.examples.io.lockcondition;

public class Consumer extends Thread {

	ProducerConsumer pc;

	public Consumer(ProducerConsumer sharedObject) {
		super("CONSUMER");
		this.pc = sharedObject;
	}

	@Override
	public void run() {
		for(;;) {
		try {
			pc.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		}

	}

}
