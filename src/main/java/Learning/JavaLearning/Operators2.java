package Learning.JavaLearning;
import java.util.Scanner;

public class Operators2 {
    private static int a,b;
    public static void main(String[] args) {
        System.out.println("Eneter two numbers: ");
        Scanner sc = new Scanner(System.in);
        Operators2 Sim = new Operators2();
        Operators2.ab abcd = Sim.new ab();
        // Input variables
        a = sc.nextInt();
        b = sc.nextInt();
        // Call Relational and Arithmetic method
        abcd.Arithmetic();
        abcd.Relational();
    }

    class ab{
        void Arithmetic(){
            System.out.println("Addition: "+(a+b));
            System.out.println("Subtraction: "+(a-b));
            System.out.println("Divison: "+(a/b) );
            System.out.println("Reminder: "+(a%b));
        }
        void Relational(){
            System.out.println("Result: "+(a<b));
            System.out.println("Result: "+(a>b));
            System.out.println("Result: "+(a==b));
            System.out.println("Result: "+(a>=b));
            System.out.println("Result: "+(a<=b));
            System.out.println("Result: "+(a!=b));
        }

    }
}
