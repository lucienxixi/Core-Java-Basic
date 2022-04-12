### Assignment 4

1. What’s the difference between final, finally? What is finalize()? 
- final is a reserved keyword in Java, it can be used for class, method and variable
- finally is used in java exception handling, normally placed after the catch block. It will always be executed no matter if the exception is
  handled or not. 
- finalize() performs cleanup before objects are being destroyed.

2. What’s the difference between throw and throws?
- The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.
3. What are the two types of exceptions?
- checked exceptions and unchecked exceptions
4. What is error in java?
- In Java, an error is a subclass of Throwable that tells that something serious problem is existing and a reasonable Java application should not try to catch that error. Generally, it has been noticed that most of the occurring errors are abnormal conditions and cannot be resolved by normal conditions. As these errors are abnormal conditions and should not occur, thus, error and its subclass are referred to as Unchecked Exceptions. In Java, we have the concept of errors as well as exceptions. Thus there exist several differences between an exception and an error. Errors cannot be solved by any handling techniques, whereas we can solve exceptions using some logic implementations. So, when an error occurs, it causes termination of the program as errors cannot try to catch.
  https://www.javatpoint.com/java-error
5. Exception is object, true or false?
- true
6. Can a finally block exist with a try block but without a catch?
- yes
7. From java 1.7, give an example of the try-resource feature.
   https://www.baeldung.com/java-try-with-resources
8. What will happen to the Exception object after exception handling?
- The Exception object will be garbage collected in the next garbage collection.
9. Can we use String as a condition in switch(str){} clause?
- after java7, yes
10. What’s the difference between ArrayList, LinkedList and vector? 
- ArrayList: dynamic array, has index, continuous memory, better performance for the searching, lower performance for the operations of delete, modify, add
- LinkedList: list node, has no index, non-continuous memory, better performance for the operations of delete, modify, add, lower performance of searching
12. What’s the difference between hashTable and hashMap?
- hashMap: the methods in hashMap are not synchronized, not suitable for multi-thread application, not thread safe. it allows only one null key and any number of null value. better performance 
- hashtable: the methods in hashMap are synchronized, suitable for multi-thread application, thread safe. it does not allow any null key and value. lower performance

12.What is static import?
- In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members of a class directly without class name or any object.
  https://www.geeksforgeeks.org/static-import-java/

13. What is static block?
- In a Java class, a static block is a set of instructions that is run only once when a class is loaded into memory. A static block is also called a static initialization block. This is because it is an option for initializing or setting up the class at run-time.
  https://www.geeksforgeeks.org/static-blocks-in-java/

14. Explain the keywords: default(java 1.8), break, continue, synchronized, strictfp, transient, volatile, instanceOf 
- default: we can add the default implementation for the new method by using the default keyword before the method implementation.
- break: A control statement for breaking out of loops.
- continue: Sends control back outside a loop
- synchronized: Specifies critical sections or methods in multithreaded code
- strictfp: A Java keyword is used to restrict the precision and rounding of floating-point calculations to ensure portability
- transient: Specifies that a variable is not part of an object’s persistent state
- volatile: volatile variable become visible that allows multiple threads to access the variable in the main memory
- instanceOf: Indicates whether an object is an instance of a specific class or implements an interface

15. Create a program including two threads – thread read and thread write.
    Input file ->Thread read -> Calculate -> buffered area Buffered area -> Thread write -> output file
    Detailed description is in assignment4.txt file. Sample input.txt file.
    Attached files are input.txt and a more detailed description file.
- shown in package question15