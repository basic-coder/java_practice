import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyInput {
    public static void main(String[] args){
        System.out.println("Enter a number");

        // int num = System.in.read();

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());

        // System.out.println(num);

        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
}
