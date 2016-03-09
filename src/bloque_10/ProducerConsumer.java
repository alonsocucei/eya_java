package bloque_10;

import java.util.LinkedList;

/**
 * @author alonsocucei
 */
public class ProducerConsumer {
    private static LinkedList<Character> chars = new LinkedList<>();
    
    public static void main(String[] args) {
        Producer producer = new Producer(chars);
        Thread producerThread = new Thread(producer);
        Consumer consumer = new Consumer(chars);
        Thread consumerThread = new Thread(consumer);
        
        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private LinkedList<Character> buffer;
    public Producer(LinkedList<Character> buffer) {
        this.buffer = buffer;
    }
    
    public void run() {
        while(true) {
            char randomChar = (char) (Math.random() * ('z' - 'a') + 'a');
            
//            synchronized(buffer) {
//                buffer.notify();
                buffer.offer(randomChar);
                System.out.printf("Producing element: %s\n", randomChar);
//            }
            
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private LinkedList<Character> buffer;
    public Consumer(LinkedList<Character> buffer) {
        this.buffer = buffer;
    }
    
    public void run() {
        while(true) {
//            synchronized(buffer) {
//                if (buffer.size() == 0) {
//                    try {
//                        buffer.wait();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
                
                char consumedChar = buffer.poll();
                System.out.printf("Consuming element: %s\n", consumedChar);
//            }
            
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * To check:
 * - How can NullPointerException be avoided?
 * - Why synchronized blocks didn't solve the problem?
 * - What's the condition to call wait and notify methods?
 */