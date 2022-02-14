/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package token;

/**
 *
 * @author manu
 */
public class Numero extends Token {
    private static int contador = 0;
    public Numero(String lexema, int columna, int fila) {
        super(lexema, columna, fila, TipoToken.NUMERO_ENTERO);
        contador++;
    }

    public static int getContador(){
        return contador;
    }

    public static void resetCounter(){
        contador = 0;
    }
}
