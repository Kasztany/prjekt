package pl.edu.pk.projekt.przyrodnicze;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class UsunPanel extends PanelGlowny{

	private JPanel panel;
	private JTextField txtNazwa;
	private Originator originator = new Originator();
	private CareTaker careTaker = new CareTaker();
	
	public UsunPanel() {
		initialize();
	}

	private void initialize() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		originator.setState(null);
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
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		
		final JTextPane txtpnAsdf = new JTextPane();
		txtpnAsdf.setEditable(false);
		String s = "";
		ArrayList<String> str = InformacjeWszystkie.getName();
		for (int i=0;i<InformacjeWszystkie.getSize();i++){
			s += (String) str.toArray()[i] + " ";
		}
		txtpnAsdf.setText(s);
		
		JLabel label_1 = new JLabel("Wpisz nazwę Parku Narodowego :");
		label_1.setFont(new Font("Arial",Font.BOLD,14));
		
		txtNazwa = new JTextField();
		txtNazwa.setColumns(20);
		
		final JLabel lblBrak = new JLabel("");
		final JButton btnUsun = new JButton("Usuń");
		btnUsun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> str3 = InformacjeWszystkie.getName();
				ArrayList<List> list = InformacjeWszystkie.getList();
				
				for(int i=0;i<InformacjeWszystkie.getSize();i++){
					if(txtNazwa.getText().toString().equals((String)InformacjeWszystkie.getName().toArray()[i].toString())){
						InformacjeWszystkie.removeList(list.get(i));
						InformacjeWszystkie.removeName(str3.get(i));
						originator.getStateFromMemento(careTaker.get(0));
						txtNazwa.setText(originator.getState());
						lblBrak.setText("Usunięto !");
					}
					else{
						lblBrak.setText("Zła nazwa Parku !");
					}
				}
			}
		});
		
		JLabel label = new JLabel("Parki Narodowe, które możesz usunąć :");
		label.setFont(new Font("Arial",Font.BOLD,14));
		
		JButton btnOdwierz = new JButton("Odśwież");
		btnOdwierz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s2 = "";
				ArrayList<String> str2 = InformacjeWszystkie.getName();
				for (int i=0;i<InformacjeWszystkie.getSize();i++){
					s2 += (String) str2.toArray()[i] + " ";
				}
				txtpnAsdf.setText(s2);
			}
		});
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnAsdf, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(83)
							.addComponent(btnUsun))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtNazwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(113)
							.addComponent(lblBrak))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOdwierz)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(27)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnAsdf, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOdwierz)
					.addGap(43)
					.addComponent(label_1)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNazwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBrak))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUsun)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
	}
}
