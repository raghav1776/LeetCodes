package Learning.JavaLearning;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int a = r.sum(9);
        System.out.println("Sum of N natural numbers: "+a);
    }
    int sum(int b) {
        if (b > 0) {
            return b + sum(b-1);
        }
        else {
            return 0;
        }
    }
}
