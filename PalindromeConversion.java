
//Program to make a given string into palindrome
import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of letters:");
        int last = sc.nextInt();
        int start = 0;
        System.out.println("Enter the string:");
        String s = sc.next();
        char tempArray[] = s.toCharArray();

        for (; start < last; start++, last--) {
            if (tempArray[start] != tempArray[last - 1]) {
                tempArray[last - 1] = tempArray[start];
            }

        }
        String str1 = new String(tempArray);
        System.out.println(str1);

    }
}
