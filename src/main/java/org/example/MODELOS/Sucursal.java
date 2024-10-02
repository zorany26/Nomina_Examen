package org.example.MODELOS;

import java.time.LocalDate;

public class Sucursal {
    private Long idSucursal;
    private String nombreSucursal;
    private String direccion;
    private String telefono;
    private String email;
    private String gerenteSucursal;
    private Integer numeroEmpleados;
    private Double presupuestoSucursal;
    private LocalDate fechaApertura;
    private String ubicacionGeografica;

    public Sucursal() {
    }

    public Sucursal(Long idSucursal, String nombreSucursal, String direccion, String telefono, String email, String gerenteSucursal, Integer numeroEmpleados, Double presupuestoSucursal, LocalDate fechaApertura, String ubicacionGeografica) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.gerenteSucursal = gerenteSucursal;
        this.numeroEmpleados = numeroEmpleados;
        this.presupuestoSucursal = presupuestoSucursal;
        this.fechaApertura = fechaApertura;
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGerenteSucursal() {
        return gerenteSucursal;
    }

    public void setGerenteSucursal(String gerenteSucursal) {
        this.gerenteSucursal = gerenteSucursal;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Double getPresupuestoSucursal() {
        return presupuestoSucursal;
    }

    public void setPresupuestoSucursal(Double presupuestoSucursal) {
        this.presupuestoSucursal = presupuestoSucursal;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "idSucursal=" + idSucursal +
                ", nombreSucursal='" + nombreSucursal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", gerenteSucursal='" + gerenteSucursal + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", presupuestoSucursal=" + presupuestoSucursal +
                ", fechaApertura=" + fechaApertura +
                ", ubicacionGeografica='" + ubicacionGeografica + '\'' +
                '}';
    }
}
