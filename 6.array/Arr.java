
class Student{
    int rollNo;
    String name;
    int marks; 
}

public class Arr {
    public static void main(String[] args) {
        
        // assigning arr
        // int arr[] = {1,2,3};

        // //creating memory
        // int num[] = new int[4];
        // num[0] = 8;
        // num[1] = 85;
        // num[2] = 18;
        // num[3] = 87;

        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }

        //multi-dimensional array

        // int num[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         num[i][j] = (int)(Math.random() * 10); // generating random values
        //         System.out.print(num[i][j] + " ");
        //     }   
        //     System.out.println();
        // }
        
        // for each
        // for (int[] n : num) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        //jagged array

        // int nums[][] = new int[3][] ;
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         nums[i][j] = (int)(Math.random() * 10); // generating random values
        //         System.out.print(nums[i][j] + " ");
        //     }   
        //     System.out.println();
        // }

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "bhavesh";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "bhau";
        s2.marks = 58;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "bhai";
        s3.marks = 88;
        

        Student students[] = new Student[3];
    
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }
        
    }
}
