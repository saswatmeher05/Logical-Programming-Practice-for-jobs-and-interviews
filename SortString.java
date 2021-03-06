/* Q. Take string input from user and show length of input string and  output as Upper case and alphabetically sorted format.
   Example: input=  soMu
            output= 4,MOSU
*/
import java.util.*;

public class SortString {
    public static void main(String[] args) {
        String s="soMu";

        char tempArray[]=s.toCharArray();
        Arrays.sort(tempArray);

        String str1=new String(tempArray);
        System.out.print(str1.length()+",");
        System.out.println(str1.toUpperCase());
    }
}
