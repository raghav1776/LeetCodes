package Learning.JavaLearning;

public class SimpleInheritance {

    public static void main(String[] args) {
        SimpleInheritance r = new SimpleInheritance();
        SimpleInheritance.raghav rif = r.new raghav();
        rif.disp();
        rif.input();
    }

    class student {
        int roll, marks;
        String name;

        void input() {
            System.out.println("Enter roll number & marks: ");
        }
    }

    class raghav extends student {
        void disp() {
            roll = 1;
            marks = 89;
            name = "raju";
            System.out.println(roll + " " + name + " " + marks);
        }
    }

}
