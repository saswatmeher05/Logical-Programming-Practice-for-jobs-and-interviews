
/* 
One programming language has the following keywords that cannot be used as identifiers:

break, case, continue, default, defer, else, for, func, goto,
if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not.
Test Case: 
Case 1
Input – defer
Expected Output – defer is a keyword
Case 2
Input – while
Expected Output – while is not a keyword
*/
import java.util.Scanner;

public class CustomKeywordsCheck {
    public static void main(String[] args) {
        String str[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
                "range", "return", "struct", "type", "var" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.next();
        boolean flag = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(input)) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(input+" is a keyword");
        }
        else {
            System.out.println(input+" is not a keyword");
        }
    }

}
