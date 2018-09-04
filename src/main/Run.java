package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import main.graphics.Screen;

public class Run {

	public static Gun ak47 = new Gun(6, 20);
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				JFrame frame = new JFrame("Zombies");
				frame.setContentPane(new Screen(900, 600));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
				
			}
			
		});
	}
	
}
