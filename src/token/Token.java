/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package token;

/**
 *
 * @author manu
 */
public class Token {
    private String lexema;
    private int columna;
    private int fila;
    private TipoToken tipo;

    public Token(String lexema, int columna, int fila, TipoToken tipo){
        this.lexema = lexema;
        this.columna = columna;
        this.fila = fila;
        this.tipo = tipo;
        
    }

    public String getLexema(){
        return lexema;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public TipoToken getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Token [lexema=" + lexema +", columna=" + columna + ", fila=" + fila + ", tipo=" + tipo + "]";
    }

  
    
    
}
