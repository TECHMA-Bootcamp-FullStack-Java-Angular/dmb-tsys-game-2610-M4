package GameM4.GameM4;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.awt.Color;

public class WelcomeUI {

	JFrame frame;
	private JButton btnAbout;
	private JButton btnHelp;
	private JButton btnPlay;
	private ButtonGroup bgroup;
	private JRadioButton rdbtnJunior;
	private JRadioButton rdbtnMid;
	private JRadioButton rdbtnSenior;
	private static int level = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeUI window = new WelcomeUI();
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
	public WelcomeUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 512, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 22, 496, 2);
		frame.getContentPane().add(separator);
		
		btnAbout = new JButton("About");
		btnAbout.setBounds(407, 0, 89, 23);
		frame.getContentPane().add(btnAbout);	
	    btnAbout.addActionListener(showAbout);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(321, 0, 89, 23);
		frame.getContentPane().add(btnHelp);
		btnHelp.addActionListener(showHelp);
		
		JLabel lblNewLabel = new JLabel("Palabra Oculta");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 52));
		lblNewLabel.setBounds(10, 51, 476, 52);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnPlay = new JButton("Iniciar Juego");		
		btnPlay.setBounds(188, 132, 129, 23);
		frame.getContentPane().add(btnPlay);
		
		rdbtnJunior = new JRadioButton("Junior",true);
		rdbtnJunior.setBounds(114, 198, 69, 23);
		frame.getContentPane().add(rdbtnJunior);
		
		rdbtnMid = new JRadioButton("Mid-Level");
		rdbtnMid.setBounds(215, 198, 83, 23);
		frame.getContentPane().add(rdbtnMid);
		
		rdbtnSenior = new JRadioButton("Senior");
		rdbtnSenior.setBounds(321, 198, 69, 23);
		frame.getContentPane().add(rdbtnSenior);
		
		bgroup = new ButtonGroup();
		bgroup.add(rdbtnJunior);
		bgroup.add(rdbtnMid);
		bgroup.add(rdbtnSenior);
		
		
		JLabel lblNewLabel_1 = new JLabel("Select your level");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(188, 168, 119, 23);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("TEAM 2");
		lblNewLabel_2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 9));
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setBounds(10, 8, 43, 11);
		frame.getContentPane().add(lblNewLabel_2);
		btnPlay.addActionListener(showPlay);
		
		
	}
	
	ActionListener showHelp  =  new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			frame.setVisible(false);
			HelpUI frame = new HelpUI();
			frame.setVisible(true);
			
		}
	};
	
	ActionListener showAbout  =  new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			frame.setVisible(false);
			AboutUI window = new AboutUI();
			window.frame.setVisible(true);
			
		}
	};
	
	ActionListener showPlay = new ActionListener() {
		public void actionPerformed(ActionEvent e) {		
			level = rdbtnSenior.isSelected()?3:rdbtnMid.isSelected()?2:1; ;
			frame.setVisible(false);
			
			JuegoUI windowUi = new JuegoUI();
			windowUi.frame.setVisible(true);
		}
	};

	public static int getLevel() {
		return level;
	}
}	
