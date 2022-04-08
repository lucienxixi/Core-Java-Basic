package multi_threads_assignment;

public class CrossingDemo {
    public void demo() {
        final OneLaneBridge bridge = new OneLaneBridge();
        Thread wThread = new Thread(new WestBound(bridge));
        Thread eThread = new Thread(new EastBound(bridge));
        wThread.start();
        eThread.start();
    }
}
