package assignment2.question16;

public class Demo {
    public void demo() {
        Criteria criteria = new Criteria("/Users/liuanxi/Desktop/Core-Java-Basic/Assignments/src/main/java", true, "java");
        FileCounter counter = new FileCounter();
        counter.count(criteria);
    }
}
