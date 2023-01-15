public class Condition {
    public static void main(String[] args) {
        int x = 28;

        // if (x > 10 && x<=20) {
        // System.out.println("greater than 10");
        // }else{
        // System.out.println("less than 10 and greater than 20");
        // }

        // odd even

        // if(x%2 ==0 ){
        // System.out.println("Even : " + x);
        // }else{
        // System.out.println("Odd : "+ x);
        // }

        // using ternary

        // String result = x%2 ==0 ? "Even : " + x : "Odd : "+ x;

        // System.out.println(result);

        // switch case

        int n = 7;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
