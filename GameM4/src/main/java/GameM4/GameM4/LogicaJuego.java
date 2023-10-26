package GameM4.GameM4;

import java.util.Random;

public class LogicaJuego {

	static String[] palabras = { "BOOTCAMP", "TSYSTEMS", "ANGULAR", "GITHUB", "ORDENADOR", "JUEGO", "PROGRAMACION",
			"JAVA", "ECLIPSE", "DISCORD" };

	public static String palabra = seleccionarPalabra();
	public static char[] letrasUsuariao = { 's', 'u', 'r', 'o' };

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

	public static void ahorcado(String palabra, char[] letrasAdivinadas) {

		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			if (letrasAdivinadas(letrasAdivinadas, letra)) {
				resultado.append(letra);

			} else {
				resultado.append(" _ ");
			}
		}

		System.out.println(resultado.toString());
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
