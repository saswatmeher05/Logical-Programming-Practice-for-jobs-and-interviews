import java.util.Scanner;

/**
 * SumOfEvenAndOddPositionDigits
 */
public class SumOfEvenAndOddPositionDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        String input=scanner.next();
        long evenSum=0,oddSum=0;

        for(int i=0;i<input.length();i++){
            if(i%2==0){
                evenSum = evenSum + input.charAt(i) - '0';
            }
            else {
                oddSum = oddSum + input.charAt(i) - '0';
            }
             
        }
        System.out.println("Difference is:"+Math.abs(evenSum-oddSum));
        
        
    }
    
}