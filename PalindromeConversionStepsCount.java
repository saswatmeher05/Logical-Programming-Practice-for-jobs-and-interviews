//Program to find number of steps to convert a given string into palindrome

import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeConversionStepsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of letters:");
        int last = sc.nextInt();
        int start = 0;
        int sum = 0;
        System.out.println("Enter the string:");
        String s = sc.next();
        char tempArray[] = s.toCharArray();

        for (; start < last; start++, last--) {
            sum += Math.abs(tempArray[start] - tempArray[last - 1]);
        }
        String str1 = new String(tempArray);
        System.out.println(sum);

    }
}
