package pl.edu.pk.projekt.przyrodnicze;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class DodajPanel extends PanelGlowny {

	private JPanel panel;
	private Originator originator = new Originator();
	private CareTaker careTaker = new CareTaker();

	public DodajPanel() {
		initialize();
	}

	private void initialize() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		originator.setState(null);
		careTaker.add(originator.saveStateToMemento());
		
		originator.setStateB(false);
		careTaker.add(originator.saveStateToMemento());
		
		JButton btnWr = new JButton("Wróć");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelGlowny glowny = new PanelGlowny();
				glowny.setVisible(true);
				setVisible(false);
			}
		});
		panel.add(btnWr, BorderLayout.SOUTH);
		
		
		final JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel label1 = new JLabel("Nazwa");
		label1.setBounds(20, 28, 80, 20);
		panel_1.add(label1);
		
		final TextField textField1 = new TextField();
		textField1.setBounds(110, 28, 200, 20);
		panel_1.add(textField1);

		
		JLabel label2 = new JLabel("Flora");
		label2.setBounds(20, 68, 80, 20);
		panel_1.add(label2);
		
		final TextField textField2 = new TextField();
		textField2.setBounds(110, 68, 200, 20);
		panel_1.add(textField2);

		
		JLabel label3 = new JLabel("Fauna");
		label3.setBounds(20, 108, 80, 20);
		panel_1.add(label3);
		
		final TextField textField3 = new TextField();
		textField3.setBounds(110, 108, 200, 20);
		panel_1.add(textField3);

		
		JLabel label4 = new JLabel("Zabytki");
		label4.setBounds(20, 148, 80, 20);
		panel_1.add(label4);
		
		final TextField textField4 = new TextField();
		textField4.setBounds(110, 148, 200, 20);
		panel_1.add(textField4);

		
		JLabel label5 = new JLabel("Zależne od pogody");
		label5.setBounds(20, 188, 300, 20);
		panel_1.add(label5);
		
		final JRadioButton rdbtnNewRadioButton1 = new JRadioButton("Tak");
		rdbtnNewRadioButton1.setBounds(200, 188, 100, 20);
		panel_1.add(rdbtnNewRadioButton1);

		
		final JRadioButton rdbtnNewRadioButton2 = new JRadioButton("Nie");
		rdbtnNewRadioButton2.setBounds(300, 188, 100, 20);
		panel_1.add(rdbtnNewRadioButton2);

		
		JLabel label6 = new JLabel("Opis");
		label6.setBounds(20, 228, 80, 20);
		panel_1.add(label6);
		
		final TextArea textArea6 = new TextArea();
		textArea6.setBounds(110, 228, 400, 100);
		panel_1.add(textArea6);
		
		final JLabel label7 = new JLabel();
		label7.setBounds(200, 350, 300, 20);
		
		
		JButton jButton = new JButton("Dodaj");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton1.isSelected() == rdbtnNewRadioButton2.isSelected()) {
					label7.setText("Błąd podczas uzupełniania");
					panel_1.add(label7);
					panel_1.repaint();
				}
				else{	
				ParkNarodowy park = new ParkNarodowy();
				park.setNazwa(textField1.getText());
				park.setFlora(textField2.getText());
				park.setFauna(textField3.getText());
				park.setMiejsce(textField4.getText());
				if(rdbtnNewRadioButton2.isSelected()==true)
					park.setSlonceDeszcz(false);
				if(rdbtnNewRadioButton1.isSelected()==true)
					park.setSlonceDeszcz(true);
				park.setOpis(textArea6.getText());
				label7.setText("Dodano!");
				panel_1.add(label7);
				panel_1.repaint();

				List list1 = new List();
							
				list1.add("Nazwa:");
				list1.add(park.getNazwa());
				list1.add("");
				list1.add("Flora:");
				list1.add(park.getFlora());
				list1.add("");
				list1.add("Fauna:");
				list1.add(park.getFauna());
				list1.add("");
				list1.add("Ciekawe miejsca:");
				list1.add(park.getMiejsce());
				list1.add("");
				list1.add("Opis:");
				list1.add(park.getOpis());
				InformacjeWszystkie.addList(list1);
				InformacjeWszystkie.addName(park.getNazwa());
				
				originator.getStateFromMemento(careTaker.get(0));
				textField1.setText(originator.getState());
				textField2.setText(originator.getState());
				textField3.setText(originator.getState());
				textField4.setText(originator.getState());
				textArea6.setText(originator.getState());
				originator.getStateFromMemento(careTaker.get(1));
				rdbtnNewRadioButton1.setSelected(originator.getStateB());
				rdbtnNewRadioButton2.setSelected(originator.getStateB());
				}
			}
		});
		jButton.setBounds(20, 350, 150, 30);
		panel_1.add(jButton);
		
	}
}