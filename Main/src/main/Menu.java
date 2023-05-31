package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Profesor> profesores = new ArrayList<>();
    private static final List<Alumno> alumnos = new ArrayList<>();
    private static final List<Materia> materias = new ArrayList<>();
    private static final List<Matricula> matriculas = new ArrayList<>();

    public static void mostrarMenu() {
        int opcion =0;
        do {
            System.out.println("\nGestión Matriculas");
            System.out.println("1. Profesores");
            System.out.println("2. Alumnos");
            System.out.println("3. Materias");
            System.out.println("4. Gestión Matriculas");
            System.out.println("5. Total Matriculados");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    ingresarProfesores();
                    break;
                case 2:
                    ingresarAlumnos();
                    break;
                case 3:
                    ingresarMaterias();
                    break;
                case 4:
                    gestionMatriculas();
                    break;
                case 5:
                    totalMatriculados();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 6);
    }

    private static void ingresarProfesores() {
        System.out.println("\nIngresar Profesores");
        System.out.print("Ingrese la cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el celular: ");
        String celular = scanner.nextLine();

        Profesor profesor = new Profesor(cedula, nombre, direccion, telefono, celular);
        profesores.add(profesor);

        System.out.println("Profesor ingresado correctamente.");
    }

    private static void ingresarAlumnos() {
        System.out.println("\nIngresar Alumnos");
        System.out.print("Ingrese la cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el celular: ");
        String celular = scanner.nextLine();

        Alumno alumno = new Alumno(cedula, nombre, direccion, telefono, celular);
        alumnos.add(alumno);

        System.out.println("Alumno ingresado correctamente.");
    }

    private static void ingresarMaterias() {
        System.out.println("\nIngresar Materias");
        System.out.print("Ingrese el nombre de la materia: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione un profesor para asignar a la materia:");
        mostrarProfesores();

        System.out.print("Ingrese el índice del profesor: ");
        int indiceProfesor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        if (indiceProfesor >= 0 && indiceProfesor < profesores.size()) {
            Profesor profesor = profesores.get(indiceProfesor);

            Materia materia = new Materia(nombre, profesor);
            materias.add(materia);

            System.out.println("Materia ingresada correctamente.");
        } else {
            System.out.println("Índice de profesor inválido.");
        }
    }

private static void gestionMatriculas() {
    System.out.println("\nGestión de Matrículas");

    if (alumnos.isEmpty() || materias.isEmpty()) {
        System.out.println("No hay alumnos o materias registradas.");
        return;
    }

    System.out.println("Seleccione un alumno:");
    mostrarAlumnos();

    System.out.print("Ingrese el índice del alumno: ");
    int indiceAlumno = scanner.nextInt();
    scanner.nextLine(); // Limpiar el salto de línea

    if (indiceAlumno < 0 || indiceAlumno >= alumnos.size()) {
        System.out.println("Índice de alumno inválido.");
        return;
    }

    System.out.println("Seleccione una materia:");
    mostrarMaterias();

    System.out.print("Ingrese el índice de la materia: ");
    int indiceMateria = scanner.nextInt();
    scanner.nextLine(); // Limpiar el salto de línea

    if (indiceMateria < 0 || indiceMateria >= materias.size()) {
        System.out.println("Índice de materia inválido.");
        return;
    }

    Alumno alumno = alumnos.get(indiceAlumno);
    Materia materia = materias.get(indiceMateria);

    Matricula matricula = new Matricula(alumno, materia);
    matriculas.add(matricula);

    System.out.println("Matrícula registrada correctamente.");
}

private static void mostrarAlumnos() {
    if (alumnos.isEmpty()) {
        System.out.println("No hay alumnos registrados.");
    } else {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println("Índice: " + i + " - Cédula: " + alumno.getCedula() + " - Nombre: " + alumno.getNombre());
        }
    }
          
}

private static void mostrarMaterias() {
    if (materias.isEmpty()) {
        System.out.println("No hay materias registradas.");
    } else {
        for (int i = 0; i < materias.size(); i++) {
            Materia materia = materias.get(i);
            System.out.println("Índice: " + i + " - Nombre: " + materia.getNombre());
        }
    }
}

    private static void totalMatriculados() {
        System.out.println("\nTotal Matriculados");

        if (materias.isEmpty() || matriculas.isEmpty()) {
            System.out.println("No hay materias o matrículas registradas.");
            return;
        }

        System.out.println("Matriculados por materia:");
        for (Materia materia : materias) {
            int totalMatriculados = contarMatriculados(materia);
            System.out.println("Materia: " + materia.getNombre() + " - Total matriculados: " + totalMatriculados);
        }

        System.out.println("Total de matriculados en la ESPE: " + matriculas.size());

        int totalHombres = contarGenero("Hombre");
        int totalMujeres = contarGenero("Mujer");
        System.out.println("Total de hombres matriculados: " + totalHombres);
        System.out.println("Total de mujeres matriculadas: " + totalMujeres);
    }

    private static int contarMatriculados(Materia materia) {
        int contador = 0;

        for (Matricula matricula : matriculas) {
            if (matricula.getMateria() == materia) {
                contador++;
            }
        }

        return contador;
    }

    private static int contarGenero(String genero) {
        int contador = 0;

        for (Alumno alumno : alumnos) {
            if (alumno.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }

        return contador;
    }

    private static void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (int i = 0; i < profesores.size(); i++) {
                Profesor profesor = profesores.get(i);
                System.out.println("Índice: " + i + " - Cédula: " + profesor.getCedula() + " - Nombre: " + profesor.getNombre());
            }
        }
    }




    public static void main(String[] args) {
        mostrarMenu();
    }
}
