import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		try {
			while(true) {
				String text = "";
				int row = Integer.parseInt(JOptionPane.showInputDialog(null, "How many row: "));
				int coulmn = Integer.parseInt(JOptionPane.showInputDialog(null, "How many coulmn: "));
				String symbol = JOptionPane.showInputDialog(null, "Enter your symbol: ");
				
				for(int i = 1; i <= row; i++) {
					System.out.println();
					
					for(int j=1; j<= coulmn; j++) {
						System.out.print(symbol);
						text += symbol;
					}
					text += "\n";
				}
				
				JOptionPane.showMessageDialog(null, text+"\nCopied!");
				
				StringSelection stringSelection = new StringSelection(text);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				System.out.print("\nCopied!");	
			}	
		}catch(Exception e) {
			System.out.println("\nGoodbye!");
		}
		
	}
}