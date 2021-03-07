
/* 
There is a JAR full of candies for sale at a mall counter. 
JAR has the capacity N, that is JAR can contain maximum N candies 
when JAR is full. At any point of time. JAR can have M number of 
Candies where M less than or equal to N. Candies are served to the 
customers. JAR is never remain empty as when last k candies are 
left. JAR if refilled with new candies in such a way that JAR 
get full.
Write a code to implement above scenario. Display JAR at counter 
with available number of candies. Input should be the number of 
candies one customer can order at point of time. Update the JAR 
after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of 
Candies in JAR.

If Input is more than candies in JAR, return: INVALID INPUT

Given, 

N=10, where N is NUMBER OF CANDIES AVAILABLE

K less than or equal to 5, where k is a number of minimum candies 
that must be inside JAR ever.

Example 1:(N = 10, k less than or equal to 5)

Input Value
3
Output Value
NUMBER OF CANDIES SOLD : 3
NUMBER OF CANDIES AVAILABLE : 7
Example : (N=10, k less than or equal to 5)

Input Value
0
Output Value
INVALID INPUT
NUMBER OF CANDIES LEFT : 10
*/
import java.util.Scanner;

public class JarOfCandiesTCS {
    public static void main(String[] args) {
        int capacity = 10;
        int remaining = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT VALUE : ");
        int input = sc.nextInt();
        if (input >= 5) {
            remaining = 10;
            System.out.println("NUMBER OF CANDIES SOLD : " + input);
            System.out.println("NUMBER OF CANDIES REMAINING : " + remaining);
        } else if (input > 10 || input == 0) {
            System.out.println("INVALID INPUT");
            remaining = 10;
            System.out.println("NUMBER OF CANDIES REMAINING : " + remaining);
        } else {
            remaining = capacity - input;
            System.out.println("NUMBER OF CANDIES SOLD : " + input);
            System.out.println("NUMBER OF CANDIES REMAINING : " + remaining);
        }

    }

}
