package multi_threads_assignment;

public class Driver {
    public static void main(String[] args) {
        CrossingDemo demoObj = new CrossingDemo();
        demoObj.demo();
    }
}


/*
console ouput:
eastbound side Vehicle id 15 is WAITING to cross the bridge.
westbound side Vehicle id 14 is WAITING to cross the bridge.
eastbound side Vehicle id 15 is CROSSING the bridge.
eastbound side Vehicle id 16 is WAITING to cross the bridge.
eastbound side Vehicle id 15 has FINISHED CROSSING the bridge.
westbound side Vehicle id 18 is WAITING to cross the bridge.
westbound side Vehicle id 18 is CROSSING the bridge.
westbound side Vehicle id 18 has FINISHED CROSSING the bridge.
westbound side Vehicle id 14 is CROSSING the bridge.
eastbound side Vehicle id 19 is WAITING to cross the bridge.
westbound side Vehicle id 14 has FINISHED CROSSING the bridge.
eastbound side Vehicle id 16 is CROSSING the bridge.
eastbound side Vehicle id 20 is WAITING to cross the bridge.
eastbound side Vehicle id 21 is WAITING to cross the bridge.
westbound side Vehicle id 22 is WAITING to cross the bridge.
westbound side Vehicle id 23 is WAITING to cross the bridge.
eastbound side Vehicle id 24 is WAITING to cross the bridge.
eastbound side Vehicle id 25 is WAITING to cross the bridge.
 */
