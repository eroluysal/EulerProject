//Find the largest palindrome made from the product of two 3-digit numbers.
#include <stdio.h>
#include <conio.h>

int main() {
     int i,j,sonuc,tmp,palindrom;
	 int bsmbir,bsmon,bsmyuz,bsmbin,bsmonbin,bsmyuzbin;
	 palindrom=0;
	 for(i=100;i<999;i++) {
	     for(j=100;j<999;j++) {
		     sonuc=i*j;
			 bsmyuzbin=sonuc/100000;
			 tmp=sonuc-(bsmyuzbin*100000);
			 bsmonbin=tmp/10000;
			 tmp=tmp-(bsmonbin*10000);
			 bsmbin=tmp/1000;
			 tmp=tmp-(bsmbin*1000);
			 bsmyuz=tmp/100;
			 tmp=tmp-(bsmyuz*100);
			 bsmon=tmp/10;
			 tmp=tmp-(bsmon*10);
			 bsmbir=tmp;
			 if((bsmyuzbin==bsmbir) && (bsmonbin==bsmon) && (bsmbin==bsmyuz)) {
			     if(sonuc>palindrom) {
				     palindrom=sonuc;
				 }
			 }
		 }
	 }
	 printf("%d",palindrom);
	 getch();
}