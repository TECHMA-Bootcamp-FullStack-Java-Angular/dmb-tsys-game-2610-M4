package GameM4.GameM4;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Font;

public class HelpUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpUI frame = new HelpUI();
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
	public HelpUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 342);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");	
		btnNewButton.setBounds(347, 11, 77, 23);
		getContentPane().add(btnNewButton);
		
		JTextArea txtrElTrozoDe = new JTextArea();
		txtrElTrozoDe.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 13));
		txtrElTrozoDe.setBackground(SystemColor.controlHighlight);
		txtrElTrozoDe.setLineWrap(true);
		txtrElTrozoDe.setText("* El juego del ahorcado tiene 10 vidas y 5 ayudas. \r\n\r\n*Los jugadores adivinan letras para revelar una palabra oculta.\r\n\r\n* Cada letra correcta muestra su posición en la palabra.\r\n\r\nLas ayudas proporcionan pistas.\r\n\r\n* El juego termina cuando adivinan la palabra o pierden las vidas.\r\n\r\n* Pueden jugar de nuevo.");
		txtrElTrozoDe.setToolTipText("");
		txtrElTrozoDe.setBounds(33, 61, 404, 205);
		contentPane.add(txtrElTrozoDe);
		
		JLabel lblNewLabel = new JLabel("Mecánica del juego");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(154, 22, 131, 19);
		contentPane.add(lblNewLabel);
		btnNewButton.addActionListener(showWelcome);
		
	}
	
	ActionListener showWelcome = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			WelcomeUI window = new WelcomeUI();
			window.frame.setVisible(true);
			
		}
	};
}
