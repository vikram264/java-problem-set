package com.examples.io.lockcondition;

import java.util.Random;

public class Producer extends Thread {
	ProducerConsumer pc;

	public Producer(ProducerConsumer pc) {
		super("PRODUCER");
		this.pc = pc;
	}

	@Override
	public void run() {
		
		String [] strings = {"a","b","c","d","e","f","g","h"};
		for (;;) {
			Random random =  new Random();
			int i = random.nextInt(strings.length);
		try {
			pc.put(strings[i]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
