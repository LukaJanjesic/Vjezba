package JAVA;

import javax.swing.JFrame;

class EventHandlingProgram {
	public static void main (String[] args) {
		
		EventHandler Luka = new EventHandler ();
		Luka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Luka.setSize(350, 100);
		Luka.setVisible(true);
		
		
	}
}
