
public class Problem14 {
	public static void main(String[] args) {
		long sayi = 13, ara = 1;
		long sayac = 1, enb = -10;
		long sonuc = 0;
		while(sayi<1000000) {
			System.out.print(sayi);
			ara = sayi;
			sayac = 1;
			while(ara!=1) {
				if(ara%2==0) {
					ara = ara/2;
				}
				else {
					ara = 3*ara+1;
				}
				sayac++;
			}
			System.out.println(" "+sayac);
			if(enb<sayac) {
				enb = sayac;
				sonuc = sayi;
			}
			sayi++;
		}
		System.out.println("\n"+sonuc+" "+enb);
	}

}
