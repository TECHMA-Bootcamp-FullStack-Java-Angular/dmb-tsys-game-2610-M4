package GameM4.GameM4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class JuegoUI {	
	
	public JFrame frame;
	private static JButton btnResolver;
	private static JLabel dificultad, lblintentos;
	private static JLabel ahorcadoPintado;
	private static JLabel pista1, pista2, pista3, pista4, pista5;
	public static JLabel palabraSecreta;
	public static ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Create the application.
	 */
	public JuegoUI() {
		//creamos ventana y componentes
		initialize();
		//los llenamos
		GameContoller.startGame();
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

		dificultad = new JLabel("Modo de juego:");
		dificultad.setFont(new Font("Tahoma", Font.BOLD, 14));
		dificultad.setBounds(393, 27, 275, 17);
		frame.getContentPane().add(dificultad);

		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 28, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar juego");
		btnNewButton.addActionListener(finishGame);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(48, 51, 267, 40);
		frame.getContentPane().add(btnNewButton);
		
		btnResolver = new JButton("Usar Pista");
		buttonGroup.add(btnResolver);
		btnResolver.addActionListener(obtenerPista);
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResolver.setBounds(48, 101, 267, 40);
		frame.getContentPane().add(btnResolver);
		
		
		
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
		
		
		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPalabraSecreta.setBounds(48, 223, 134, 20);
		frame.getContentPane().add(lblPalabraSecreta);
		
		palabraSecreta = new JLabel("PALABRA_SECRETA_");
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(48, 243, 310, 30);
		frame.getContentPane().add(palabraSecreta);

		

		ahorcadoPintado = new JLabel();
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("img\\ahorcado_0.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
		ahorcadoPintado.setBounds(368, 51, 260, 260);
		frame.getContentPane().add(ahorcadoPintado);

		
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTeclado.setBounds(48, 298, 105, 20);
		frame.getContentPane().add(lblTeclado);
		
		JButton btnA = new JButton("A");
		buttonGroup.add(btnA);
		btnA.addActionListener(charBtn);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnA.setBounds(48, 328, 60, 40);
		frame.getContentPane().add(btnA);
	
		JButton btnB = new JButton("B");
		buttonGroup.add(btnB);
		btnB.addActionListener(charBtn);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnB.setBounds(118, 328, 60, 40);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		buttonGroup.add(btnC);
		btnC.addActionListener(charBtn);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBounds(188, 328, 60, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		buttonGroup.add(btnD);
		btnD.addActionListener(charBtn);
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnD.setBounds(258, 328, 60, 40);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		buttonGroup.add(btnE);
		btnE.addActionListener(charBtn);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnE.setBounds(328, 328, 60, 40);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		buttonGroup.add(btnF);
		btnF.addActionListener(charBtn);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnF.setBounds(398, 328, 60, 40);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		buttonGroup.add(btnG);
		btnG.addActionListener(charBtn);
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnG.setBounds(468, 328, 60, 40);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		buttonGroup.add(btnH);
		btnH.addActionListener(charBtn);
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnH.setBounds(538, 328, 60, 40);
		frame.getContentPane().add(btnH);
		
		JButton btnI = new JButton("I");
		buttonGroup.add(btnI);
		btnI.addActionListener(charBtn);
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnI.setBounds(608, 328, 60, 40);
		frame.getContentPane().add(btnI);
		
		JButton btnJ = new JButton("J");
		buttonGroup.add(btnJ);
		btnJ.addActionListener(charBtn);
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnJ.setBounds(48, 378, 60, 40);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		buttonGroup.add(btnK);
		btnK.addActionListener(charBtn);
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnK.setBounds(118, 378, 60, 40);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		buttonGroup.add(btnL);
		btnL.addActionListener(charBtn);
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnL.setBounds(188, 378, 60, 40);
		frame.getContentPane().add(btnL);
		
		JButton btnM = new JButton("M");
		buttonGroup.add(btnM);
		btnM.addActionListener(charBtn);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnM.setBounds(258, 378, 60, 40);
		frame.getContentPane().add(btnM);
		
		JButton btnN = new JButton("N");
		buttonGroup.add(btnN);
		btnN.addActionListener(charBtn);
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN.setBounds(328, 378, 60, 40);
		frame.getContentPane().add(btnN);
		
		JButton btnN2 = new JButton("Ñ");
		buttonGroup.add(btnN2);
		btnN2.addActionListener(charBtn);
		btnN2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnN2.setBounds(398, 378, 60, 40);
		frame.getContentPane().add(btnN2);
		
		JButton btnO = new JButton("O");
		buttonGroup.add(btnO);
		btnO.addActionListener(charBtn);
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnO.setBounds(468, 378, 60, 40);
		frame.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		buttonGroup.add(btnP);
		btnP.addActionListener(charBtn);
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnP.setBounds(538, 378, 60, 40);
		frame.getContentPane().add(btnP);
		
		JButton btnQ = new JButton("Q");
		buttonGroup.add(btnQ);
		btnQ.addActionListener(charBtn);
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnQ.setBounds(608, 378, 60, 40);
		frame.getContentPane().add(btnQ);
		
		JButton btnR = new JButton("R");
		buttonGroup.add(btnR);
		btnR.addActionListener(charBtn);
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnR.setBounds(48, 428, 60, 40);
		frame.getContentPane().add(btnR);
		
		JButton btnS = new JButton("S");
		buttonGroup.add(btnS);
		btnS.addActionListener(charBtn);
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnS.setBounds(118, 428, 60, 40);
		frame.getContentPane().add(btnS);
		
		JButton btnT = new JButton("T");
		buttonGroup.add(btnT);
		btnT.addActionListener(charBtn);
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnT.setBounds(188, 428, 60, 40);
		frame.getContentPane().add(btnT);
		
		JButton btnU = new JButton("U");
		buttonGroup.add(btnU);
		btnU.addActionListener(charBtn);
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnU.setBounds(258, 428, 60, 40);
		frame.getContentPane().add(btnU);
		
		JButton btnV = new JButton("V");
		buttonGroup.add(btnV);
		btnV.addActionListener(charBtn);
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnV.setBounds(328, 428, 60, 40);
		frame.getContentPane().add(btnV);
		
		JButton btnW = new JButton("W");
		buttonGroup.add(btnW);
		btnW.addActionListener(charBtn);
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnW.setBounds(398, 428, 60, 40);
		frame.getContentPane().add(btnW);
		
		JButton btnX = new JButton("X");
		buttonGroup.add(btnX);
		btnX.addActionListener(charBtn);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(468, 428, 60, 40);
		frame.getContentPane().add(btnX);
		
		JButton btnY = new JButton("Y");
		buttonGroup.add(btnY);
		btnY.addActionListener(charBtn);
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnY.setBounds(538, 428, 60, 40);
		frame.getContentPane().add(btnY);
		
		JButton btnZ = new JButton("Z");
		buttonGroup.add(btnZ);
		btnZ.addActionListener(charBtn);
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnZ.setBounds(608, 428, 60, 40);
		frame.getContentPane().add(btnZ);
			
		lblintentos = new JLabel("Intentos:");
		lblintentos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblintentos.setBounds(198, 223, 134, 20);
		frame.getContentPane().add(lblintentos);
	
		
		frame.setLocationRelativeTo(null);
	}
	

	/**
	 * 
	 * El evento de botones a modo de teclado se refiere a la funcionalidad 
	 * en la cual se utilizan botones gráficos en una interfaz de usuario para simular un teclado.
	 * 
	 * @param ActionEvent Para crear una instancia de un botón que represente un 
	 * 						carácter y capturar ese carácter al presionar el botón
	 *
	 */
	
	ActionListener charBtn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			char btnChar = boton.getText().charAt(0);
			System.out.println(btnChar);
			
			GameContoller.round(btnChar);
			boton.setEnabled(false);
			
		}
	};
	
	/**
	 * 
	 * Evento por el cual el usuario recibira una pista, en caso de que 
	 * todavia tenga vidas disponibles
	 * 
	 * */
	
	ActionListener obtenerPista = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GameContoller.getHint();
		}
	};
	
	/**
	 * 
	 * Evento con el cual se terminara la partida e ira al menu
	 * principal
	 * 
	 * */
	
	ActionListener finishGame = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			WelcomeUI windowWelcome = new WelcomeUI();
			windowWelcome.frame.setVisible(true);
		}
	};
	

	/**
	* 
	* Selecciona la dificultad del juego pasando el parámetro 'nivel' 
	* 
	* @param nivel Aquí se especifica el nivel de dificultad deseado por el usuario para el juego.
	* 
	* */
	public static void printDificultad(int nivel) {
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
	
	/**
	* 
	* Imprime el número de intentos disponibles para el usuario.
	* 
	* @param intentos El numero de intentos que tiene el usuario
	* 
	* */
	public static void intentosDisponibles(int intentos) {
		String intentosStr = "Intentos: "+ intentos;
		lblintentos.setText(intentosStr);

	}
	
	/**
	 * 
	 * Imprime por pantalla las imagenes de las pistas, y maneja las pistas que tiene el 
	 * usuario en la partida
	 * 
	 * @param
	 * 
	 * */
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
	
	/**
	 * 
	 * Metodo que sirve para imprimir por pantalla la palabra, que se mostrara oculta
	 * y los caracteres adivinados
	 * 
	 * @param palabra Este parametro es la palabra que se va a imprimir
	 * 
	 * */
	public static void printPalabraSecreta(String palabra) {
		palabraSecreta.setText(palabra);
	}
	

	/**
	 * 
	 * Imprime las vidas que tiene el usuario
	 * 
	 * @param vidas Parametro por el cual se pasan las vidas 
	 * 
	 * */
	public static void printVidaAhorcado(int vidas) {
		String pathImagenAhorcado = "img\\ahorcado_" + vidas + ".png";
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon(pathImagenAhorcado).getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
	}
	
	/**
	 * 
	 * Muestra la imagen de victoria, en caso de que el jugador acierte la palabra
	 * 
	 * */	
	public static void printAhorcadoGanador() {
		ahorcadoPintado.setIcon(new ImageIcon(new ImageIcon("img\\ahorcado_win.png").getImage().getScaledInstance(260, 260, Image.SCALE_DEFAULT)));
		btnResolver.setEnabled(false);
		disableButtons();
	}
	
	/**
	 * 
	 * Metodo que desctiva todos los botones para cuando el jugador gane, 
	 * no pueda manipular el teclado
	 * 
	 * */	
	public static void disableButtons() {
		 Enumeration<AbstractButton> buttons = buttonGroup.getElements();
	        while (buttons.hasMoreElements()) {
	            AbstractButton button = buttons.nextElement();
	            button.setEnabled(false);
	        }
	        lblintentos.setText("Intentos: 0");
	}
	
}
