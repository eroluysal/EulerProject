//Add all the natural numbers below one thousand that are multiples of 3 or 5.
#include <stdio.h>
#include <conio.h>

int main() {
    int i,toplam;
	toplam=0;
	for(i=0;i<1000;i++) {
	    if((i%3==0) || (i%5==0)) {
		    toplam=toplam+i;
		}
	}
	printf("%d",toplam);
	getch();
}