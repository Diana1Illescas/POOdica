package horarios;

import java.util.List;
import java.util.Set;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private Set<String> equipos;

    public Laboratorio(String nombre, int capacidad, Set<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Set<String> getEquipos() {
        return equipos;
    }

    public boolean verificarDisponibilidad(String horario, List<Asignatura> asignaturas) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getHorario().equals(horario) && asignatura.getLaboratorio().equals(this)) {
                return false; // El laboratorio ya tiene asignada una asignatura en ese horario
            }
        }
        return true; // El laboratorio esta disponible en ese horario
    }

}

