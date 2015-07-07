package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIMain {
	
	public void show(){
		JFrame f = new JFrame( "Uhrzeit" );
	    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    f.setSize( 250, 100 );
	    f.add( new JLabel("Hello World") );
	    f.setVisible( true );
	}

}
