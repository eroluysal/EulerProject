import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

class SimdiDurum {
	int deger;
	int toplam = 0;
	int x = 0,y = 0;
	public SimdiDurum(int deger) {
		this.deger = deger;
	}
}

class DurumComp implements Comparator {

	@Override
	public int compare(Object v, Object y) {
		if(((SimdiDurum)v).toplam>((SimdiDurum)y).toplam) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}


public class Problem18 {
	public static void main(String[] args) {
		int[][] matris = new int[15][15];
		File f = new File("problem18");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String oku;
			int m = 0;
			while((oku=bfr.readLine())!=null) {
				String[] ayrik = null;
				ayrik = oku.split("[ ]");
				for(int i=0;i<ayrik.length;i++) {
					matris[m-i][i] = Integer.parseInt(ayrik[i]);
				}
				m++;
			}
			for(int i=0;i<15;i++) {
				for(int j=0;j<15;j++) {
					System.out.print(matris[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			Comparator comp = new DurumComp();
			PriorityQueue kuyruk = new PriorityQueue(1000,comp);
			int n = 0;
			m = 0;
			SimdiDurum s = new SimdiDurum(matris[m][n]);
			s.toplam += matris[m][n];
			s.x = m;
			s.y = n;
			kuyruk.add(s);
			int toplam = 0;
			boolean bulundu = false;
			while(bulundu==false) {
				SimdiDurum sd = (SimdiDurum) kuyruk.remove();
				SimdiDurum sd2,sd3;
				m = sd.x;
				n = sd.y;
				System.out.println("x:"+m+" y:"+n);
				if(m+1<15) {
					if(matris[m+1][n]!=0) {
						sd2 = new SimdiDurum(matris[m+1][n]);
						sd2.x = m+1;
						sd2.y = n;
						sd2.toplam += sd.toplam+matris[m+1][n];
						kuyruk.add(sd2);
					}
				}
				if(n+1<15) {
					if(matris[m][n+1]!=0) {
						sd3 = new SimdiDurum(matris[m][n+1]);
						sd3.x = m;
						sd3.y = n+1;
						sd3.toplam += sd.toplam+matris[m][n+1];
						kuyruk.add(sd3);
					}
				}
				toplam = sd.toplam;
				System.out.println(toplam);
				if(kuyruk.size()==0) {
					bulundu = true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
