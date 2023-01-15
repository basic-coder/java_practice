public class Except {
    public static void main(String[] args) {
        int i = 0;
        int nums[] = new int[5]; 
        try {    
             int j = 18 / i;
            System.out.println(nums[5]);

            // if(j == 0){
            //     throw new ArithmeticException();
            // }

        }catch (ArithmeticException e) {
            int j = 18/1;
            System.out.println("something went wrong with divide by 0 " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("something went wrong wih index" + e);
        }
         catch (Exception e) {
            System.out.println("something went wrong " + e);
        }

        System.out.println("hello");
    }
}
