package Actividad5;

import java.time.LocalTime;

public class Shift implements ShiftInterface {
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String descripcion;

    public Shift(LocalTime horaInicio, LocalTime horaFin, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}