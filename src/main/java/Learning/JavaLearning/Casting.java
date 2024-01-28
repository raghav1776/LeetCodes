package Learning.JavaLearning;

// Implicit Casting

public class Casting {

    public static void main(String[] args) {
        Casting rif = new Casting();
        Casting.explicit r = rif.new explicit();

        int a =10; // 4 byte
        double b = a; // 8 bytes   // Implicit casting
        System.out.println(b);
        r.input();
        }
        class explicit{
        double ba = 10.5;
        int ab = (int)ba;    // Explicit Casting
        void input(){
            System.out.println(ab);
        }
    }
    }
