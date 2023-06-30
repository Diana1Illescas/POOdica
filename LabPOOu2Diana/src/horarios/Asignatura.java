package horarios;

public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio laboratorio;

    public Asignatura(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void asignarLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}

