#include <stdio.h>
#include <stdlib.h>

int main()
{
        int a,b,c;
        long akare,bkare,ckare,sonuc;
	    for(a=1;a<1000;a++)
	    {
	        for(b=2;b<1000;b++)
	        {
	            for(c=3;c<1000;c++)
	            {
	                if((a<b) && (b<c))
                    {
                        if((a+b+c)==1000)
                        {
                            akare=a*a;
                            bkare=b*b;
                            ckare=c*c;
                            if((akare+bkare)==ckare)
                            {
                                sonuc=a*b*c;
                                printf("%d",sonuc);
                            }
                        }
                    }
	            }
	        }
	    }
}
