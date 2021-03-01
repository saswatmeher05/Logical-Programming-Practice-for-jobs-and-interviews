import java.util.Scanner;
import java.lang.Math;

class ArmstongNumbersInGivenRange {
   public static void main(String[] args) {
      int number, rem, count = 0, originalNumber, low, high;
      double result = 0.0;
      System.out.print("Enter the range(intervals):");
      Scanner scanner = new Scanner(System.in);
      low = scanner.nextInt();
      high = scanner.nextInt();
      System.out.println("Numbers between " + low + " and " + high + " are:");

      for (number = low; number <= high; ++number) {
         originalNumber = number;

         while (originalNumber != 0) {
            originalNumber /= 10;
            ++count;
         }

         originalNumber = number;

         while (originalNumber != 0) {
            rem = originalNumber % 10;
            result += Math.pow(rem, count);
            originalNumber /= 10;
         }

         if ((int) result == number) {
            System.out.println(number);
         }

         count = 0;
         result = 0;
      }
      scanner.close();
   }
}