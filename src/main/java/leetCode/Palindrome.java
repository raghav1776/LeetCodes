package leetCode;

import java.sql.SQLOutput;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);

        StringBuilder sb = new StringBuilder(a);
        String b = sb.reverse().toString();

        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
