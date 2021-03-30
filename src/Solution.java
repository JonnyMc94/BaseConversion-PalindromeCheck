import java.util.*;

public class Solution {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int palCount = 0;

        for(int i =2; i<11; i++) {
            if(isPalindrome(baseConversion(input, i))) {
                palCount++;
            }
        }

        System.out.println(palCount);
    }

    public static String baseConversion(int num, int base) {

        if (num == 0)
            return "";
        else
            return baseConversion(num / base, base) + (num % base);
        }

    public static boolean isPalindrome(String num) {
        StringBuilder reverse = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--)
            reverse.append(num.charAt(i));

        return num.equals(reverse.toString());
    }

}
