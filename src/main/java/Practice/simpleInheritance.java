package Practice;

public class simpleInheritance {

    public static void main(String[] args) {
        simpleInheritance rif = new simpleInheritance();
        simpleInheritance.Raghav rag = rif.new Raghav();
        simpleInheritance.student stu = rif.new student();
        rag.disp();
        stu.Input();
    }
    class student {
        int roll, marks;
        String name;
        void Input(){
            System.out.println("Enter student roll number and marks: ");
        }
    }
    class Raghav extends student{

        Raghav r = new Raghav();
        void disp(){
            roll = 5;
            marks = 98;
            name = "Raghav";
        }
    }
}
