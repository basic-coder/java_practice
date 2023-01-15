class Calc{

    public int add(int a,int b){
        int res = a + b;
        return res;
    }

    //method overloading - having same name with different parameters
    public int add(int a,int b,int c){
        return a + b + c;
    }

}
public class Demo {
    public static void main(String[] args) {
        int num1 = 1 , num2 = 3;
        // int result = num1 + num2;

        Calc obj = new Calc(); // type var = new class 

        int result = obj.add(num1,num2);

        System.out.println(result);
    }
}

