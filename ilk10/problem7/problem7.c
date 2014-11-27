//Find the 10001st prime.
#include <stdio.h>
#include <conio.h>

int main()
{
     int i,j,sayac;
	 sayac=1;
	 i=3;
	 while(sayac<10001) {
	     j=i-1;
	     while(j>1) {
		     if(i%j==0) {
			     j=0;
			 }
			 else {
			     if(j==2) {
				     sayac++;
				 }
			     j--;
			 }
		 }
		 i++;
	 }
	 printf("%d",i-1);








getch();
return 0;
}