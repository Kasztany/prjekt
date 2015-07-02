package pl.edu.pk.projekt.przyrodnicze;

import java.awt.event.ActionListener;

import javax.swing.JButton;

abstract class Button {
	protected JButton button;
	
	public Button(JButton button){
		this.button = button;
	}
	public void makeButton(String title){
		button.setText(title);
	}
}
