import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui2 implements ActionListener {
	/* ---------------------------
		Declare instance variables
	--------------------------- */
	
	private JButton button;
	
	/* ---------------------------
			Main Method
	--------------------------- */
	
	public static void main(String[] args) {
		SimpleGui2 gui = new SimpleGui2();
		gui.go();
	}
	
	/* ---------------------------
			Go Method
	--------------------------- */
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		MyDrawPanel mdp = new MyDrawPanel();
		frame.getContentPane().add(mdp);
		
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
	}
	
	/* ---------------------------
		actionPerformed Method
	--------------------------- */
	
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}
	
class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		
		g.fillRect(20, 50, 100, 100);
	}
}