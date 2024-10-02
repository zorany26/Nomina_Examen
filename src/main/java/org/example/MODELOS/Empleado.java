package org.example.MODELOS;

import java.time.LocalDate;

public class Empleado {
    private Long idEmpleado;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String documentoIdentidad;
    private String direccion;
    private String telefono;
    private String correo;
    private LocalDate fechaIngreso;
    private String cargo;
    private Double salarioBase;
    private String tipoContrario;
    private String estadoCivil;
    private String genero;
    private String numeroCuenta;
    private Boolean estadoEmpleado;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String nombreCompleto, LocalDate fechaNacimiento, String documentoIdentidad, String direccion, String telefono, String correo, LocalDate fechaIngreso, String cargo, Double salarioBase, String tipoContrario, String estadoCivil, String genero, String numeroCuenta, Boolean estadoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.documentoIdentidad = documentoIdentidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.tipoContrario = tipoContrario;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.numeroCuenta = numeroCuenta;
        this.estadoEmpleado = estadoEmpleado;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTipoContrario() {
        return tipoContrario;
    }

    public void setTipoContrario(String tipoContrario) {
        this.tipoContrario = tipoContrario;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Boolean getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(Boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", cargo='" + cargo + '\'' +
                ", salarioBase=" + salarioBase +
                ", tipoContrario='" + tipoContrario + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", estadoEmpleado='" + estadoEmpleado + '\'' +
                '}';
    }
}
