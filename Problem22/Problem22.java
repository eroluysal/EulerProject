import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem22 {
	public static void main(String[] args) {
		File dosya = new File("problem22");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(dosya));
			String gelen = null;
			String gcc = "";
			while((gelen=bfr.readLine())!=null) {
				gcc += gelen;
			}
			String ayrac = "[;]";
			String[] ayrik;
			ayrik = gcc.split(ayrac);
			BigInteger toplam = BigInteger.ZERO;
			List<String> liste = new ArrayList<>();
			for(int i=0;i<ayrik.length;i++) {
				liste.add(ayrik[i]);
			}
			Collections.sort(liste, String.CASE_INSENSITIVE_ORDER);
			for(int i=0;i<ayrik.length;i++) {
				int deger = degerBul(liste.get(i));
				int sonuc = deger*(i+1);
				BigInteger sayi = new BigInteger(""+sonuc);
				toplam = toplam.add(sayi);
				System.out.println((i+1)+" "+liste.get(i)+" "+deger);
			}
			System.out.println(toplam);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int degerBul(String kelime) {
		int toplam = 0;
		for(int i=0;i<kelime.length();i++) {
			int deger = kelime.charAt(i)-'A'+1;
			toplam += deger;
		}
		return toplam;
	}

}
