package lambda_and_stream_assignment;

public class Person {
    String name;
    int age;
    String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    @Override
    public String toString() {
        return  getName() + ", " + getAge() + ", " + getSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
