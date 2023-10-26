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
import java.awt.Font;

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
		txtrElTrozoDe.setText("El juego del ahorcado tiene 10 vidas y 5 ayudas. \n\nLos jugadores adivinan letras para revelar una palabra oculta.\n\nCada letra correcta muestra su posición en la palabra.\n\nLas ayudas proporcionan pistas.\n\nEl juego termina cuando adivinan la palabra o pierden las vidas.\n\nPueden jugar de nuevo.");
		txtrElTrozoDe.setToolTipText("");
		txtrElTrozoDe.setBounds(20, 45, 404, 205);
		contentPane.add(txtrElTrozoDe);
		
		JLabel lblNewLabel = new JLabel("Mecánica del juego");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(127, 12, 131, 19);
		contentPane.add(lblNewLabel);
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
