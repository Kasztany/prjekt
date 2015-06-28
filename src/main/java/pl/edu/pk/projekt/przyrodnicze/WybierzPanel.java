package pl.edu.pk.projekt.przyrodnicze;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class WybierzPanel extends PanelGlowny {

	private JPanel panel;
	private int x=0;
	private int y=0;
	private int z=0;
	public WybierzPanel() throws IOException  {
		initialize();
	}

	private void initialize() throws IOException  {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		panel.setLayout(new BorderLayout(0, 0));
		panel.setVisible(true);
		setContentPane(panel);
		
		StworzParkNarodowy tatrzanski = new StworzParkNarodowy();
		StworzParkNarodowy ojcowski = new StworzParkNarodowy();
		StworzParkNarodowy bieszczadzki = new StworzParkNarodowy();
		
        final ParkNarodowy t;
		final ParkNarodowy o;
		final ParkNarodowy b;
        tatrzanski.stworzParkNarodowy(new TatrzanskiParkNarodowy());
        ojcowski.stworzParkNarodowy(new OjcowskiParkNarodowy());
        bieszczadzki.stworzParkNarodowy(new BieszczadzkiParkNarodowy());
        
        t = tatrzanski.getParkNarodowy();
        o = ojcowski.getParkNarodowy();
        b = bieszczadzki.getParkNarodowy();
		
		JButton btnWr = new JButton("Wróć");
		btnWr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelGlowny glowny = new PanelGlowny();
				setVisible(false);
				glowny.setVisible(true);
			}
		});
		panel.add(btnWr, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setPreferredSize(getMinimumSize());
		comboBox.addItem(t.getFlora());
		comboBox.addItem(o.getFlora());
		comboBox.addItem(b.getFlora());
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setPreferredSize(getMinimumSize());
		comboBox_1.addItem(t.getFauna());
		comboBox_1.addItem(o.getFauna());
		comboBox_1.addItem(b.getFauna());

		final JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setPreferredSize(getMinimumSize());
		comboBox_2.addItem(t.getMiejsce());
		comboBox_2.addItem(o.getMiejsce());
		comboBox_2.addItem(b.getMiejsce());

		JLabel lbl = new JLabel("Flora:");
		
		JLabel lblA = new JLabel("Fauna:");
		
		JLabel lblB = new JLabel("Zabytki:");
		
		JLabel lblC = new JLabel("Zależne od pogody:");
		
		final JRadioButton rdbtnTak = new JRadioButton("Tak");
		
		final JRadioButton rdbtnNie = new JRadioButton("Nie");
		
		final JLabel lblWar = new JLabel("");
		
		JLabel lblWybierz = new JLabel("Wybierz co chcesz zobaczyć");
		lblWybierz.setFont(new Font("Dialog", Font.BOLD, 16));
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		
		JButton btnAkceptuj = new JButton("Akceptuj");
		btnAkceptuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((rdbtnTak.isSelected() && rdbtnNie.isSelected()) || (!rdbtnTak.isSelected() && !rdbtnNie.isSelected())){
					lblWar.setText("Nie mozna zaznaczy dwóch odp na raz!");
				}
				else{
					lblWar.setText("Zaakceptowano!");
					if(comboBox.getSelectedIndex()==0){
						x++;
					}
					if(comboBox.getSelectedIndex()==1){
						y++;
					}
					if(comboBox.getSelectedIndex()==2){
						z++;
					}
					if(comboBox_1.getSelectedIndex()==0){
						x++;
					}
					if(comboBox_1.getSelectedIndex()==1){
						y++;
					}
					if(comboBox_1.getSelectedIndex()==2){
						z++;
					}
					if(comboBox_2.getSelectedIndex()==0){
						x++;
					}
					if(comboBox_2.getSelectedIndex()==1){
						y++;
					}
					if(comboBox_2.getSelectedIndex()==2){
						z++;
					}
					if(rdbtnTak.isSelected()){
						x++;
						z++;
					}
					if(rdbtnNie.isSelected()){
						y++;
					}
					
					if(x>y && x>z){
						textPane.setText("Miejsce, które chcesz zwiedzić to: "+ t.getNazwa());
					}
					if(y>x && y>z){
						textPane.setText("Miejsce, które chcesz zwiedzić to: "+ o.getNazwa());	
					}
					if(z>x && z>y){
						textPane.setText("Miejsce, które chcesz zwiedzić to: "+ b.getNazwa());	
					}
					if(x==y && x>z){
						textPane.setText("Miejsca, które chcesz zwiedzić to: "+t.getNazwa() + " i " + o.getNazwa());		
					}
					if(x==z && x>y){
						textPane.setText("Miejsca, które chcesz zwiedzić to: "+t.getNazwa() + " i " + b.getNazwa());		
					}
					if(y==z && y>x){
						textPane.setText("Miejsca, które chcesz zwiedzić to: "+o.getNazwa() + " i " + b.getNazwa());		
					}

					x=0;
					y=0;
					z=0;
				}
			}
		});
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(51))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblB, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblA, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1, 0, 473, Short.MAX_VALUE)
								.addComponent(comboBox_2, 0, 473, Short.MAX_VALUE)
								.addComponent(comboBox, 0, 473, Short.MAX_VALUE))
							.addGap(63))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblC)
							.addGap(33)
							.addComponent(rdbtnTak)
							.addGap(36)
							.addComponent(rdbtnNie)
							.addContainerGap(319, Short.MAX_VALUE))))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAkceptuj)
					.addGap(66)
					.addComponent(lblWar)
					.addContainerGap(188, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(191)
					.addComponent(lblWybierz)
					.addContainerGap(198, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWybierz)
					.addGap(39)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblA)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblB))
					.addGap(34)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblC)
						.addComponent(rdbtnTak)
						.addComponent(rdbtnNie))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAkceptuj)
						.addComponent(lblWar))
					.addGap(18)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
	}
}