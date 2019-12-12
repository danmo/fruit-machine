
//Miruna Andreea Lazar 2459499L
import javax.swing.SwingUtilities;

public class FruitMachine {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});
	}
}