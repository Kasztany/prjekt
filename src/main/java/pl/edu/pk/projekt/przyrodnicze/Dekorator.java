package pl.edu.pk.projekt.przyrodnicze;

import java.awt.Color;

import javax.swing.JButton;

abstract class Dekorator extends Button{
	

	public Dekorator(JButton button) {
		super(button);
		// TODO Auto-generated constructor stub
	}

	public abstract void makeButton(String title);
}
