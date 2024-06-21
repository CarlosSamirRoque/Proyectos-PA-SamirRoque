package tarea1.uth.trabajos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	
        	  //Menu de seleccion	
        	
            System.out.println("----------------------------------------");
            System.out.println("                 MENU                   ");
            System.out.println("----------------------------------------");
            System.out.println("----SELECCIONA UNA OPCION DE CALCULO----");
            System.out.println("- 1. Area de circulo                   -");
            System.out.println("- 2. Area de cuadrado                  -");
            System.out.println("- 3. Area de rectángulo                -");
            System.out.println("- 4. Area de triángulo                 -");
            System.out.println("- 5. Salir                             -");
            System.out.println("----------------------------------------");

            //luego de seleccionar la opcion empezamos a trabajar dependiendo lo anterior elegimos
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                	
                    System.out.print("Ingresar la cantidad del radio del círculo: ");
                    double rad = scanner.nextDouble();
                    System.out.println("Area del circulo es: " + calcularAreaCirculo(rad));
                    break;
                    
                case 2:
                	
                    System.out.print("Ingrese la cantidad de el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Area del cuadrado es: " + calcularAreaCuadrado(lado));
                    break;
                    
                case 3:
                	
                    System.out.print("Ingrese la cantidad de la longitud del rectángulo: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de la anchura del rectángulo: ");
                    double anchura = scanner.nextDouble();
                    System.out.println("Area del rectangulo es: " + calcularAreaRectangulo(longitud, anchura));
                    break;
                    
                case 4:
                	
                    System.out.print("Ingrese la cantidad de la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad de la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Area del triangulo es: " + calcularAreaTriangulo(base, altura));
                    break;
                    
                    //Si deseas cerrar el programa con la opcion 5 tiene el comando de cerrado
                    //leyendo el scanner con el comando close
                    
                case 5:
                	
                    System.out.println("Cerrando...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Prueba de nuevo.");
            }
        }
    }

    
    //Formulas necesarias pra cada proceso
    
    
       public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
       }

       public static double calcularAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
       }

       public static double calcularAreaRectangulo(double longitud, double anchura) {
        return longitud * anchura;
       }

       public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
       }
}