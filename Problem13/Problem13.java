import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;


public class Problem13 {
	public static void main(String[] args) {
		File f = new File("problem13");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String oku;
			int i = 0;
			BigInteger toplam = BigInteger.ZERO;
			while((oku=bfr.readLine())!=null) {
				BigInteger sayi = new BigInteger(oku);
				toplam = toplam.add(sayi);
			}
			System.out.println(toplam);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
