//Find the sum of all the primes below two million.
#include <stdio.h>

int main()
{
    long i,j,toplam;
    toplam=5;
    i=5;
    while(i<2000000)
    {
        j=2;
        while((i%j!=0)&&((j*j)<i))
        {
            j++;
        }
        if((j*j>i))
        {
            toplam=toplam+i;
        }
        i=i+2;
    }
    printf("%d",toplam);
    getch();
}
//2 3 5 7 11 13 17 19
