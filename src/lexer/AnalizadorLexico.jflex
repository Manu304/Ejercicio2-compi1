package Lexer;
import Token.*;
import java.util.ArrayList;

%%

/*segunda sección: configuración */

%class AnalizadorLexico
%public
%unicode
%line
%column
%int

%{
    private ArrayList<Vocal> vocales = new ArrayList<>();
    private ArrayList<Numero> numeros = new ArrayList<>();

    public ArrayList<Vocal> getVocales() {
        return vocales;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }
%}

/* declaracion de regex para los tokens*/
WhiteSpace = [\r|\n|\r\n] | [ \t\f]
NUMERO = [0-9]+
VOCAL = [aeiouAEIOU]
LETRA = [bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]
PALABRA = (({LETRA})* ({VOCAL}) ({LETRA})*)+




%eof{
    
%eof}

%%
({WhiteSpace})+ {}

{PALABRA} {vocales.add(new Vocal(yytext(), yycolumn+1, yyline+1));}

{NUMERO} {numeros.add(new Numero(yytext(), yycolumn+1, yyline+1));}



[^] {}