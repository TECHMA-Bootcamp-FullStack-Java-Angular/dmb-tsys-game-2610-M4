package GameM4.GameM4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class About {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
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
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel(" Sergi Rodriguez");
		lblNewLabel.setBounds(64, 61, 153, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAdrian = new JLabel("Adrian Gallego");
		lblAdrian.setBounds(69, 118, 93, 14);
		frame.getContentPane().add(lblAdrian);
		
		JLabel lblDavidMaza = new JLabel("David Maza");
		lblDavidMaza.setBounds(69, 158, 93, 14);
		frame.getContentPane().add(lblDavidMaza);
		
		JLabel lblNewLabel_1 = new JLabel("Realizado por:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(152, 11, 153, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");	
		btnNewButton.setBounds(356, 11, 68, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(showWelcome);
	}
	
	ActionListener showWelcome = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Welcome window = new Welcome();
			window.frame.setVisible(true);
			
		}
	};

}
