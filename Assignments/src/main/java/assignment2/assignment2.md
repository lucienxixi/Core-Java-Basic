### Assignment 2

1. Why we need packages in java?
- Packages are used in Java in order to prevent naming conflicts, to control access, to make searching/locating and usage of classes, interfaces, enumerations and annotations easier.
2. What is the default imported package?
- java.lang
3. What is Class? What is Object?
- A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components
- A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state
4. Why we need constructor?
- To create object of a class(to instantiate an object)
5. What is the default value of local variable? What is the default value of instance variable?
- The local variables are not initialized to any default values. We should
  not use local variables without initialization. Even the java compiler
  throws error.
- The default value of instance variable: 
```java
Object = null
boolean = false
byte = (byte)0
short = (short)0
int = 0
double = 0.0d
float = 0.0f
long = 0l
char = \u0000
```
6. What is garbage collection?
- Garbage collection is to free up the memory space occupied by the unnecessary and unreachable objects during the Java program execution by deleting those unreachable objects.
  This ensures that the memory resource is used efficiently, but it provides no guarantee that there would be sufficient memory for the program execution.
7. The protected data can be accessed by subclasses or same package. True or false?
- True
8. What is immutable class?
- Immutable class in java means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
- immutable class：
  final class，
  private final fields，
  no setter，
  return deep copy of the collections for getter，

9. What’s the difference between “==” and equals method?
- "==" is the comparison operator, it can compare the value of the primitive data type, and compare the reference of the reference data type
- equals method is the method in the Object class, it can only be used for comparing the reference data type. In default, it compares the reference, and we can override this method to compare the content of two objects. 
10. What is wrapper class?
- A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.
- Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
11. What is autoboxing?
- Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
12. StringBuilder is threadsafe but slower than StringBuffer, true or false?
- false
13. Constructor can be inherited, true or false?
- false
14. How to call a super class’s constructor?
- use super keyword
15. Which class is the super class of all classes?
- Object class
16. Create a program to count how many files/folders are there inside one folder.
- the count method should take a parameter called Criteria like this: count(Criteria criteria){}
- For Criteria class, multiple conditions should be included such as: folder path, includeSubFolder or not, the extension of the file be counted and so on.
- Optional: Take the input from keyboard.
- Take care of the invalid inputs. Exception handling.
- Get proper result displayed. "There are XXX file(s) and XXX folder(s) inside folder XXX with extension XXX." or something user friendly.

