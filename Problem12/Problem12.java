
public class Problem12 {

	public static void main(String[] args) {
		int sayi = 0;	//carpan sayisi
		int toplam = 0;	//triangle sayinin degeri
		int i = 1;	//kacinci triangle sayi
		while(sayi<500) {
			sayi = 0;
			//toplam = 0;
			/*for(int k=1;k<i;k++) {
				toplam += k;
			}*/
			toplam += i;
			i++;
			for(int j=1;j<=toplam/2;j++) {
				if(toplam%j==0) {
					//System.out.print(toplam/j+" ");
					sayi++;
				}
			}
			//System.out.println(sayi);
			//System.out.println(i);
			//System.out.println(toplam);
		}
		System.out.println(toplam);
	}

}
