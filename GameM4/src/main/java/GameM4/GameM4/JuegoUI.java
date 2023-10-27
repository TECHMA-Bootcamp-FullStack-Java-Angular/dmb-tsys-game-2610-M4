package GameM4.GameM4;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JuegoUI {	
	static JFrame frame;
	private static JLabel dificultad;
	private static JLabel ahorcadoPintado;
	private static JLabel pista1, pista2, pista3, pista4, pista5;
	private static JLabel palabraSecreta;

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
		//creamos ventana y componentes
		initialize();
		//los llenamos
		LogicaJuego.iniciarNuevaPartida();
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

// dificultad
		dificultad = new JLabel("Modo de juego:");
		dificultad.setFont(new Font("Tahoma", Font.BOLD, 14));
		dificultad.setBounds(393, 27, 275, 17);
		frame.getContentPane().add(dificultad);

// menu
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 28, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar juego");
		btnNewButton.addActionListener(terminarPartida);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(48, 51, 267, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResolver = new JButton("Usar Pista");
		btnResolver.addActionListener(obtenerPista);
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResolver.setBounds(48, 101, 267, 40);
		frame.getContentPane().add(btnResolver);

// pistas
		JLabel lblVidas = new JLabel("Pistas");
		lblVidas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVidas.setBounds(50, 164, 134, 20);
		frame.getContentPane().add(lblVidas);
		
		pista1 = new JLabel();
		pista1.setIcon(new ImageIcon(new ImageIcon("img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista1.setBounds(48, 183, 30, 30);
		frame.getContentPane().add(pista1);
		
		pista2 = new JLabel();
		pista2.setIcon(new ImageIcon(new ImageIcon("img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista2.setBounds(83, 183, 30, 30);
		frame.getContentPane().add(pista2);
		
		pista3 = new JLabel();
		pista3.setIcon(new ImageIcon(new ImageIcon("img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista3.setBounds(118, 183, 30, 30);
		frame.getContentPane().add(pista3);
		
		pista4 = new JLabel();
		pista4.setIcon(new ImageIcon(new ImageIcon("img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista4.setBounds(153, 183, 30, 30);
		frame.getContentPane().add(pista4);
		
		pista5 = new JLabel();
		pista5.setIcon(new ImageIcon(new ImageIcon("img\\clue_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista5.setBounds(188, 183, 30, 30);
		frame.getContentPane().add(pista5);
		
// palabra secreta
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPalabraSecreta.setBounds(48, 223, 134, 20);
		frame.getContentPane().add(lblPalabraSecreta);
		
		palabraSecreta = new JLabel("PALABRA_SECRETA_");
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(48, 243, 310, 30);
		frame.getContentPane().add(palabraSecreta);

//ahorcado
		ahorcadoPintado = new JLabel();
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("img\\ahorcado_0.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
		ahorcadoPintado.setBounds(368, 51, 260, 260);
		frame.getContentPane().add(ahorcadoPintado);
		
//teclado
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTeclado.setBounds(48, 298, 105, 20);
		frame.getContentPane().add(lblTeclado);
		
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
	
		
		//mueve la ventana al medio
		frame.setLocationRelativeTo(null);
	}
	
// -------------------------------------------------------------------------------------------
// --------------------------------------    EVENTOS    --------------------------------------
// -------------------------------------------------------------------------------------------
	//evento de botones a modo de teclado para recoger caracter pulsado y hacer una ronda
	ActionListener charBtn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//guardamos datos del boton
			JButton boton = (JButton) e.getSource();
			char btnChar = boton.getText().charAt(0);
			//System.out.println(btnChar);
			
			//pasamos caracter introducido y hacemos una ronda de comprobación
			LogicaJuego.ronda(btnChar);
			
		}
	};
	
	//evento para obtener una pista en caso de que queden pistas
	ActionListener obtenerPista = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LogicaJuego.obtenerPista();
		}
	};
	
	//Accion de ir al menú principal
	ActionListener terminarPartida = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			Welcome windowWelcome = new Welcome();
			windowWelcome.frame.setVisible(true);
		}
	};
	
// -------------------------------------------------------------------------------------------
// --------------------------------------    METODOS    --------------------------------------
// -------------------------------------------------------------------------------------------
	
	//imprime la dificultad(1 a 3)
	public static void printDificultad(int nivel) {
		//conseguimos una palabra dependiendo del nivel
		String strDificultad = "Modo de juego:";
		switch (nivel) {
			case 1:
				strDificultad = "Modo de juego: Junior";
				break;
			case 2:
				strDificultad = "Modo de juego: Mid-Level";
				break;
			case 3:
				strDificultad = "Modo de juego: Senior";
				break;
			default:
				break;
			}
		dificultad.setText(strDificultad);

	}
	
	// imprime las pistas que quedan de 0 a 5
	public static void printPistas(int pistas) {
		//creamos array con tamaño maximo de pistas
		String pathPistas[] = {"img\\clue_1.png","img\\clue_1.png","img\\clue_1.png","img\\clue_1.png","img\\clue_1.png"};
		
		//las ultimas posicionees cambian par quedar desmarcadas
		for (int i = 0; i < 5; i++) {
			if (i >= pistas) {
				pathPistas[i] = "img\\clue_0.png";
			}
		}
		
		//seteamos las imagenes de las pistas
		pista1.setIcon(new ImageIcon(new ImageIcon(pathPistas[0]).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista2.setIcon(new ImageIcon(new ImageIcon(pathPistas[1]).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista3.setIcon(new ImageIcon(new ImageIcon(pathPistas[2]).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista4.setIcon(new ImageIcon(new ImageIcon(pathPistas[3]).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		pista5.setIcon(new ImageIcon(new ImageIcon(pathPistas[4]).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		
	}
	
	//imprime la palabra secreta
	public static void printPalabraSecreta(String palabra) {
		palabraSecreta.setText(palabra);
	}
	
	//imprime la vida del ahorcado (0 to 10)
	public static void printVidaAhorcado(int vidas) {
		String pathImagenAhorcado = "img\\ahorcado_" + vidas + ".png";
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon(pathImagenAhorcado).getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
	}
	
	//imprime imagen del ahorcado ganador
	public static void printAhorcadoGanador() {
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("img\\ahorcado_win.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
	}

}
