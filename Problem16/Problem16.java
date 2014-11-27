import java.math.BigInteger;


public class Problem16 {
	public static void main(String[] args) {
		BigInteger carpim = BigInteger.ONE;
		BigInteger iki = new BigInteger("2");
		char[] basamaklar;
		int[] basamak;
		int toplam = 0;
		for(int i=1;i<1001;i++) {
			carpim = carpim.multiply(iki);
		}
		System.out.println(carpim);
		basamaklar = String.valueOf(carpim).toCharArray();
		basamak = new int[basamaklar.length];
		for(int i=0;i<basamaklar.length;i++) {
			basamak[i] = basamaklar[i]-48;
			toplam += basamak[i];
		}
		System.out.println("Toplam: "+toplam);
	}

}
