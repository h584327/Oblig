package pakke;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for-løkke for å repetere inntastingsboksen 10 ganger
		for (int i = 1; i <=10; i++) { 
		// denne metoden gir oss en boks hvor en kan skrive inn, i dette tilfellet poengsum.
		int tall = parseInt(showInputDialog("Tast inn din poengsum: "));
		
	
		if (tall >= 0 && tall <= 39) {
			showMessageDialog (null, " Karakter: F " );
			System.out.println("F");
	}
		else if (tall >= 40 && tall <= 49) {
			//denne metoden gir oss et resultat i form av en boks.
			showMessageDialog (null, "Karakter: E ");
			// denne metoden gir utskrift i boksen under.
			System.out.println("E");
		}
		
		else if (tall >= 50 && tall <= 59) {
			showMessageDialog (null, "karakter: D ");
			System.out.println("D");
		}
		
		else if (tall >= 60 && tall <= 79) {
			showMessageDialog (null, "karakter: C ");
			System.out.println("C");
		}
		
		else if (tall >= 80 && tall <= 89) {
			showMessageDialog (null, "karakter: B ");
			System.out.println("B");
	
	}
		else if (tall >= 90 && tall <= 100) {
			showMessageDialog (null, "karakter: A ");
			System.out.println("A");
		}
		
		else {
			showMessageDialog (null, "Dette er ikke en valid poengsum, vennligst prøv på nytt!");
			i--;
			
		} 
		
		}
		
	}
}
	
		
