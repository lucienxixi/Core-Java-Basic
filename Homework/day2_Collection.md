### Comparator, Comparable
1. Comparable
- java.lang.Comparable interface
- inside comparing, a comparable object is capable of comparing itself with another object, The class itself must implement Comprable interface to compare its object
- override the compareTo method
- we can customize only one sorting rule for the same class

2. Comparator
- java.util.Comparator interface
- external comparing, Comparator is external to the object type we are comparing. It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members, anonymous class works as well.
- override the compare method
- has @FunctionalInterface annotation, so we can override compare method in the lambda expression
- we can customize more sorting rule by create multiple class that implements Comparator Interface


### Map
HashTable vs HashMap vs ConcurrentHashMap
- https://www.geeksforgeeks.org/concurrenthashmap-in-java/#:~:text=In%20ConcurrentHashMap%2C%20at%20a%20time,Segment%20locking%20or%20bucket%20locking.
- https://www.javatpoint.com/hashmap-vs-concurrenthashmap-in-java
- https://www.geeksforgeeks.org/difference-between-concurrenthashmap-hashtable-and-synchronized-map-in-java/
- https://stackoverflow.com/questions/56527417/difference-between-bucket-level-lock-and-segment-level-lock-in-concurrenthashmap

TreeMap
LinkedHashMap


### Collection
#### List
LinkedList
ArrayList
Vector
Stack 
#### Queue
LinkedList
ArrayDeque
PriorityQueue(heap)
#### Set
HashSet
LinkedHashSet
TreeSet