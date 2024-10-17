
class Human{
    private int age;
    private String name;

    public Human(){ //Default Constructor
        age = 12;
        name = "John";
        System.out.println(name + " : " + age);
    }

    public Human(int age, String name){ //Parametrized Constructor
        this.age = age;
        this.name = name;
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

public class DefaultVsParametizedConstructor {

    public static void main(String[] args) {
        Human obj = new Human(24, "Mike");
        Human obj1 = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
