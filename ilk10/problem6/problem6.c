//What is the difference between the sum of the squares and the square of the sums?
#include <stdio.h>
#include <conio.h>

int main()
{
     int i,ara;
	 ara=1;
	 long int sonuc1,sonuc2,sonuc;
	 sonuc2=0;
	 for(i=2;i<101;i++) {
	     ara=ara+i;
	 }
	 sonuc1=ara*ara;
	 for(i=1;i<101;i++) {
	     sonuc2=sonuc2+(i*i);
	 }
	 sonuc=sonuc1-sonuc2;
	 printf("%d",sonuc);








getch();
return 0;
}