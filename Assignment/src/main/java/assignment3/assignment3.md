### Assignment 3

1. Explain polymorphism.
- compile polymorphism happens when there exists overload, deciding call which method at compile time
- run time polymorphism happens when there exists override, deciding call the method from super class or subclass at run time
2. What is overloading?
- overload appears in the one class, two methods must have the same name, and different return type or parameters
3. What is overriding?
- override appears in two or more inheritance relationship classes, and two methods must have the same signature
4. What does the final mean in this method:  public void doSomething(final Car aCar){}
- Java always makes a copy of parameters before sending them to methods. This means the final doesn't mean any difference for the calling code. This only means that inside the method the variables can not be reassigned.
- Note that if you have a final object, you can still change the attributes of the object. This is because objects in Java really are pointers to objects. And only the pointer is copied (and will be final in your method), not the actual object.
5. Suppose in question 4, the Car class has a method setColor(Color color){…}, inside doSomething method, Can we call aCar.setColor(red);?
- yes
6. Can we declare a static variable inside a method?
- no
7. What is the difference between interface and abstract class?
- interface: 1. Normally has only abstract and public methods. Interface has started supporting default and static methods since java 8, which are allowed to be implemented in the interface.
             2. Support multiple inheritance
             3. Only allow static and final variables
             4. Can’t extends an abstract class
- abstract class: 1. Normally has a mixture of abstract and non-abstract methods. These methods can be public / protected / private
                  2. Doesn’t support multiple inheritance
                  3. Allow final, static, and non-static variables
                  4. Can implement an interface
8. Can an abstract class be defined without any abstract methods?
- yes
9. Since there is no way to create an object of abstract class, what’s the point of constructors of abstract class?
- The main purpose of the constructor is to initialize the newly created object. In abstract class, we have an instance variable, abstract methods, and non-abstract methods. We need to initialize the non-abstract methods and instance variables, therefore abstract classes have a constructor.
10. What is a native method?
- The method is implemented in "native" code. That is, code that does not run in the JVM. It's typically written in C or C++.
- Native methods are usually used to interface with system calls or libraries written in other programming languages.
11. What is marker interface?
- A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object.
- A marker interface is also called a tagging interface.
12. Why to override equals and hashCode methods?
- to customize the hashmap in that we want to object that has same content be the same.
13. What’s the difference beween int and Integer?
- int is a primitive data type and Integer is the wrapper class of int, we can create object of Integer
14. What is serialization?
- Serialization is the process of turning an object in memory into a stream of bytes so you can do stuff like store it on disk or send it over the network.
15. Create List and Map. List A contains 1,2,3,4,10(integer) . Map B contains ("a","1") ("b","2") ("c","10")   (key = string, value = string)
       Question: get a list which contains all the elements in list A, but not in map B.
- shown in package question15
16. Implement a group of classes that have common behavior/state as Shape. Create Circle, Rectangle and Square for now as later on we may need more shapes. They should have the ability to calculate the area. They should be able to compare using area. Please write a program to demonstrate the classes and comparison.  You can use either abstract or interface. Comparator or Comparable interface.
- shown in package question16

