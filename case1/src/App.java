import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1- SALUDAR!
Pides saludo y nombre (ejemplo: ‘Hola’ y ‘Andrés’)
Y te responde ‘Hola Andrés’.
Realizar la función de saludar, de tres maneras diferentes:
1.1- Llamas a la función, sin parámetros, y sin return, y te hace el programa (resultado ejemplo: ‘Hola
Andrés’).
1.2 -- Llamas a la función, con parámetros (saludo y nombre), y sin return, y muestra el resultado
DENTRO de la función (resultado ejemplo: ‘Hola Andrés’).
1.3- Llamas a la función, con parámetros (saludo y nombre), y con return, y muestra el resultado
FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica un saludo");
        String saludo = teclado.nextLine();
        System.out.println("Indica un nombre");
        String nombre = teclado.nextLine();
        System.out.println(saludo + " " + nombre);
        nPnR();
        sPnR(saludo,nombre);
        sPsR(saludo,nombre);
        teclado.close();

        String saludoFinal=sPsR(saludo,nombre);
        System.out.println("\n---con retorno y con parametros:---");
        System.out.println(saludoFinal);
        
    }
    
        // sin retorno y sin parametros:
        public static void nPnR() {
            System.out.println("\n---sin retorno y sin parametros:---");
            System.out.println("Hola Andrés");
         }

        // sin retorno y con parametros saludo y nombre:
        public static void sPnR(String primeraParte, String segundaParte){
            System.out.println("\n---sin retorno y con parametros:---");
            System.out.println(primeraParte + " " + segundaParte);

        }

        // con retorno y con parametros:
        public static String sPsR(String primerParte2, String segundaParte2){
            return (primerParte2 + " " + segundaParte2);
    }

         
    }
