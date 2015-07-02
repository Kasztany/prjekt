package pl.edu.pk.projekt.przyrodnicze;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class InformacjePanel extends PanelGlowny {

	private JPanel panel;
	public InformacjePanel() {
		initialize();
	}

	void initialize(){
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		StworzParkNarodowy tatrzanski = new StworzParkNarodowy();
		StworzParkNarodowy ojcowski = new StworzParkNarodowy();
		StworzParkNarodowy bieszczadzki = new StworzParkNarodowy();
		
        ParkNarodowy t,o,b;
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
		
		JLayeredPane layeredPane = new JLayeredPane();
		panel.add(layeredPane, BorderLayout.CENTER);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 12, 616, 366);
		layeredPane.add(tabbedPane);
		

		List list1 = new List();
		tabbedPane.addTab("Tatrzanski PN", null, list1, null);
		list1.add("Nazwa:");
		list1.add(t.getNazwa());
		list1.add("");
		list1.add("Flora:");
		list1.add(t.getFlora());
		list1.add("");
		list1.add("Fauna:");
		list1.add(t.getFauna());
		list1.add("");
		list1.add("Ciekawe miejsca:");
		list1.add(t.getMiejsce());
		list1.add("");
		list1.add("Opis:");
		list1.add(t.getOpis());
		
		List list2 = new List();
		tabbedPane.addTab("Ojcowski PN", null, list2, null);
		list2.add("Nazwa:");
		list2.add(o.getNazwa());
		list2.add("");
		list2.add("Flora:");
		list2.add(o.getFlora());
		list2.add("");
		list2.add("Fauna:");
		list2.add(o.getFauna());
		list2.add("");
		list2.add("Ciekawe miejsca:");
		list2.add(o.getMiejsce());
		list2.add("");
		list2.add("Opis:");
		list2.add(o.getOpis());
		
		List list3 = new List();
		tabbedPane.addTab("Bieszczadzki PN", null, list3, null);
		list3.add("Nazwa:");
		list3.add(b.getNazwa());
		list3.add("");
		list3.add("Flora:");
		list3.add(b.getFlora());
		list3.add("");
		list3.add("Fauna:");
		list3.add(b.getFauna());
		list3.add("");
		list3.add("Ciekawe miejsca:");
		list3.add(b.getMiejsce());
		list3.add("");
		list3.add("Opis:");
		list3.add(b.getOpis());
		

		NameRepository nameRepository = new NameRepository();
		ListRepository listRepository = new ListRepository();
		for(Iterator iter = nameRepository.getIterator(), iter1 = listRepository.getIterator(); iter.hasNext();){
			tabbedPane.addTab((String) iter.next(),(Component) iter1.next());
		}

	}
}