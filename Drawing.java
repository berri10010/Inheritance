package Overriding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {
	public static void main(String[] args) {
		new Drawing();
	}
	
	public Drawing() {
		// TODO Auto-generated constructor stub
		setSize(1920,1080);
		setTitle("Drawing");
		setVisible(true);
		setBackground(Color.BLACK);
	}
	
	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		//super.paint(arg0);
		arg0.setColor(Color.YELLOW);
		arg0.drawRect(50, 50, 200, 200);
		
		arg0.setColor(new Color(0,0,225));
		arg0.drawOval(100, 400, 100, 100);
		
		arg0.setColor(Color.GREEN);
		arg0.fillRect(550, 100, 400, 400);
		
		arg0.setColor(Color.WHITE);
		arg0.drawString("My String", 700, 700);
	}

}
