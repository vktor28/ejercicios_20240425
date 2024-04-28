import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 2- CALCULAR
            Con switch, preguntar la operación, y con switch envíalo a una función diferente
            ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ )que retorne el resultado a la opción del switch y se
            muestre en terminal.

            +EXTRA: Opcional: colocar todo el programa en un bucle que siga funcionando mientras que el usuario no
            escriba “s” (salir).

            +EXTRA: usar char y (+, -, *,/)
         */

         Scanner teclado = new Scanner(System.in);
         boolean calculadora=true;
         while (calculadora) {
         System.out.println("¿Qué operación deseas realizar?");
         //System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n");
         //int tipoOperacion=teclado.nextInt();
         System.out.println("Indica el primer número:");
         int num1=teclado.nextInt();
         System.out.println("Indicar la opración (+,-,+,/)");
         char operador=teclado.next().charAt(0);
         System.out.println("Indica el segundo número:");
         int num2=teclado.nextInt();
         System.out.println("");
         //suma(num1,num2,operador);
        System.out.println(" ");
        /*if(tipoOperacion>0 && tipoOperacion<5){
            System.out.print("El resultado es:");
        }*/
         if(operador=='+'||operador=='-'||operador=='/'||operador=='*'){
            System.out.print("El resultado es:");
        }
        System.out.println();
        //calcular(num1,num2,operador);
        switch (operador) { 
            case '+':
                suma(num1,num2);
                break;
            case '-':
                resta(num1,num2);
                break;
            case '*':
            multiplicacion(num1,num2);
                break;
            case '/':
                division(num1,num2);
                break;
            case 5:
                System.out.println("FIN");
                break;

            default:
             System.out.println("Ha habido un error, no existe esa operación.");;
        }
        teclado.nextLine();
        System.out.println("");
        System.out.println("¿Continuar(C) o Salir (S)?");
        String continuar =teclado.nextLine();
        System.out.println("");
        
        if ((continuar).equalsIgnoreCase("S")) {
            calculadora=false;
            System.out.println("\n------\nFIN");
        }
        
    }

    }
    
    //public static void calcular(double valor1, double valor2, char operacion) {
      //  System.out.println((float)valor1+operacion+valor2);

    //}
    public static void suma(int valor1, int valor2) {
        System.out.println(valor1+valor2);

    }
    public static void resta(int valor1, int valor2) {
        System.out.println(valor1-valor2);

    }
    public static void multiplicacion(int valor1, int valor2) {
        System.out.println(valor1*valor2);

    }
    public static void division(float valor1, float valor2) {
        System.out.println((float)valor1/valor2);

    }


}
