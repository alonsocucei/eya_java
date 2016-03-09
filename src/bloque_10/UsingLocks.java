package bloque_10;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author alonsocucei
 */
public class UsingLocks {

    private static LinkedList<Character> chars = new LinkedList<>();
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition isEmpty = lock.newCondition();
    
    public static void main(String[] args) {
        ProducerLock producer = new ProducerLock(chars, lock, isEmpty);
        Thread producerThread = new Thread(producer);
        ConsumerLock consumer = new ConsumerLock(chars, lock, isEmpty);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

class ProducerLock implements Runnable {

    private LinkedList<Character> buffer;
    private Lock lock;
    private Condition condition;

    public ProducerLock(LinkedList<Character> buffer, Lock lock, Condition condition) {
        this.buffer = buffer;
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        while (true) {
            char randomChar = (char) (Math.random() * ('z' - 'a') + 'a');
            lock.lock();
            condition.signal();
            buffer.offer(randomChar);
            System.out.printf("Producing element: %s\n", randomChar);
            lock.unlock();

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerLock implements Runnable {

    private LinkedList<Character> buffer;
    private Lock lock;
    private Condition condition;

    public ConsumerLock(LinkedList<Character> buffer, Lock lock, Condition condition) {
        this.buffer = buffer;
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        while (true) {
            lock.lock();
            if (buffer.size() == 0) {
                try {
                    condition.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            char consumedChar = buffer.poll();
            System.out.printf("Consuming element: %s\n", consumedChar);
            lock.unlock();
            
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}