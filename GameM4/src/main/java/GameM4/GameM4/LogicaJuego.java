package GameM4.GameM4;

import java.util.Random;


public class LogicaJuego {
	
	static int fallos = 0;
	static int pistas = 0;
	
	static String[] palabras = { "BOOTCAMP", "TSYSTEMS", "ANGULAR", "GITHUB", "ORDENADOR", "JUEGO", "PROGRAMACION",
			"JAVA", "ECLIPSE", "DISCORD" };
	
	String[] palabraSencilla = {"PROGRAMA","JAVA","CÓDIGO","ORDENADOR","PANTALLA","TECLADO","ARCHIVO","ANGULAR","JUEGO","ECLIPSE"};

    String[] palabrasIntermedias = {"ALGORITMO","COMPILACIÓN","DEPURACIÓN","ENCAPSULACIÓN","HERENCIA","POLIMORFISMO","SUBRUTINA","INTERFAZ","REDUCCIÓN","OPTIMIZACIÓN"};

    String[] palabrasDificiles = {"DESARROLLO","PARADIGMA","HEURÍSTICA","CRIPTOGRAFÍA","ARQUITECTURA","PARALELISMO","LATENCIA","MICROCONTROLADOR","REFACTORIZACIÓN","AUTOMATIZACIÓN"};
	

	public static String palabra = seleccionarPalabra();
	
	public static char[] letrasUsuariao = { 's', 'u', 'r', 'o' };
	
	public static int level = Welcome.getLevel();

	public static String seleccionarPalabra() {
		Random pRandom = new Random();
		int randomInt = pRandom.nextInt(palabras.length);
		return palabras[randomInt];
	}
	
	

	public static char pista() {

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
		String palabra = seleccionarPalabra();
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
