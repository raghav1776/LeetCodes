package Learning.JavaLearning;

import java.util.Scanner;

public class LogicalOperator {
    private static int a,x,y,z,max;
    public static void main(String[] args) {
        System.out.println("Logical And");  // Result true
        System.out.println((10>5) && (2>1));
        System.out.println((10<5) && (2>1));

        //Logical OR Operation
        System.out.println("Logical OR ");
        System.out.println((10>5) || (2>1));
        System.out.println((12<1) || (3<1));

        // Logical Not Operator
        System.out.println("Logical Operator");
        System.out.println(!(10>5));
        System.out.println(!(10<5));

        Scanner sc = new Scanner(System.in);
        LogicalOperator rif = new LogicalOperator();
        LogicalOperator.IncDecOps r = rif.new IncDecOps();
        a = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        r.Decr();
        r.Incre();
        r.Assignment();
        r.Ternary();
    }

    class IncDecOps {
        void Incre(){
            System.out.println(("Post Increment: ")+(a++)); // Post Increment
            System.out.println("Pre Increment: "+(++a));    // Pre Increment
        }
        void Decr (){
            System.out.println("Post Decerement: "+ (a--));  // Psot Decrement
            System.out.println("Pre Drecrement"+ (--a));     // psot Increment
        }
        void Assignment(){
            int b;
            b = 10;
            b += 10;
            System.out.println("Assignmnet Operators: "+ b);

            b -= 10;
            System.out.println("Assignmnet Operators: "+ b);
        }
        void Ternary(){
            max = (x > y) ? ( x > z ? x : z) : (y > z ? y : z);
            System.out.println("Ternary Operator:  "+ max);
        }
    }
}
