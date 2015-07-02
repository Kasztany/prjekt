package pl.edu.pk.projekt.przyrodnicze;

import java.awt.Color;

import javax.swing.JButton;

public class ButtonColor extends Dekorator {
	Button button;
	
	public ButtonColor(Button button){
		this.button=button;
		
	}
	public void makeButton() {
		JButton jbutton = new JButton ();
		jbutton.setBackground(Color.green);
	}
	
}
