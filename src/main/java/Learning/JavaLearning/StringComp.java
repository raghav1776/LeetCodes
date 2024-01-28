package Learning.JavaLearning;
import java.util.Scanner;

public class StringComp {
    private static String a,b;
    public static void main(String[] args) {
        StringComp src = new StringComp();
        System.out.println("Enter any two strings: ");

     Scanner sc = new Scanner(System.in);
     a = sc.nextLine();
     b = sc.nextLine();
     src.jsm();
        }
        void jsm() {
        if (a.equals(b)) {
            System.out.println("Both strings are same: True");
        } else {
            System.out.println("Both strings are diff: false");
        }
    }
}
