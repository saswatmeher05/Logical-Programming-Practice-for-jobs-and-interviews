#include<stdio.h>
#include<conio.h>
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
void main(){
    int num;

    scanf("%d", &num);

    if(isArmstrong(num)){
        printf("Number is Armstrong");
    }
    else {
        printf("Number is not Armstrong");
    }

}