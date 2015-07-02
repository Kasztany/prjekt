package pl.edu.pk.projekt.przyrodnicze;

import java.awt.Color;

import javax.swing.JButton;

public class RedButton extends JButton {
	protected JButton button;
	
	public RedButton(JButton button){
		this.button = button;
	}

	public void makeButton() {
		button.setBackground(Color.RED);
		//jbutton.setBackground(Color.RED);	
	}
}
