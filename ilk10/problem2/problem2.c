//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
#include <stdio.h>
#include <conio.h>

int main () {
     long int i,sayi1,sayi2,sayi3;
	 long long toplam;
	 sayi1=1;
	 sayi2=2;
	 sayi3=3;
	 toplam=2;
	 while(sayi3<4000000) {
	     sayi3=sayi1+sayi2;
		 sayi1=sayi2;
		 sayi2=sayi3;
		 if(sayi3%2==0) {
		     toplam=toplam+sayi3;
		 }
	 }
	 printf("%d",toplam);
	 getch();
}