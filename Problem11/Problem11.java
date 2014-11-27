import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Problem11 {

	public static void main(String[] args) {
		File f = new File("problem11");
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(f));
			String oku,okunan = "";
			String ayrik[] = new String[20];
			int matris[][] = new int[20][20];
			while((oku=bfr.readLine())!=null) {
				okunan += oku+" ";
			}
			//System.out.println(okunan);
			ayrik = okunan.split("[ ]");
			int k = 0;
			for(int i=0;i<20;i++) {
				for(int j=0;j<20;j++) {
					matris[i][j] = Integer.parseInt(ayrik[k]);
					k++;
				}
			}
			/*for(int i=0;i<20;i++) {
				for(int j=0;j<20;j++) {
					System.out.print(matris[i][j]+" ");
				}
				System.out.println();
			}*/
			int enb = -10;
			int araSonuc = -10;
			for(int i=0;i<20;i++) {
				for(int j=0;j<20;j++) {
					if(i+3<20) {
						araSonuc = matris[i][j]*matris[i+1][j]*matris[i+2][j]*matris[i+3][j];
						if(araSonuc>enb) {
							enb = araSonuc;
						}
					}
					if(j+3<20) {
						araSonuc = matris[i][j]*matris[i][j+1]*matris[i][j+2]*matris[i][j+3];
						if(araSonuc>enb) {
							enb = araSonuc;
						}
					}
					if(i+3<20 && j+3<20) {
						araSonuc = matris[i][j]*matris[i+1][j+1]*matris[i+2][j+2]*matris[i+3][j+3];
						if(araSonuc>enb) {
							enb = araSonuc;
						}
					}
					if(i+3<20 && j-3>0) {
						araSonuc = matris[i][j]*matris[i+1][j-1]*matris[i+2][j-2]*matris[i+3][j-3];
						if(araSonuc>enb) {
							enb = araSonuc;
						}
					}
				}
			}
			System.out.println(enb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
