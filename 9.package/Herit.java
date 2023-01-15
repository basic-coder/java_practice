import tools.MyCalc;

public class Herit {
    public static void main(String[] args) {
        //B obj = new B(5);
        MyCalc cal = new MyCalc();
        int res = cal.div(5, 6);

        System.out.println(res);
    }
}
