package pakke;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class Fakultet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Tast inn ett heltall: "));
	 
		int svar = 1;
		if (n>0) {
		for (int i = 1;i<=n; i++) {	
			svar = svar * i;
			System.out.println("Du får: " + svar);
		}
		
			showMessageDialog (null, svar); }
		else {
			showMessageDialog (null, " Tallets fakultet er : ");
			
		}
			
		

				
		}	
			
		
			
			
			
			
			
		
		
		

		
	}


