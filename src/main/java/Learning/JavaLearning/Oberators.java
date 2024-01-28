package Learning.JavaLearning;
import java.util.Scanner;

public class Oberators {
    public static void main(String[] args) {
        Oberators Obs = new Oberators();
        Oberators.Relational rel = Obs.new Relational();
        rel.relation();
        int a, b;
        System.out.println("Eneter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println(("Division " + (a / b)));
        System.out.println(("Reminder " + (a % b)));
    }

    class Relational{
        void relation(){
            System.out.println("Enter two numbers:: ");
            Scanner cs = new  Scanner(System.in);
        int a,b;
        a = cs.nextInt();
        b = cs.nextInt();
            System.out.println("Result always in true/false:: "+(a<b));

        }
    }
}
