//What is the smallest number divisible by each of the numbers 1 to 20?
#include <stdio.h>
#include <conio.h>

int main()
{
     long long sayi;
	 int i,sayac;
	 i=2;
	 sayi=20;
	 sayac=1;
	 while(i<21) {
	     if(sayi%i==0) {
		     i++;
			 sayac++;
			 if(sayac==19)
			     i=22;
		 }
		 else {
		     i=2;
			 sayi++;
			 sayac=1;
		 }
	 }
	 printf("%d",sayi);







getch();
return 0;
}