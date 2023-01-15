import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(5,8,5,85,8,450);

        // for (int i : nums) {
        //     System.out.println(i);
        // }

        nums.forEach(n -> System.out.println(n));

        //Stream<Integer> s1 = nums.stream();

        int result = nums.stream().filter(n -> n%2==0).map(n -> n+2).reduce(0,(c,e) -> c+e);

        System.out.println(result);
         
    }
}
