package GameM4.GameM4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class Welcome {

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
		lblNewLabel.setBounds(97, 22, 250, 67);
		frame.getContentPane().add(lblNewLabel);
		
		btnPlay = new JButton("Iniciar Juego");		
		btnPlay.setBounds(156, 84, 129, 23);
		frame.getContentPane().add(btnPlay);
		
		rdbtnJunior = new JRadioButton("Junior",true);
		rdbtnJunior.setBounds(111, 146, 69, 23);
		frame.getContentPane().add(rdbtnJunior);
		
		rdbtnMid = new JRadioButton("Mid-Level");
		rdbtnMid.setBounds(184, 146, 83, 23);
		frame.getContentPane().add(rdbtnMid);
		
		rdbtnSenior = new JRadioButton("Senior");
		rdbtnSenior.setBounds(278, 146, 69, 23);
		frame.getContentPane().add(rdbtnSenior);
		
		bgroup = new ButtonGroup();
		bgroup.add(rdbtnJunior);
		bgroup.add(rdbtnMid);
		bgroup.add(rdbtnSenior);
		
		
		JLabel lblNewLabel_1 = new JLabel("Select your level");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(166, 118, 119, 23);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
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
			level = rdbtnSenior.isSelected()?3:rdbtnMid.isSelected()?2:1; ;
			frame.setVisible(false);
			
			JuegoUI windowUi = new JuegoUI();
			JuegoUI.frame.setVisible(true);
		}
	};

	public static int getLevel() {
		return level;
	}
	
}	
