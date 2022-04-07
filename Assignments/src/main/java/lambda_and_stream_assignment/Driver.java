package lambda_and_stream_assignment;

public class Driver {
    public static void main(String[] args) {
        Demo demoObj = new Demo();
        demoObj.demo1();
        demoObj.demo2();
        demoObj.demo3();
        demoObj.demo4();
    }
}


/*
console output:

input list:
[peter, 18, male, michael, 26, male, ann, 23, female, amy, 25, female]
output list:
[ann, amy]

input list:
[11, 32, 53, 14, 25, 36, 72, 81]
output list:
[o11, e32, o53, e14, o25, e36, e72, o81]

input list:
[22, 21, 43, 56, 76, 88, 91, 12]
output list:
51.125

input list:
[apple, banana, orange, melon]
output list:
[APPLE, BANANA, ORANGE, MELON]

 */
