#include <stdio.h>
#include <conio.h>

//macro with parameter
#define NATURAL(x) (x > 0 ? 1 : 0)

//method to check armstrong number
int isArmstrong(int x){
    int rem,res=0,orignalNum=x;
    while(x!=0){
        rem=x%10;
        res+=rem*rem*rem;
        x/=10;
    }
    if(res==orignalNum){
        return 1;
    }
    else{
        return 0;
    }

}

void main()
{
    int start,end;
    printf("Enter the range:\n");
    printf("From:");
    scanf("%d", &start);
    printf("to:");
    scanf("%d", &end);

    if ((start <= 0) || (end <= 0))
    {
        printf("Invalid input");
    }
    else
    {
        printf("Armstrong Numbers in the range are:\n");
        for (start; start <= end; start++)
        {
            
            if(isArmstrong(start)){
            printf("%d",start);
            printf("\n");
            }
            
        }
        
        
    }
}
