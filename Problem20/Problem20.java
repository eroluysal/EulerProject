import java.math.BigInteger;


public class Problem20 {
	public static void main(String[] args) {
		BigInteger carpim = BigInteger.ONE;
		int toplam = 0;
		char[] basamak;
		for(int i=1;i<101;i++) {
			BigInteger sayi = new BigInteger(""+i);
			carpim = carpim.multiply(sayi);
		}
		System.out.println("100!: "+carpim);
		basamak = String.valueOf(carpim).toCharArray();
		for(int i=0;i<basamak.length;i++) {
			toplam += basamak[i]-48;
		}
		System.out.println("toplam: "+toplam);
	}

}
