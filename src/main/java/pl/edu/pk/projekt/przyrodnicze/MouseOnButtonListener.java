package pl.edu.pk.projekt.przyrodnicze;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class MouseOnButtonListener extends JPanel implements MouseListener, MouseMotionListener {
		
		private String s;
		private JTextArea jTextArea;
		
		public MouseOnButtonListener(String s, JTextArea jTextArea){
			addMouseListener(this);
			addMouseMotionListener(this);
			this.s=s;
			this.jTextArea=jTextArea;
		}

		public void mouseEntered(MouseEvent e){
			Mouse mouse = new Mouse(s, jTextArea);
			
		}
		
		public void mouseExited(MouseEvent e){
			Mouse mouse = new Mouse(null,jTextArea);
		}

		public void mouseDragged(MouseEvent arg0) {
		}
		
		public void mouseMoved(MouseEvent arg0) {

		}
		public void mouseClicked(MouseEvent e) {
			
		}
		public void mousePressed(MouseEvent e) {;
			
		}
		public void mouseReleased(MouseEvent e) {
			
		}
}

