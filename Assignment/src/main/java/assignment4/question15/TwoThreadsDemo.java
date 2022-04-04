package assignment4.question15;

public class TwoThreadsDemo {
    public void demo() throws InterruptedException {
        Reader reader = new Reader();
        Thread thread1 = new Thread(reader);
        Writer writer = new Writer();
        Thread thread2 = new Thread(writer);
        thread1.start();
        thread1.join();
        writer.fileString = reader.fileString;
        thread2.start();
    }
}