package pl.edu.pk.projekt.przyrodnicze;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class PanelGlowny extends JFrame{

	private JPanel contentPane;
	Image img;
	Graphics g;
	
	public static void main( String[] args ) throws IOException{
	    EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelGlowny frame = new PanelGlowny();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
	
	public PanelGlowny() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);

		JButton button1 = new JButton("Wybierz Park");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WybierzPanel wybierz = null;
				try {
					wybierz = new WybierzPanel();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
				wybierz.setVisible(true);
			}
			
		});
		JButton button2 = new JButton("Informacje o Parkach");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformacjePanel informacje = null;
				try {
					informacje = new InformacjePanel();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				informacje.setVisible(true);
				}
		});
		JButton button3 = new JButton("Dodaj Park");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajPanel dodaj = new DodajPanel();
				setVisible(false);
				dodaj.setVisible(true);
			}
		});
		JButton button4 = new JButton("Usuń Park");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsunPanel usun = new UsunPanel();
				setVisible(false);
				usun.setVisible(true);
			}
		});
		JButton button5 = new JButton("Zakończ");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel label = new JLabel("Informacje o Parkach Narodowych w Polsce");
		label.setFont(new Font("Ubuntu", Font.BOLD, 23));
		
		 JDesktopPane desktopPane = new JDesktopPane();
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 527, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(28)
							.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addComponent(button1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 385, 282);
		textArea.setFont(new Font("Arial",Font.BOLD,14));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setText("Witaj! Najedź na odpowiedni przycisk,\naby dowiedzieć się wiecej!");
		button1.addMouseListener(new MouseOnButtonListener("Wybierz Park Narodowy, uzupełniając\nodpowiednie pola w celu wybrania\nnajlepszej opcji.", textArea));
		button2.addMouseListener(new MouseOnButtonListener("Zobacz informacje o Parkach Narodowych\nw Polsce.", textArea));
		button3.addMouseListener(new MouseOnButtonListener("Dodaj Park Narodowy.", textArea));
		button4.addMouseListener(new MouseOnButtonListener("Usuń Park Narodowy.", textArea));
		button5.addMouseListener(new MouseOnButtonListener("Zakończ działanie programu.", textArea));
		
		desktopPane.add(textArea);
		
		contentPane.setLayout(gl_contentPane);
	
		

	}
}
