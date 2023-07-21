package Laboratorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Laboratorio> laboratorios = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();

        while (true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("          Gestionar Horarios de Laboratorios");
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Agregar Laboratorio");
            System.out.println("2. Asignar Horario a Asignatura");
            System.out.println("3. Mostrar Información de los Laboratorios");
            System.out.println("4. Mostrar Laboratorios Disponibles en Horario");
            System.out.println("5. Mostrar Horario Completo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: 	
                    // Agregar Laboratorio
                	System.out.println("----------------------------------------------------------");
                    System.out.println("              Agregar Laboratorio");
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Ingrese el nombre del laboratorio: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la carrera: ");
                    String carrera = scanner.next();
                    System.out.print("Ingrese el profesor1: ");
                    String profesor = scanner.next();
                    System.out.print("Ingrese el curso: ");
                    String curso = scanner.next();
                    System.out.print("Ingrese la capacidad del laboratorio: ");
                    int capacidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    Set<String> equipos = new HashSet<>();
                    while (true) {
                        System.out.print("Ingrese un equipo1 del laboratorio (o ingrese 'q' para terminar): ");
                        String equipo = scanner.nextLine();
                        if (equipo.equals("q")) {
                            break;
                        }
                        equipos.add(equipo);
                    }
                    Laboratorio laboratorio = new Laboratorio(nombre, capacidad, equipos);
                    laboratorios.add(laboratorio);
                    System.out.println("Laboratorio agregado correctamente");
                    break;
                case 2:
                    // Asignar Horario a Asignatura
                	System.out.println("----------------------------------------------------------");
                    System.out.println("        Asignar Horario a Asignatura");
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Ingrese el nombre de la asignatura: ");
                    String nombreAsignatura = scanner.next();
                    System.out.print("Ingrese el horario de la asignatura  (ejemplo 7:00): ");
                    String horario = scanner.next();

                    // Mostrar lista de laboratorios disponibles
                    System.out.println("----------------------------------------------------------");
                    System.out.println("             Laboratorios Disponibles:");
                    System.out.println("----------------------------------------------------------");
                    for (int i = 0; i < laboratorios.size(); i++) {
                        System.out.println((i + 1) + ". " + laboratorios.get(i).getNombre());
                    }

                    System.out.print("Seleccione el número de laboratorio al que desea asignar el horario: ");
                    int numeroLaboratorio = scanner.nextInt();
                    if (numeroLaboratorio >= 1 && numeroLaboratorio <= laboratorios.size()) {
                        Laboratorio labSeleccionado = laboratorios.get(numeroLaboratorio - 1);
                        if (labSeleccionado.verificarDisponibilidad(horario, asignaturas)) {
                            Asignatura asignatura = new Asignatura(nombreAsignatura, horario);
                            asignatura.asignarLaboratorio(labSeleccionado);
                            asignaturas.add(asignatura);
                            System.out.println("Asignatura asignada correctamente al laboratorio " + labSeleccionado.getNombre());
                        } else {
                            System.out.println("El laboratorio seleccionado no está disponible en ese horario");
                        }
                    } else {
                        System.out.println("Número de laboratorio inválido");
                    }
                    break;
                case 3:
                    // Mostrar Información de los Laboratorios
                	System.out.println("----------------------------------------------------------");
                    System.out.println("          Información de los Laboratorios");
                    System.out.println("----------------------------------------------------------");
                    for (Laboratorio lab : laboratorios) {
                        System.out.println("Nombre: " + lab.getNombre());
                        System.out.println("Capacidad: " + lab.getCapacidad());
                        System.out.println("Equipos: " + lab.getEquipos());
                        System.out.println("---------------------------");
                    }
                    break;
                case 4:
                    // Mostrar Laboratorios Disponibles en Horario
                	System.out.println("----------------------------------------------------------");
                    System.out.println("     Mostrar Laboratorios Disponibles en Horario");
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Ingrese el horario: ");
                    String horarioBusqueda = scanner.next();
                    List<Laboratorio> laboratoriosDisponibles = new ArrayList<>();
                    for (Laboratorio lab : laboratorios) {
                        if (lab.verificarDisponibilidad(horarioBusqueda, asignaturas)) {
                            laboratoriosDisponibles.add(lab);
                        }
                    }
                    if (laboratoriosDisponibles.isEmpty()) {
                        System.out.println("No hay laboratorios disponibles en ese horario");
                    } else {
                        System.out.println("Laboratorios disponibles en el horario " + horarioBusqueda + ":");
                        for (Laboratorio lab : laboratoriosDisponibles) {
                            System.out.println("Nombre: " + lab.getNombre());
                            System.out.println("Capacidad: " + lab.getCapacidad());
                            System.out.println("Equipos: " + lab.getEquipos());
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 5:
                    // Mostrar Horario Completo
                	System.out.println("----------------------------------------------------------");
                    System.out.println("                  Horario Completo");
                    System.out.println("----------------------------------------------------------");
                    if (asignaturas.isEmpty()) {
                        System.out.println("No se han asignado asignaturas aún.");
                    } else {
                        for (Asignatura asignatura : asignaturas) {
                            System.out.println("Materia: " + asignatura.getNombre());
                            System.out.println("Horario: " + asignatura.getHorario());
                            System.out.println("Laboratorio: " + asignatura.getLaboratorio().getNombre());
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 6:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
