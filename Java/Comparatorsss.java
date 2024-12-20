import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        return -1;
    }
}


public class Comparatorsss {

    public static void main(String[] args) {

        Comparator<Student> comparator = (i, j) -> i.age > j.age ? 1 : -1;
//                if(i.age > j.age){
//                    return 1;
//                }
//                return -1;




        List<Student> studs = new ArrayList<>();
        studs.add(new Student(12, "Soli"));
        studs.add(new Student(11, "Destiny"));
        studs.add(new Student(16, "John"));
        studs.add(new Student(13, "Mark"));

        Collections.sort(studs, comparator);

        for(Student s : studs){
            System.out.println(s);
        }




    }
}
