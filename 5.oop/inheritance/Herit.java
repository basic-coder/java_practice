class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println(" in B");
    }

    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class Herit {
    public static void main(String[] args) {
        //B obj = new B(5);
        Calc cal = new Calc();
        int res = cal.add(5, 6);

        System.out.println(res);
    }
}
