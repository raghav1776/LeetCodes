package Learning.JavaLearning;


import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String a = "raghav";
        String b = "SINGH";

        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());

        System.out.println(a.concat(b));
        System.out.println(a.length());

        String c = "    Raghav      ";
        String d = "";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(a.isEmpty());
    }
}
