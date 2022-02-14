/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package token;

/**
 *
 * @author manu
 */
public class Vocal extends Token {
    private static int counterOneVocal = 0;
    private static int counterTwoVocal = 0;
    private static int counterThreeVocal = 0;
    private static int counterFourVocal = 0;
    private static int counterFiveVocal = 0;
    private static final char[] VOCALES = { 'a', 'e', 'i', 'o', 'u' };

    public Vocal(String lexema, int columna, int fila) {
        super(lexema,columna, fila, TipoToken.PALABRA_VOCAL);
        clasificarLexema(lexema);
    }

    public static int getCounterOneVocal() {
        return counterOneVocal;
    }

    public static int getCounterTwoVocal() {
        return counterTwoVocal;
    }

    public static int getCounterThreeVocal() {
        return counterThreeVocal;
    }

    public static int getCounterFourVocal() {
        return counterFourVocal;
    }

    public static int getCounterFiveVocal() {
        return counterFiveVocal;
    }

    public static void resetCounters(){
        counterOneVocal = 0;
        counterTwoVocal = 0;
        counterThreeVocal = 0;
        counterFourVocal = 0;
        counterFiveVocal = 0;
    }

    private void clasificarLexema(String lexema) {
        int cantidadVocales = contarVocales(lexema);
        switch (cantidadVocales) {
            case 1 -> counterOneVocal++;
            case 2 -> counterTwoVocal++;
            case 3 -> counterThreeVocal++;
            case 4 -> counterFourVocal++;
            case 5 -> counterFiveVocal++;

        }
    }

    private int contarVocales(String lexema) {
        int contador = 0;
        for (int i = 0; i < lexema.length(); i++) {
            for (int j = 0; j < VOCALES.length; j++) {
                if (lexema.toLowerCase().charAt(i) == VOCALES[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }   

}
