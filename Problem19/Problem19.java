import java.util.Calendar;
import java.util.GregorianCalendar;


public class Problem19 {
	public static void main(String[] args) {
		int pazarSayi = 0;
		Calendar cal = Calendar.getInstance();
		for(int i=1901;i<2001;i++) {
			for(int j=0;j<12;j++) {
				cal.set(Calendar.YEAR,i);
				cal.set(Calendar.MONTH,j);
				cal.set(Calendar.DATE,1);
				if(cal.get(Calendar.DAY_OF_WEEK)==1) {
					System.out.println("yil: "+i+" ay: "+j);
					pazarSayi++;
				}
			}
		}
		System.out.println(pazarSayi);
	}

}
