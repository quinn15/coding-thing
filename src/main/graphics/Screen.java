package main.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Screen extends JPanel {
	
	public Screen(int x, int y) {
		
		setPreferredSize(new Dimension(x, y));
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setBackground(Color.BLACK);
		
	}
}
