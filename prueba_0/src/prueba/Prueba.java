package prueba;
import java.util.Scanner;// se utiliza para importar la clase Scanner desde el paquete java.util

public class Prueba {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);//use en mi metodo sumar, restar, multiplicar y dividir.
        //forma para tambien ingresar por tecla
        // Leer el entero ingresado por el usuario
        //int numero = scanner.nextInt(); --nextINT si es entero-- nextFLOAT si es decimal y asi
        
        System.out.println("========================================");
        System.out.println("Estudiante: Reyes Zambrano Shadya Nicole");
        System.out.println("Fecha: 8-11-2023");
        System.out.println("Carrera: ITIN");
        System.out.println("NIVEL-PARALELO - NRC: Segundo - Nrc 16129");
        System.out.println("DOCENTE: Ing. Veronica Martinez C. Mgs");
        System.out.println("========================================");

        int op;
        do {
            System.out.println("==MENU DE OPCIONES==");
            System.out.println("1. SUMA.");
            System.out.println("2. RESTA.");
            System.out.println("3. MULTIPLICACION.");
            System.out.println("4. DIVISION.");
            System.out.println("5. EXIT.");
            System.out.print("Ingrese una opcion: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Realizando SUMA...");
                    sumar(scanner); // Pasa la instancia de Scanner al metodo
                    break;
                case 2:
                    System.out.println("Realizando RESTA...");
                    restar(scanner);// Pasa la instancia de Scanner al metodo
                    break;
                case 3:
                    System.out.println("Realizando MULTIPLICACION...");
                    Multi(scanner);
                    break;
                case 4:
                    System.out.println("Realizando DIVISION...");
                    Divi(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente...");
                    break;
            }
        } while (op != 5);

        scanner.close(); // Cierra el objeto Scanner al final del programa
    }
    
    //METODO DE SUM SUBPROGRAMA???
    public static void sumar(Scanner scanner) {
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de sus dos numeros es: " + resultado);
    }

    //METODO DE RESTA SUBPROGRAMA???
    public static void restar(Scanner scanner) {
        System.out.println("Ingrese el primer numero para restar: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero para restar: ");
        int num2 = scanner.nextInt();
        int resultado = num1 - num2;
        System.out.println("La resta de sus dos numeros es: " + resultado);
    }
    //METODO DE MULTIPLICACION SUBPROGRAMA???
    public static void Multi(Scanner scanner) {
        System.out.println("Ingrese el primer numero para Multiplicar: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero para Multiplicar: ");
        int num2 = scanner.nextInt();
        int resultado = num1 * num2;
        System.out.println("La Multiplicacion de sus dos numeros es: " + resultado);
    }
    //METODO DE DIVISION SUBPROGRAMA???
    public static void Divi(Scanner scanner) {
        System.out.println("Ingrese el primer numero para Dividir: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero para Dividir: ");
        int num2 = scanner.nextInt();
        while(num2==0){
            System.out.println("NO PUEDE DIVIDIR PARA CERO, Ingrese nuevamente el segundo numero: ");
            num2 = scanner.nextInt();
        }
        int resultado = num1 / num2;
        System.out.println("La Division de sus dos numeros es: " + resultado);
    } 
}







