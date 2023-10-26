package GameM4.GameM4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JuegoUI {

	JFrame frame;
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
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Ahorcado");
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(48, 38, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPalabraSecreta.setBounds(48, 165, 100, 14);
		frame.getContentPane().add(lblPalabraSecreta);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeclado.setBounds(48, 270, 100, 14);
		frame.getContentPane().add(lblTeclado);
		
		JButton btnNewButton = new JButton("Iniciar juego");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(48, 63, 267, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnResolver.setBounds(48, 109, 267, 40);
		frame.getContentPane().add(btnResolver);
		
		JLabel lblNewLabel_1 = new JLabel("PALABRA_SECRETA_");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(106, 236, 178, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnA.setBounds(44, 295, 50, 40);
		frame.getContentPane().add(btnA);
		
		btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnB.setBounds(98, 295, 50, 40);
		frame.getContentPane().add(btnB);
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.setBounds(154, 295, 50, 40);
		frame.getContentPane().add(btnC);
		
		btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnD.setBounds(210, 295, 50, 40);
		frame.getContentPane().add(btnD);
		
		btnE = new JButton("E");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnE.setBounds(265, 295, 50, 40);
		frame.getContentPane().add(btnE);
		
		btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnJ.setBounds(265, 341, 50, 40);
		frame.getContentPane().add(btnJ);
		
		btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnF.setBounds(44, 341, 50, 40);
		frame.getContentPane().add(btnF);
		
		btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnG.setBounds(98, 341, 50, 40);
		frame.getContentPane().add(btnG);
		
		btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnH.setBounds(154, 341, 50, 40);
		frame.getContentPane().add(btnH);
		
		btnI = new JButton("I");
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnI.setBounds(210, 341, 50, 40);
		frame.getContentPane().add(btnI);
		
		btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnK.setBounds(44, 385, 50, 40);
		frame.getContentPane().add(btnK);
		
		btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnL.setBounds(98, 385, 50, 40);
		frame.getContentPane().add(btnL);
		
		btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnM.setBounds(154, 385, 50, 40);
		frame.getContentPane().add(btnM);
		
		btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnN.setBounds(210, 385, 50, 40);
		frame.getContentPane().add(btnN);
		
		btnNN = new JButton("Ñ");
		btnNN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNN.setBounds(265, 385, 50, 40);
		frame.getContentPane().add(btnNN);
		
		btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnS.setBounds(265, 431, 50, 40);
		frame.getContentPane().add(btnS);
		
		btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnR.setBounds(210, 431, 50, 40);
		frame.getContentPane().add(btnR);
		
		btnQ = new JButton("Q");
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQ.setBounds(154, 431, 50, 40);
		frame.getContentPane().add(btnQ);
		
		btnP = new JButton("P");
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnP.setBounds(98, 431, 50, 40);
		frame.getContentPane().add(btnP);
		
		btnO = new JButton("O");
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnO.setBounds(44, 431, 50, 40);
		frame.getContentPane().add(btnO);
		
		btnY = new JButton("Y");
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnY.setBounds(44, 521, 50, 40);
		frame.getContentPane().add(btnY);
		
		btnT = new JButton("T");
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnT.setBounds(44, 475, 50, 40);
		frame.getContentPane().add(btnT);
		
		btnU = new JButton("U");
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnU.setBounds(98, 475, 50, 40);
		frame.getContentPane().add(btnU);
		
		btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnZ.setBounds(98, 521, 50, 40);
		frame.getContentPane().add(btnZ);
		
		btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnV.setBounds(154, 475, 50, 40);
		frame.getContentPane().add(btnV);
		
		btnW = new JButton("W");
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnW.setBounds(210, 475, 50, 40);
		frame.getContentPane().add(btnW);
		
		btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnX.setBounds(265, 475, 50, 40);
		frame.getContentPane().add(btnX);
		
		lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(48, 190, 35, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(96, 190, 35, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("X");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(141, 190, 35, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("X");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(190, 190, 35, 35);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("X");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(235, 190, 35, 35);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}

}
