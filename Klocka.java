// Uppgift 2.1 (Sida 55)

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Klocka {
	public static void main(String[] arg) {
		String datumTid = Calendar.getInstance().getTime().toString();
		int tid = datumTid.indexOf(':'); // Letar f�rsta f�rekomsten av ":" som senare subtraheras med 2
		JOptionPane.showMessageDialog(null, "Klockan �r: " + datumTid.substring(tid - 2, tid + 6));
	}
}