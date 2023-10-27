package GameM4.GameM4;

import java.util.ArrayList;
import java.util.Random;

public class GameContoller {

	private static final String[] palabrasSencillas = { "PROGRAMA", "JAVA", "CODIGO", "ORDENADOR", "PANTALLA",
			"TECLADO", "ARCHIVO", "ANGULAR", "JUEGO", "ECLIPSE" };
	private static final String[] palabrasIntermedias = { "ALGORITMO", "COMPILACION", "DEPURACION", "ENCAPSULACION",
			"HERENCIA", "POLIMORFISMO", "SUBRUTINA", "INTERFAZ", "REDUCCION", "OPTIMIZACION" };
	private static final String[] palabrasDificiles = { "DESARROLLO", "PARADIGMA", "HEURISTICA", "CRIPTOGRAFIA",
			"ARQUITECTURA", "PARALELISMO", "LATENCIA", "MICROCONTROLADOR", "REFACTORIZACION", "AUTOMATIZACION" };

	private static String secretWord;
	private static int intentos = 10; // decreciente
	private static int lives = 0; // creciente
	private static int pistas = 5; // decreciente
	private static int level = 1;

	private static ArrayList<Character> characterList = new ArrayList<Character>();

	/**
	 * Inicia una nueva partida del juego, restableciendo valores y configuraciones.
	 * Esto incluye la cantidad de fallos, pistas disponibles, y la selección de una
	 * nueva palabra dependiendo del nivel elegido por el jugador.
	 */

	public static void startGame() {

		intentos = 10;
		lives = 0;
		pistas = 5;

		level = WelcomeUI.getLevel();

		switch (level) {

		case 1:
			secretWord = selectRandomWord(palabrasSencillas);
			break;
		case 2:
			secretWord = selectRandomWord(palabrasIntermedias);
			break;
		case 3:
			secretWord = selectRandomWord(palabrasDificiles);
			break;
		default:
			break;
		}

		characterList.clear();

		// Creamos palabra secreta bacia solo para conocer la dimensión
		String secretLineWord = "";
		for (int i = 0; i < secretWord.length(); i++) {
			secretLineWord += " _ ";
		}

		JuegoUI.printDificultad(level);
		JuegoUI.intentosDisponibles(intentos);
		JuegoUI.printPistas(pistas);
		JuegoUI.printVidaAhorcado(lives);
		JuegoUI.printPalabraSecreta(secretLineWord);

	}

	/**
	 * Selecciona una palabra al azar de un array de palabras.
	 *
	 * @param palabras Un array de palabras entre las cuales se seleccionará una al azar.
	 * @return La palabra seleccionada al azar del array.
	 */
	public static String selectRandomWord(String[] palabras) {
		Random pRandom = new Random();
		int randomInt = pRandom.nextInt(palabras.length);
		return palabras[randomInt];
	}

	/**
	 * Realiza una ronda de juego, verificando y manejando la introducción de un carácter.
	 * 
	 * @param inputCharacter El carácter que se ha introducido en la ronda.
	 */
	public static void round(char inputCharacter) {
		if (intentos > 0) {
			characterList.add(inputCharacter);
			wordUnscrambler(secretWord, characterList);
		}

	}

	/**
	 * Proporciona una pista al jugador durante el juego.
	 * 
	 * Si quedan pistas disponibles (pistas >= 0), se agrega la primera letra no
	 * adivinada de la palabra al ArrayList de caracteres adivinados, se actualiza
	 * la representación visual del juego, se disminuye la cantidad de pistas restantes 
	 * y bloqueamos el botón corrrespondiente al caracter de la pista
	 */
	public static void getHint() {
		if (pistas > 0) {
			char charOfHint = hint(characterList, secretWord);
			characterList.add(charOfHint);
			wordUnscrambler(secretWord, characterList);
			pistas--;
			//imprimimos pistas
			JuegoUI.printPistas(pistas);
			//bloqueamos caracter de pista y si no quedan pistas bloqueamos el boton de pista
			JuegoUI.disableButtonByText(String.valueOf(charOfHint));
			if (pistas == 0){
				JuegoUI.disableButtonByText("Usar Pista");
			}
		}
	}

	/**
	 * Encuentra y devuelve la primera letra de la palabra que no está presente en la lista de caracteres.
	 *
	 * @param listaCaracteres La lista de caracteres en la que se busca la ausencia de letras.
	 * @param palabra La palabra en la que se busca la primera letra no presente en la lista.
	 * @return La primera letra de la palabra que no se encuentra en la lista de
	 * caracteres, o el carácter '_' si todas las letras están en la lista.
	 */
	public static char hint(ArrayList<Character> listaCaracteres, String palabra) {
		char caracter = '_';
		for (char letra : palabra.toCharArray()) {
			if (!listaCaracteres.contains(letra)) {
				caracter = letra;
			}
		}
		return caracter;
	}

	/**
	 * Actualiza el estado visual del juego del ahorcado, mostrando la palabra
	 * oculta con letras adivinadas y letras ocultas.
	 *
	 * @param palabra La palabra oculta que se debe adivinar.
	 * @param letrasAdivinadas La lista de letras que el jugador ha adivinado.
	 * @return Una representación de la palabra oculta con letras adivinadas y letras ocultas.
	 */
	public static void wordUnscrambler(String palabra, ArrayList<Character> letrasAdivinadas) {

		level = WelcomeUI.getLevel();
		StringBuilder resultado = new StringBuilder();

		int lives = 0;
		for (char letra : letrasAdivinadas) {
			if (palabra.indexOf(letra) == -1) {
				++lives;

				JuegoUI.printVidaAhorcado(lives);
				intentos = 10 - lives;
				
				if (intentos == 0) {
					JuegoUI.disableButtons();
				}
			}
		}

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			if (letrasAdivinadas.contains(letra)) {
				resultado.append(letra);

			} else {
				resultado.append(" _ ");
			}
		}

		if (resultado.toString().equals(palabra)) {
			JuegoUI.printAhorcadoGanador();
		}

		JuegoUI.palabraSecreta.setText(resultado.toString());

		JuegoUI.intentosDisponibles(intentos);

	}

	/**
	 * Comprueba si una letra ha sido adivinada y está presente en un array de
	 * letras adivinadas.
	 *
	 * @param letrasAdivinadas El array de letras adivinadas.
	 * @param letra La letra que se quiere verificar.
	 * @return true si la letra está presente en el array de letras adivinadas;
	 */

	public static boolean guessedLetters(char[] letrasAdivinadas, char letra) {
		for (char c : letrasAdivinadas) {
			if (c == letra) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Comprueba si se ha ganado el juego al adivinar completamente una palabra oculta.
	 *
	 * @param palabra La palabra a verificar.
	 * @return true si la palabra no contiene caracteres '_', false en caso contrario.
	 */
	public static boolean isWinner(String palabra) {
		return palabra.contains("_") ? false : true;

	}

	public static int getIntentos() {
		return intentos;
	}

	public static void setIntentos(int intentos) {
		GameContoller.intentos = intentos;
	}

}
