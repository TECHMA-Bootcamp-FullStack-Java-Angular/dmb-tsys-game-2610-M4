package GameM4.GameM4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

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
		JLabel lblNewLabel = new JLabel("Sergi Rodriguez   GitHub: SerotDev");
		lblNewLabel.setBounds(69, 84, 313, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAdrian = new JLabel("Adrian Gallego     GitHub: adriii28");
		lblAdrian.setBounds(69, 118, 255, 14);
		frame.getContentPane().add(lblAdrian);
		
		JLabel lblDavidMaza = new JLabel("David Maza          GitHub: d-maza");
		lblDavidMaza.setBounds(69, 154, 286, 14);
		frame.getContentPane().add(lblDavidMaza);
		
		JLabel lblNewLabel_1 = new JLabel("Made with love team 2 ");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(126, 25, 198, 48);
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
