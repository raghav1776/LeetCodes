package Learning.JavaLearning;
import java.util.Scanner;


public class Recursion2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Recursion2 r = new Recursion2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int Result = r.fact(n);
        System.out.println("Factorial of Given Number: "+Result);
    }
    int fact(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }

    }
}
