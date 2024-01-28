package Learning.JavaLearning;

import java.util.Scanner;

public class Ternary {
    private static int x,y,z,maz;
    public static void main(String[] args) {
        System.out.println("Enter any three numbers: ");
        Ternary r = new Ternary();
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        r.max();
    }
    void max(){
        maz = (x>y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Highest value: "+maz);
    }
}
//(x > y) ? ( x > z ? x : z) : (y > z ? y : z);