#include <stdio.h>
#include <conio.h>
//#include <math.h>

//macro with parameter
#define AREA(x) (3.1415 * x * x)

void main()
{
    int r;
    scanf("%d", &r);
    if (r >= 20 && r <= 30)
        {
            printf("%.3f", AREA(r));
        }
    else{
        printf("Wrong Display Output");
    }
}