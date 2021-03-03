package lab2;
public class week2_51 {
	public static void main(String[] args) {
		int option = javax.swing.JOptionPane.showConfirmDialog(
													null,"do you want to change to the first class ticket?");
		javax.swing.JOptionPane.showMessageDialog(null,"you've chosen :" 
													+ (option ==javax.swing.JOptionPane.YES_OPTION?"yes":"no"));
		System.exit(0);
	}
	
}
