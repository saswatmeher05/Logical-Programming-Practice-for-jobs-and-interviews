import java.util.*;
import java.lang.*;
import java.io.*;
public class PyramidPatternLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to print");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //to print spaces
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            //to print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
