package GameM4.GameM4;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class AboutUI {

	JFrame frame;
    private int yPos = 252;

	/**
	 * Create the application.
	 */
	public AboutUI() {
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
		JLabel lblNewLabel = new JLabel("GitHub: SerotDev is Sergi Rodriguez");
		lblNewLabel.setBounds(75, 84, 313, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAdrian = new JLabel("GitHub: adriii28 is Adrian Gallego");
		lblAdrian.setBounds(75, 118, 255, 14);
		frame.getContentPane().add(lblAdrian);
		
		JLabel lblDavidMaza = new JLabel("GitHub: d-maza is David Maza");
		lblDavidMaza.setBounds(75, 154, 286, 14);
		frame.getContentPane().add(lblDavidMaza);
		
		JLabel lblNewLabel_1 = new JLabel("Made with love team 2 ");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(75, 25, 198, 48);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");	
		btnNewButton.setBounds(356, 11, 68, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(showWelcome);
		
		/**
		 * Temporizador que realiza una animación de desplazamiento hacia arriba
		 * de varios componentes gráficos en un intervalo de tiempo específico.
		 * El temporizador se inicia y detiene automáticamente cuando se alcanza la posición final.
		 */
	    Timer timer = new Timer(100, new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (yPos > 0) {
	                yPos -= 5;
	                lblNewLabel_1.setLocation(75, yPos );
	                lblAdrian.setLocation(75, yPos + 114); 
	                lblDavidMaza.setLocation(75, yPos + 84);
	                lblNewLabel.setLocation(75, yPos + 54);
	  
	            } else {
	                ((Timer) e.getSource()).stop();
	            }
	        }
	    });
	    timer.start();
		
	}
	

	ActionListener showWelcome = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			frame.setVisible(false);
			WelcomeUI window = new WelcomeUI();	
	
			window.frame.setVisible(true);
			
		}
	};

}
