/**
 * DecimalConversion Given a maximum of 4 digit to the 
 * base * 17(10->A,11->B,12->C,16->G) as input find the output in decimal value;
 * 
 * example: input= 23GF output= 10980
 */

import java.util.HashMap;
import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        //faster approach to get value from hash map
        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        map.put('a',10);
        map.put('b',11);
        map.put('c',12);
        map.put('d',13);
        map.put('e',14);
        map.put('f',15);
        map.put('g',16);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        String input=sc.next();
        double num=0.0;
        int k=0;
        for(int i=input.length()-1;i>=0;i--){
            //check if the char lies between a-z or A-Z
            if(
                (input.charAt(i)>='A' && input.charAt(i)<='Z') 
                || 
                (input.charAt(i)>='a' && input.charAt(i)<='z')
                )
            {
                num=num+map.get(input.charAt(i)) * (int)Math.pow(17, k++);

            }
            else {
                //else simply use numeric value to calculate
                num=num+ ((input.charAt(i)-'0')* (int)Math.pow(17,k++));
            }

        }
        System.out.println("Converted value: "+(int)num);
    }

}