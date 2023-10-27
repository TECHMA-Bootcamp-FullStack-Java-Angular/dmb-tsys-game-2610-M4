package GameM4.GameM4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class LogicaJuego {
	
	private static final String[] palabrasSencillas = {"PROGRAMA","JAVA","CÓDIGO","ORDENADOR","PANTALLA","TECLADO","ARCHIVO","ANGULAR","JUEGO","ECLIPSE"};
	private static final String[] palabrasIntermedias = {"ALGORITMO","COMPILACIÓN","DEPURACIÓN","ENCAPSULACIÓN","HERENCIA","POLIMORFISMO","SUBRUTINA","INTERFAZ","REDUCCIÓN","OPTIMIZACIÓN"};
	private static final String[] palabrasDificiles = {"DESARROLLO","PARADIGMA","HEURÍSTICA","CRIPTOGRAFÍA","ARQUITECTURA","PARALELISMO","LATENCIA","MICROCONTROLADOR","REFACTORIZACIÓN","AUTOMATIZACIÓN"};
	
    private static String palabra;
	private static int fallos = 0; //creciente
	private static int pistas = 5; //decreciente
	private static int nivel = 1;
	private static ArrayList<Character> listaCaracteres = new ArrayList<Character>();
	
	//public static char[] letrasUsuariao = { 's', 'u', 'r', 'o' };
	
	// metodo que inicializa la partida
	public static void iniciarNuevaPartida() {
		//setea valores para iniciar la paartida
		fallos = 0;
		pistas = 5;
		
		//recoge nivel de pantalla de welcome
		nivel = Welcome.getLevel();
		
		//seteamos una palabra dependiendo del nivel
		switch (nivel) {
		case 1:
			palabra = seleccionarPalabra(palabrasSencillas);
			break;
		case 2:
			palabra = seleccionarPalabra(palabrasIntermedias);
			break;
		case 3:
			palabra = seleccionarPalabra(palabrasDificiles);
			break;
		default:
			break;
		}
		
		//limpiamos lista de caracteres
		listaCaracteres.clear();
		
		//creamos palabra secreta bacia solo para conocer la dimensión
		String palabraSecreta = "";
		for (int i = 0; i < palabra.length(); i++) {
			palabraSecreta += " _ ";
		}
		
		//printeamos elementos
		JuegoUI.printDificultad(nivel);
		JuegoUI.printPistas(pistas);
		JuegoUI.printVidaAhorcado(fallos);
		JuegoUI.printPalabraSecreta(palabraSecreta);

	}

	public static String seleccionarPalabra(String[] palabras) {
		Random pRandom = new Random();
		int randomInt = pRandom.nextInt(palabras.length);
		return palabras[randomInt];
	}
	
//->	//metodo de ronda cada vez que se introduce un caracter por la ui
	public static void ronda(char caracterIntroducido) {
		//comprobamos si el caracter introducido ya lo tenemos en la lista para prevenir que se entre 2 veces
		//si es así se almacena caracter en la lista
		listaCaracteres.add(caracterIntroducido);
		
		//comprobamos la lista de caracteres y obtenemos la palabra secreta para mostrarlo en la ui
		
		//actualizamos datos
		
		
	}
	
//->	//metodo que se activa cuando el usuario pulsa para obtener una pista
	public static void obtenerPista() {
		if (pistas >= 0) {
			//obtenemos pista
			
			//comprobamos si jugador ha ganado
			
			//decrementamos n pistas
			pistas--;
			
			//actualizamos UI printeando elementos
			JuegoUI.printPistas(pistas);
			//JuegoUI.printPalabraSecreta(palabraSecreta);
		}
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------
//---------- los otros metodos que tenias, usalos como referencia pero yo algunos los borraria y los reharía ya que por ejemplo 
//---------- los chars de usuario son arraylist
//------------------------------------------------------------------------------------------------------------------------------------------
	
	//mira si las letras entradas por el usuario estan en la palabra
	public static char pista(char[] letrasUsuariao) {

		palabra.chars();
		char charFaltante = 0;
		for (int i = 0; i < palabra.length(); i++) {
			// si no encuenta coincidencia por cada letra de la palabra guarda ese char para
			// retornar
			boolean coincidencia = false;
			for (int j = 0; j < letrasUsuariao.length; j++) {
				if (palabra.charAt(i) == letrasUsuariao[j]) {
					coincidencia = true;
				}
			}
			if (!coincidencia) {
				charFaltante = palabra.charAt(i);
				i = palabra.length();
			}
		}
		return charFaltante;
	}
	
	public static void ahorcado(char[] letrasAdivinadas) {
		nivel = Welcome.getLevel();
		char[] palabraOculta = getPalabraOculta(palabra);
		
		for (int j = 0; j < letrasAdivinadas.length; j++) {
			
	        boolean acierto = false;

			for (int i = 0; i < palabraOculta.length; i++) {
				if (palabra.charAt(i)==letrasAdivinadas[j]) {
					palabraOculta[i] = letrasAdivinadas[j];
	                acierto = true;
				}
			}
			
			if (!acierto) {
	            fallos++; 
	        }

		}
		
		System.out.println(palabra);
		System.out.println(palabraOculta);
		System.out.println(fallos);
	}

//	public static void ahorcado(String palabra, char[] letrasAdivinadas) {
//
//		System.out.println(palabra);
//		StringBuilder resultado = new StringBuilder();
//
//		for (int i = 0; i < palabra.length(); i++) {
//			char letra = palabra.charAt(i);
//			if (letrasAdivinadas(letrasAdivinadas, letra)) {
//				resultado.append(letra);
//
//			} else {
//				resultado.append(" _ ");
//				fallos++;
//			}
//		
//		}
//		
//
//		System.out.println(fallos);
//		System.out.println(resultado.toString());
//	}
	
	private static String getNombreDificultad(int nivel) {
		//conseguimos una palabra dependiendo del nivel
		String strDificultad = "";
		switch (nivel) {
			case 1:
				strDificultad = "Junior";
				break;
			case 2:
				strDificultad = "Mid-Level";
				break;
			case 3:
				strDificultad = "Senior";
				break;
			default:
				break;
			}
		return strDificultad;
	}
	
	private static char[] getPalabraOculta(String palabra) {
		char[] palabraOculta = new char[palabra.length()];
		for (int i = 0; i < palabraOculta.length; i++) {
			palabraOculta[i] = '_';
		}
		return palabraOculta;
	}

	public static boolean letrasAdivinadas(char[] letrasAdivinadas, char letra) {
		for (char c : letrasAdivinadas) {
			if (c == letra) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasGanado(String palabra) {
		if (palabra.contains("_")) {
			return false;
		}
		return true;

	}

}
