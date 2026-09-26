package com.krakedev.asistencias;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asistencia {
    private LocalDate fechaClase; // 2026-09-23
    private LocalDateTime fechaHoraRegistro; // 2026-09-23T20:00
    private String estado; // P-Presente A-Ausente

    public Asistencia() {
        super();
    }

    public Asistencia(LocalDate fechaClase, LocalDateTime fechaHoraRegistro, String estado) {
        super();
        this.fechaClase = fechaClase;
        this.fechaHoraRegistro = fechaHoraRegistro;
        this.estado = estado;
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public void setFechaClase(LocalDate fechaClase) {
        this.fechaClase = fechaClase;
    }

    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asistencia [fechaClase=" + fechaClase + ", fechaHoraRegistro=" + fechaHoraRegistro + ", estado=" + estado + "]";
    }
}

