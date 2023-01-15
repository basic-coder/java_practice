import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student age : " + age + " name : " + name ;
    }
   
}

public class Collect{
    public static void main(String[] args) {

        // same values List
        //List<Integer> nums = new ArrayList<>();
        // unique values
       // Set<Integer> nums = new HashSet<Integer>();
        // sorted set
        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(5);
        // nums.add(890);
        // nums.add(5);
        // nums.add(50);

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j%10)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        // Collections.sort(nums,com);

        // System.out.println(nums);

        // Iterator<Integer> values = nums.iterator();

        // while(values.hasNext()){
        //     System.out.println(values.next());
        // }

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        //System.out.println(nums);

        //Map<String,Integer> students = new HashMap<>();
    
        // Map<String,Integer> students = new Hashtable<>();

        // students.put("bhavesh", 56);
        // students.put("bhavesh1", 16);
        // students.put("bhavesh2", 96);
        // students.put("bhavesh3", 86);
        // students.put("bhavesh4", 58);

        // System.out.println(students.keySet());

        // for (String name : students.keySet()) {
        //     System.out.println(name + " " + students.get(name));
        // }

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(15, "bhau"));
        studs.add(new Student(12, "bhaes"));
        studs.add(new Student(10, "bhavesh"));
        studs.add(new Student(1, "bhau5"));

        // for (Student s : studs) {
        //     System.out.println(s);
        // }

        Comparator<Student> com = (Student i, Student j) -> i.age > j.age ? 1 : -1 ;

        Collections.sort(studs,com);

        for (Student student : studs) {
            System.out.println(student);
        }

    }
}