/* Q.find the nth term in the given series:   
	1 2 1 3 2 5 3 7 5 11 8 13 13 17...............
=========================================================================
*/

import java.util.*;
class FindNthTermInSeries {
  void fibonacci(int n){
      int a=0,b=1,s;
      for(int i=2;i<=n;i++){
        s=a+b;
        a=b;
        b=s;
      }
      System.out.print(a);
  }
  void prime(int n){
      int i,j,c=0,flag;
      for(i=2;i<100;i++){
        flag=0;
        for(j=2;j<=i/2;j++){
          if(i%j==0){
            flag=1;
            break;
          }
        }
        if(flag==0){
          if(++c==n){
          System.out.print(i);
          break;
          }
        }

      }
  }
  public static void main(String[] args) {
    FindNthTermInSeries fn=new FindNthTermInSeries();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    System.out.print("The number at "+n+"th position is: ");
    if(n%2==0){
      fn.prime(n/2);
    }
    else{
      fn.fibonacci((n/2)+1);
    }
  }
}