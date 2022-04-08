package multi_threads_assignment;

public class Vehicle implements Runnable {
    private String id;
    private OneLaneBridge bridge;

    public Vehicle(OneLaneBridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void run() {
        bridge.crossBridge(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
