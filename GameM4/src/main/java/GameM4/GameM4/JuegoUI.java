package GameM4.GameM4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class JuegoUI {


	private JFrame frame;

	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnNN;
	private JButton  btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;

	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

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
		lblNewLabel.setBounds(48, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPalabraSecreta.setBounds(48, 228, 134, 20);
		frame.getContentPane().add(lblPalabraSecreta);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTeclado.setBounds(48, 298, 105, 20);
		frame.getContentPane().add(lblTeclado);
		
		JButton btnNewButton = new JButton("Iniciar juego");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(48, 63, 267, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResolver.setBounds(48, 113, 267, 40);
		frame.getContentPane().add(btnResolver);
		
		JLabel lblNewLabel_1 = new JLabel("PALABRA_SECRETA_");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(48, 258, 267, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JButton btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnA.setBounds(48, 328, 60, 40);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnB.setBounds(118, 328, 60, 40);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBounds(188, 328, 60, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnD.setBounds(258, 328, 60, 40);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnE.setBounds(328, 328, 60, 40);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnF.setBounds(398, 328, 60, 40);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnG.setBounds(468, 328, 60, 40);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnH.setBounds(538, 328, 60, 40);
		frame.getContentPane().add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnI.setBounds(608, 328, 60, 40);
		frame.getContentPane().add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnJ.setBounds(48, 378, 60, 40);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnK.setBounds(118, 378, 60, 40);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnL.setBounds(188, 378, 60, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnM.setBounds(258, 378, 60, 40);
		frame.getContentPane().add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN.setBounds(328, 378, 60, 40);
		frame.getContentPane().add(btnN);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnÑ.setBounds(398, 378, 60, 40);
		frame.getContentPane().add(btnÑ);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnO.setBounds(468, 378, 60, 40);
		frame.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnP.setBounds(538, 378, 60, 40);
		frame.getContentPane().add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnQ.setBounds(608, 378, 60, 40);
		frame.getContentPane().add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnR.setBounds(48, 428, 60, 40);
		frame.getContentPane().add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnS.setBounds(118, 428, 60, 40);
		frame.getContentPane().add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnT.setBounds(188, 428, 60, 40);
		frame.getContentPane().add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnU.setBounds(258, 428, 60, 40);
		frame.getContentPane().add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnV.setBounds(328, 428, 60, 40);
		frame.getContentPane().add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnW.setBounds(398, 428, 60, 40);
		frame.getContentPane().add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(468, 428, 60, 40);
		frame.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnY.setBounds(538, 428, 60, 40);
		frame.getContentPane().add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnZ.setBounds(608, 428, 60, 40);
		frame.getContentPane().add(btnZ);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(368, 40, 267, 252);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblVidas = new JLabel("Vidas");
		lblVidas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVidas.setBounds(48, 174, 134, 20);
		frame.getContentPane().add(lblVidas);;
		
		
	}
}
