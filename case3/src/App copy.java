import java.util.Scanner;

public class App {
    public static boolean cacahuetes=true;

    public static void main(String[] args) throws Exception {
        /*
         3- CACATÚA CACAHUETES!
        Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo “cacatúa cacahuetes!”.
        El programa te pregunta qué comida le das.
        Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”
        Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez del mensaje anterior,
        vemos ‘zzZzzzz…’ (aquí acaba el programa)

        *EXTRA: realizar no solo el método 'dormirse()', sino también el de 'pideComida()'
         */

         
         Scanner teclado = new Scanner(System.in);
         while(cacahuetes){
            System.out.println("¿Qué quieres darle de comer?");
            String comida = teclado.nextLine();
            pideComida(comida);
            
         }   
    }
    public static void dormir() {
        System.out.println("\nzzZzzzz…");

    }
    public static void pideComida(String comida) {
        
        if (comida.equalsIgnoreCase("cacahuetes")){
            cacahuetes=false;
            dormir ();
        } else {System.out.println("cacatúa cacahuetes!\n");}
    }
}
