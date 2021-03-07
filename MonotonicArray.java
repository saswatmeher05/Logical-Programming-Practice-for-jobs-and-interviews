import java.util.Scanner;
public class MonotonicArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean increasing=false,decreasing=false;
        System.out.println("Enter number of elements you want to store: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        //logic to check if given array is monotonic
        for(int i=0;i<a.length-1;++i){
            //for monotone increasing
            if(a[i]<=a[i+1]){
                increasing=true;
            }
            //for monotone decreasing
            else if(a[i]>=a[i+1]){
                decreasing=true;
            }
            else{
                increasing=false;
                decreasing=false;
            }
        }

        if(increasing || decreasing){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }



    }
}
