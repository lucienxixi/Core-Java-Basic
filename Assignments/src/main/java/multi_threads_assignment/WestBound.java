package multi_threads_assignment;

import java.util.concurrent.TimeUnit;

public class WestBound implements Runnable {
    private OneLaneBridge bridge;

    public WestBound(OneLaneBridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void run() {
        while (true) {
            Vehicle vehicle = new Vehicle(bridge);
            Thread a = new Thread(vehicle);
            vehicle.setId("westbound side Vehicle id " + a.getId());
            a.start();
            try{
                TimeUnit.SECONDS.sleep((long)(Math.random() * 10));
            } catch(InterruptedException iex) {
                iex.printStackTrace();
            }
        }
    }
}
