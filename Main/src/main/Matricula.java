package main;

public class Matricula {
    private Profesor profesor;
    private Alumno alumno;
    private Materia materia;

    public Matricula(Alumno alumno, Materia materia) {
        this.profesor = profesor;
        this.alumno = alumno;
        this.materia = materia;
    }

    // Getters y setters

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
