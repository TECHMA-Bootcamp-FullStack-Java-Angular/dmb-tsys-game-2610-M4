package GameM4.GameM4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Help extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Help() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");	
		btnNewButton.setBounds(347, 11, 77, 23);
		getContentPane().add(btnNewButton);
		
		JTextArea txtrElTrozoDe = new JTextArea();
		txtrElTrozoDe.setBackground(SystemColor.inactiveCaptionBorder);
		txtrElTrozoDe.setLineWrap(true);
		txtrElTrozoDe.setText("El trozo de texto estándar de Lorem Ipsum usado desde el año 1500 es reproducido debajo para aquellos interesados. Las secciones 1.10.32 y 1.10.33 de \"de Finibus Bonorum et Malorum\" por Cicero son también reproducidas en su forma original exacta, acompañadas por versiones en Inglés de la traducción realizada en 1914 por H. Rackham.");
		txtrElTrozoDe.setToolTipText("");
		txtrElTrozoDe.setBounds(20, 45, 404, 205);
		contentPane.add(txtrElTrozoDe);
		btnNewButton.addActionListener(showWelcome);
		
	}
	
	ActionListener showWelcome = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Welcome window = new Welcome();
			window.frame.setVisible(true);
			
		}
	};
}
