package javaapplication1;
import java.util.Scanner;
public class Menu {
    void Menu(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                    Menú principal Diana Illescas");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Presione 1...............................Para el ingreso de notas");
            System.out.println("Presione 2...............................Para el ingreso de nombres");
            System.out.println("Presione 3...............................Para elejercicio a realizar");
            System.out.println("Presione 4...............................Para salir");
            System.out.print("Ingrese su opción:");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                    OPCIÓN 1");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("¿Cuántas notas va a ingresar?:");
                    int cantidadNotas = scanner.nextInt();
                    double[] notas = new double[cantidadNotas];
                    
                    for (int i = 0; i < cantidadNotas; i++) {
                        System.out.println("...............NOTA #" + (i + 1) + "...............");
                        notas[i] = scanner.nextDouble();
                    }
                    
                    OpcionNumeros opcionNumeros = new OpcionNumeros(notas);
                    
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                    DATOS DE LAS NOTAS INGRESADAS");
                    System.out.println("-----------------------------------------------------------------");
                    double mayor = opcionNumeros.obtenerMayor();
                    System.out.println("El mayor de los números ingresados es: " + mayor);
                    double menor = opcionNumeros.obtenerMejor();
                    System.out.println("El menor de los números ingresados es: " + menor);
                    double promedioSobre20 = opcionNumeros.obtenerPromedioSobre20();
                    System.out.println("El promedio sobre 20 es: " + promedioSobre20);
                    double sumaTotal = opcionNumeros.obtenerSumaTotal();
                    System.out.println("La suma total de los números ingresados es: " + sumaTotal);
                    Menu();
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                    OPCIÓN 2");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("¿Cuántas personas va a ingresar?: ");
                    int cantidadPersonas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea pendiente
                    
                    String[] nombres = new String[cantidadPersonas];
                    for (int i = 0; i < cantidadPersonas; i++) {
                        System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
                        nombres[i] = scanner.nextLine();
                    }
                    Personas personas = new Personas(nombres);
                    personas.mostrarPersonas();
                    Menu();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                    OPCIÓN 3");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    
                    EjercicioPersonal.mostrarParImpar(numero);
                    Menu();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("                    MUCHAS GRACIAS POR SU VISITA");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    Menu();
                    break;
            }
        }
    }
}
