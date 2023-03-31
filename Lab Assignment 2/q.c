#include <stdio.h>
int main()
{
    int a, r, s, c = 0;
    printf("Enter no. : ");
    scanf("%d", &a);
    r = a / 5;
    if (r > 0)
    {
        s = r / 5;
        c = c + s;
    }
    c = r + s;
    printf("No. of 0s : %d", c);
}
