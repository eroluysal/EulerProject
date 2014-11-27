
public class Problem15 {
	public static void main(String[] args) {
		long[][] matris = new long[21][21];
		for(int i=0;i<21;i++) {
			matris[i][0] = 1;
			matris[0][i] = 1;
		}
		for(int i=1;i<21;i++) {
			for(int j=1;j<21;j++) {
				matris[i][j] = matris[i-1][j]+matris[i][j-1];
			}
		}
		for(int i=0;i<21;i++) {
			for(int j=0;j<21;j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Cevap: "+matris[20][20]);
	}

}
