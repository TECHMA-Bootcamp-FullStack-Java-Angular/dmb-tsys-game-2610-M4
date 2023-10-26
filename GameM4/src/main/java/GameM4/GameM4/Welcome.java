package GameM4.GameM4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Welcome {

	JFrame frame;
	private JButton btnAbout;
	private JButton btnHelp;
	private JButton btnPlay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 22, 434, 2);
		frame.getContentPane().add(separator);
		
		btnAbout = new JButton("About");
		btnAbout.setBounds(345, 0, 89, 23);
		frame.getContentPane().add(btnAbout);	
	    btnAbout.addActionListener(showAbout);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(258, 0, 89, 23);
		frame.getContentPane().add(btnHelp);
		btnHelp.addActionListener(showHelp);
		
		JLabel lblNewLabel = new JLabel("Palabra Oculta");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 36));
		lblNewLabel.setBounds(103, 35, 250, 86);
		frame.getContentPane().add(lblNewLabel);
		
		btnPlay = new JButton("Iniciar Juego");		
		btnPlay.setBounds(156, 117, 129, 23);
		frame.getContentPane().add(btnPlay);
		btnPlay.addActionListener(showPlay);
		
	}
	
	ActionListener showHelp  =  new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			frame.setVisible(false);
			Help frame = new Help();
			frame.setVisible(true);
			
		}
	};
	
	ActionListener showAbout  =  new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			About window = new About();
			window.frame.setVisible(true);
			
		}
	};
	
	ActionListener showPlay = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			JuegoUI window = new JuegoUI();
			window.frame.setVisible(true);
		}
	};
}	
