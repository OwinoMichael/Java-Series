import org.w3c.dom.ls.LSOutput;

/**
 *  We would want to initialize Instance Variables of a class
 *  Example: This app is only available to kids above the age of 3 so we can initialize the age variable to 3
 *
 *  Constructor is a method used to initialize objects
 *  Constructor name should be same as class name
 *  Everytime we create an object the constructor will be called
 *
 *  We can declare value of Instance variable BUT the protocol is to ALWAYS
 *  perform instance variable operations in a METHOD
 * */

class Human{
    private int age;
    private String name;

    public Human(){
        age = 12;
        name = "John";
        System.out.println(name + " : " + age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor{


    public static void main(String[] args) {

    Human obj = new Human();
    Human obj1 = new Human();
    //The output will be printed twice since each time we create an object the constructor method is called

    }


}
