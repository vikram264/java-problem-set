package com.examples.io.lockcondition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	private static final int CAPACITY = 5;
    private final List<String> list = new ArrayList<>();
    

    // lock and condition variables
    private final Lock aLock = new ReentrantLock();
    private final Condition notEmpty = aLock.newCondition();
    private final Condition notFull = aLock.newCondition();
 
    
    
    
    public void put(String e) throws InterruptedException {
        aLock.lock();
        try {
            while (list.size() == CAPACITY) {
                System.out.println(Thread.currentThread().getName()
                        + " : Buffer is full, waiting");
                notFull.await();
            }

           // int number = theRandom.nextInt();
            boolean isAdded = list.add(e);
            if (isAdded) {
                System.out.printf("%s added %s into list %n", Thread
                        .currentThread().getName(), e);

                // signal consumer thread that, buffer has element now
                System.out.println(Thread.currentThread().getName()
                        + " : Signalling that buffer is no more empty now");
                notEmpty.signalAll();
            }
        } finally {
            aLock.unlock();
        }
    }
    
    
    public void get() throws InterruptedException {
    	
        aLock.lock();
        try {
            while (list.size() == 0) {
                System.out.println( Thread.currentThread().getName()
                        + " : Buffer is empty, waiting");
                notEmpty.await();
            }

            String value = list.get(0);
            Thread.sleep(2000L);
            boolean isRemoved = list.remove(value);
            if (value != null && isRemoved) {
                System.out.printf("%s consumed %s from queue %n", Thread
                        .currentThread().getName(), value);

                // signal producer thread that, buffer may be empty now
                System.out.println(Thread.currentThread().getName()
                        + " : Signalling that buffer may be empty now");
          
                notFull.signalAll();
            }

        } finally {
            aLock.unlock();
        }
    }
}
