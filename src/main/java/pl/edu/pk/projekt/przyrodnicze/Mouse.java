package pl.edu.pk.projekt.przyrodnicze;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Mouse extends MouseOnButtonListener {
	
	public Mouse(String s, JTextArea jTextArea) {
		super(s, jTextArea);
		if(s!=null){
			jTextArea.setText(s);;
			jTextArea.repaint();
			
		}
		if(s==null){
			jTextArea.removeAll();
			jTextArea.repaint();
		}
			
	}

}
