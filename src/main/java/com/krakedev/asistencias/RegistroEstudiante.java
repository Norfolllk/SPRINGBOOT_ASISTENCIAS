package com.krakedev.asistencias;

public class RegistroEstudiante {
    private Estudiante estudiante;
    private Asistencia asistencia;

    public RegistroEstudiante() {
        super();
        this.estudiante = new Estudiante();
        this.asistencia = new Asistencia();
    }

    public RegistroEstudiante(Estudiante estudiante, Asistencia asistencia) {
        super();
        this.estudiante = estudiante;
        this.asistencia = asistencia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "RegistroEstudiante [estudiante=" + estudiante + ", asistencia=" + asistencia + "]";
    }
}
