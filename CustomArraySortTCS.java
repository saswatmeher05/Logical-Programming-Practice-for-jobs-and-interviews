/* Coding Problem
Simmi loves to solve problems. Hence on her birthday , her 
friend asked to write the code for an interesting
problem. She gave some positive integers numbers to simmi in 
sorted order and asked her to rearrange , the numbers alternately 
i.e first number should be maximum value, second minimum value, 
third second max, fourth second min and so on. Help the simmi in 
solving this problem 

Example: 
Input:
{1,2,3,4,5,6,7}
Otput:
{7,1,6,2,5,3,4}

*/

import java.util.*;

public class CustomArraySortTCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements in array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        int min=0,max=n-1;
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                temp[i]=arr[max];
                max--;
            }
            else{
                temp[i]=arr[min];
                min++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
        }
        
        

    }
}
