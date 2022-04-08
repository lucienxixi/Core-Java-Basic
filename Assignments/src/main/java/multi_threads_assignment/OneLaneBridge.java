package multi_threads_assignment;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class OneLaneBridge {
    private final Semaphore sema;

    public OneLaneBridge() {
        sema = new Semaphore(1);
    }

    public void crossBridge(Vehicle vehicle) {
        try {
            System.out.println(vehicle.getId() + " is WAITING to cross the bridge.");
            sema.acquire();
            System.out.println(vehicle.getId() + " is CROSSING the bridge.");
            TimeUnit.SECONDS.sleep((long)(Math.random() * 10));
        } catch(InterruptedException iex) {
            iex.printStackTrace();
        } finally {
            System.out.println(vehicle.getId() + " has FINISHED CROSSING the bridge.");
            sema.release();
        }
    }
}
