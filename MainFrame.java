//Miruna Andreea Lazar 2459499L
import java.awt.*;
import javax.swing.*;
public class MainFrame extends JFrame {
    
	private JLabel welcome;
	private JLabel balance;
	private JButton spin;
	private JButton newGame;
	private JLabel cardOne;
	private JLabel cardTwo;
	private JLabel cardThree;
	private JPanel cardOnePanel;
	private JPanel cardTwoPanel;
	private JPanel cardThreePanel;
	
	public MainFrame() {
    	 super("Fruit Machine");
    	 
    	 setLayout(new GridLayout(7,5,5,5));
    	 
    	 welcome = new JLabel("Welcome!"); //create Welcome label
    	 
    	 balance = new JLabel("Balance is"); //create Balance is label
    	
    	 spin = new JButton("Spin"); //create spin button
    	 spin.setSize(50, 50);
    
    	 newGame = new JButton("New Game"); //create new game button
    	 newGame.setSize(50, 50);
    	 
    	 //create label of cards
    	 cardOne = new JLabel("King");
    	 cardTwo = new JLabel("Queen");
    	 cardThree = new JLabel("Jack");
    	 
    	//create "cards" as panes, to be able to set colours and border
    	 cardOnePanel = new JPanel();
    	 cardTwoPanel = new JPanel();
    	 cardThreePanel = new JPanel();
    	 
    	 //set the size of "cards"
    	 cardOnePanel.setPreferredSize(new Dimension(50, 50));
    	 cardTwoPanel.setPreferredSize(new Dimension(50, 50));
    	 cardTwoPanel.setPreferredSize(new Dimension(50, 50));
    	 
    	 //add labels on the "cards"
    	 cardOnePanel.add(cardOne);
    	 cardTwoPanel.add(cardTwo);
    	 cardThreePanel.add(cardThree);
    	 
    	 //set colours and borders of the three panels
    	 cardOnePanel.setBackground(Color.YELLOW);
    	 cardOnePanel.setBorder(BorderFactory.createLineBorder(null, 1));
    	 cardTwoPanel.setBackground(Color.YELLOW);
    	 cardTwoPanel.setBorder(BorderFactory.createLineBorder(null, 1));
    	 cardThreePanel.setBackground(Color.YELLOW);
    	 cardThreePanel.setBorder(BorderFactory.createLineBorder(null, 1));
    	 
    	 //layout of the "cards", buttons and labels
    	 setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    	 add(balance);
    	 add(welcome);
       	 add(cardOnePanel);
    	 add(cardTwoPanel);
    	 add(cardThreePanel);
    	 add(spin);
    	 add(newGame);
    	 
    	 //size of the frame and misc
    	 setSize(600,400);
    	 setLocation(550,350);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setVisible(true);	
     }
	
}
