//Find the largest prime factor of a composite number.
#include <stdio.h>
#include <conio.h>
int main() {
     long long i;
	 long long sayi;
	 sayi=600851475143;
	 i=2;
	 while(i<=sayi) {
	     if(sayi%i==0) {
		     sayi=sayi/i;
		 }
		 else {
		     i++;
		 }
	 }
	 printf("%d",i);
	 getch();
}