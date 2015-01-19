import java.util.HashMap;


public class Problem21 {
	public static void main(String[] args) {
		int deger = 0;
		int toplam = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int i=2;i<10000;i++) {
			deger = dBul(i);
			hm.put(i, deger);
		}
		for(int i=2;i<10000;i++) {
			int gcc = hm.get(i);
			if(i!=gcc && hm.get(gcc)!=null && hm.get(gcc)==i) {
				toplam += i;
			}
		}
		System.out.println(toplam);
	}
	
	public static int dBul(int sayi) {
		int toplam = 1;
		for(int i=2;i<=sayi/2;i++) {
			if(sayi%i==0) {
				toplam += i;
			}
		}
		return toplam;
	}

}
