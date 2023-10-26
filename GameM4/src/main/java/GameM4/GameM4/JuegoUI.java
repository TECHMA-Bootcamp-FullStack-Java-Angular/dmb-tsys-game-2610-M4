package GameM4.GameM4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JuegoUI {
	
	private int vidas = 10;
	private int pistas = 5;
	private String palabraAadivinar = "Hola"; //se recoje de logica
	private char[] caracteresUsuario = {'H', 'J', 'P', 'N'}; // se pasa a Logica
	
	
	private JFrame frame;
	JLabel ahorcadoPintado;
	JLabel pista1;
	JLabel pista2;
	JLabel pista3;
	JLabel pista4;
	JLabel pista5;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoUI window = new JuegoUI();
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
	public JuegoUI() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Ahorcado");
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 28, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar juego");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(48, 51, 267, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResolver = new JButton("Usar Pista");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResolver.setBounds(48, 101, 267, 40);
		frame.getContentPane().add(btnResolver);
		
		
		JLabel lblVidas = new JLabel("Pistas");
		lblVidas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVidas.setBounds(50, 164, 134, 20);
		frame.getContentPane().add(lblVidas);
		
		pista1 = new JLabel();
		pista1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista1.setBounds(48, 183, 30, 30);
		frame.getContentPane().add(pista1);
		
		pista2 = new JLabel();
		pista2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista2.setBounds(83, 183, 30, 30);
		frame.getContentPane().add(pista2);
		
		pista3 = new JLabel();
		pista3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista3.setBounds(118, 183, 30, 30);
		frame.getContentPane().add(pista3);
		
		pista4 = new JLabel();
		pista4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista4.setBounds(153, 183, 30, 30);
		frame.getContentPane().add(pista4);
		
		pista5 = new JLabel();
		pista5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista5.setBounds(188, 183, 30, 30);
		frame.getContentPane().add(pista5);
		
		System.out.println(pista5.getIconTextGap());

		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPalabraSecreta.setBounds(48, 234, 134, 20);
		frame.getContentPane().add(lblPalabraSecreta);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTeclado.setBounds(48, 298, 105, 20);
		frame.getContentPane().add(lblTeclado);
		
		JLabel lblNewLabel_1 = new JLabel("PALABRA_SECRETA_");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(48, 254, 267, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		ahorcadoPintado = new JLabel();
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sergi\\Documents\\eclipse-workspace\\M4\\dmb-tsys-game-2610-M4\\GameM4\\img\\ahorcado_1.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
		ahorcadoPintado.setBounds(368, 40, 260, 260);
		frame.getContentPane().add(ahorcadoPintado);
		
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(charBtn);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnA.setBounds(48, 328, 60, 40);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(charBtn);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnB.setBounds(118, 328, 60, 40);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(charBtn);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBounds(188, 328, 60, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(charBtn);
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnD.setBounds(258, 328, 60, 40);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(charBtn);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnE.setBounds(328, 328, 60, 40);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(charBtn);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnF.setBounds(398, 328, 60, 40);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(charBtn);
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnG.setBounds(468, 328, 60, 40);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(charBtn);
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnH.setBounds(538, 328, 60, 40);
		frame.getContentPane().add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(charBtn);
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnI.setBounds(608, 328, 60, 40);
		frame.getContentPane().add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(charBtn);
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnJ.setBounds(48, 378, 60, 40);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(charBtn);
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnK.setBounds(118, 378, 60, 40);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(charBtn);
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnL.setBounds(188, 378, 60, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(charBtn);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnM.setBounds(258, 378, 60, 40);
		frame.getContentPane().add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(charBtn);
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN.setBounds(328, 378, 60, 40);
		frame.getContentPane().add(btnN);
		
		JButton btnN2 = new JButton("Ñ");
		btnN2.addActionListener(charBtn);
		btnN2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN2.setBounds(398, 378, 60, 40);
		frame.getContentPane().add(btnN2);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(charBtn);
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnO.setBounds(468, 378, 60, 40);
		frame.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(charBtn);
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnP.setBounds(538, 378, 60, 40);
		frame.getContentPane().add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(charBtn);
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnQ.setBounds(608, 378, 60, 40);
		frame.getContentPane().add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(charBtn);
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnR.setBounds(48, 428, 60, 40);
		frame.getContentPane().add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(charBtn);
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnS.setBounds(118, 428, 60, 40);
		frame.getContentPane().add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(charBtn);
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnT.setBounds(188, 428, 60, 40);
		frame.getContentPane().add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(charBtn);
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnU.setBounds(258, 428, 60, 40);
		frame.getContentPane().add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(charBtn);
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnV.setBounds(328, 428, 60, 40);
		frame.getContentPane().add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(charBtn);
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnW.setBounds(398, 428, 60, 40);
		frame.getContentPane().add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(charBtn);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(468, 428, 60, 40);
		frame.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(charBtn);
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnY.setBounds(538, 428, 60, 40);
		frame.getContentPane().add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(charBtn);
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnZ.setBounds(608, 428, 60, 40);
		frame.getContentPane().add(btnZ);
		
		//it moves the window to the middle
		frame.setLocationRelativeTo(null);
	}
	
	ActionListener charBtn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//guardamos datos del boton
			JButton boton = (JButton) e.getSource();
			char btnChar = boton.getText().charAt(0);
			System.out.println(btnChar);
			
			if (btnChar == 'A') {
				pintarVidaAhorcado(1);
			}else if (btnChar == 'B') {
				pintarVidaAhorcado(2);
			}else if (btnChar == 'C') {
				pintarVidaAhorcado(3);
			}else if (btnChar == 'D') {
				pintarVidaAhorcado(4);
			}else if (btnChar == 'E') {
				pintarVidaAhorcado(5);
			}else if (btnChar == 'F') {
				pintarVidaAhorcado(6);
			}else if (btnChar == 'G') {
				pintarVidaAhorcado(7);
			}else if (btnChar == 'H') {
				pintarVidaAhorcado(8);
			}else if (btnChar == 'I') {
				pintarVidaAhorcado(9);
			}else if (btnChar == 'J') {
				pintarVidaAhorcado(10);
			}else if (btnChar == 'K') {
				pintarAhorcadoGanador();
			}
			
		}
	};
	
	public void pintarVidaAhorcado(int vidas) {
		String pathImagenAhorcado = "img\\ahorcado_" + vidas + ".png";
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon(pathImagenAhorcado).getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
	}
	
	public void pintarAhorcadoGanador() {
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("img\\ahorcado_win.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
	}
	
}
