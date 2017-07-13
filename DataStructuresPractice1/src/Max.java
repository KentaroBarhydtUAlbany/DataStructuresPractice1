import javax.swing.JOptionPane;

public class Max {
	
	private static void main( String[] args) {
		
		int max1 = 0;
		int max2 = 0;
		int userInput = -1; //is initial declaration as -1 necessary?
		
		do {
			
			String numberInput = new String();
			numberInput = JOptionPane.showInputDialog("Enter a positive integer (-1 to end)");
			userInput = (int) Integer.parseInt(numberInput);
			
			if(userInput > max1) {
				max2 = max1;
				max1 = userInput;
			}
			
			else if(userInput > max2) {
				max2 = userInput;
			}
			
		}while(userInput != -1);
		
		//show results window
		JOptionPane.showMessageDialog(null, "max1 = " + max1 + "\nmax2 = " + max2);
		
	}

}
