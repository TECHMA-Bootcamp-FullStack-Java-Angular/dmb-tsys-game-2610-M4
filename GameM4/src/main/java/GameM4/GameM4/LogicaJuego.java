package GameM4.GameM4;

import java.util.Random;

public class LogicaJuego {

	static String[] palabras = { "BOOTCAMP", "TSYSTEMS", "ANGULAR", "GITHUB", "ORDENADOR", "JUEGO", "PROGRAMACION",
			"JAVA", "ECLIPSE", "DISCORD" };

	public static String seleccionarPalabra() {
		Random pRandom = new Random();
		int randomInt = pRandom.nextInt(palabras.length);
		return palabras[randomInt];
	}

	public static String buscarLetra(String palabra, Character[] letra) {
		 char[] palabraEncontrada = new char[palabra.length()];

		System.out.println(palabra);
		
		char[] palabraSeparada = palabra.toCharArray();

		boolean encontrado = false;
		
		for (int i = 0; i < letra.length; i++) {
			
			for (int j = 0; j < palabraSeparada.length; j++) {
				if (letra[i]==palabraSeparada[j]) {
					palabraEncontrada[i] = palabraSeparada[j];
					System.out.println(palabraEncontrada[i]);
				} else {
					palabraSeparada[i] = '-';
					System.out.println(palabraEncontrada[i]);
				}
			}
			
		}
		

		return new String(palabraEncontrada);
	}

	public static boolean hasGanado(String palabra) {
		if (palabra.contains("_")) {
			return false;
		}
		return true;

	}

}
