package org.example.MODELOS;

import java.time.LocalDate;

public class Area {
    private Long idArea;
    private String nombreArea;
    private String descripcion;
    private Integer numeroEmpleado;
    private String responsableArea;
    private Double presupuestoArea;
    private String ubicacion;
    private String telefono;
    private String correo;
    private LocalDate fechaCreacion;

    public Area() {
    }

    public Area(Long idArea, String nombreArea, String descripcion, Integer numeroEmpleado, String responsableArea, Double presupuestoArea, String ubicacion, String telefono, String correo, LocalDate fechaCreacion) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.descripcion = descripcion;
        this.numeroEmpleado = numeroEmpleado;
        this.responsableArea = responsableArea;
        this.presupuestoArea = presupuestoArea;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getResponsableArea() {
        return responsableArea;
    }

    public void setResponsableArea(String responsableArea) {
        this.responsableArea = responsableArea;
    }

    public Double getPresupuestoArea() {
        return presupuestoArea;
    }

    public void setPresupuestoArea(Double presupuestoArea) {
        this.presupuestoArea = presupuestoArea;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Area{" +
                "idArea=" + idArea +
                ", nombreArea='" + nombreArea + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroEmpleado=" + numeroEmpleado +
                ", responsableArea='" + responsableArea + '\'' +
                ", presupuestoArea=" + presupuestoArea +
                ", ubicacion='" + ubicacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
