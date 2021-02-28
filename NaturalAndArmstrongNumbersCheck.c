#include<stdio.h>
#include<conio.h>

//macro with parameter
#define NATURAL(x) ( x>0?1:0 )

//method to check armstrong number
int isArmstrong(int num){
    int remainder,result=0,originalNumber=num;
    while(num!=0){
        remainder=num%10;
        result+=remainder*remainder*remainder;
        //remove last digit from number
        num/=10;
    }
    if(result==originalNumber){
        return 1;
    }
    else{
        return 0;
    }

}

void main(){
    int num;
    printf("Enter the number");

    scanf("%d", &num);

    

    if(isArmstrong(num) && NATURAL(num)){
        printf("Number is Natural and Armstrong");
    }
    else {
        printf("Invalid Number");
    }
}