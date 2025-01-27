/* 
AER116

Entrada
La entrada consta de una única línea que contiene un número n, 0 ≤ n ≤ 5, que indica cuántos mensajes hay que emitir.

Salida
Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".
*/

public class AER116 { 
    static java.util.Scanner in;
    public static void main(String[] args) {
        int intento;                       // Variable para guardar la entrada
        intento = in.nextInt();    // Leemos un número del teclado
        for(int i=0;i<=intento;i++) {        
            System.out.println("Hola, mundo."); // Escribimos el resultado
        }

    } 
}