package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private Long idBeneficiario;
    private String nombreCompleto;
    private String relacionConEmpleado;
    private LocalDate fechaNacimiento;
    private String documentoIdentidad;
    private String direccion;
    private String telefono;
    private String correo;
    private Double porcentajeBeneficio;
    private Integer empleadoAsociado;

    public Beneficiario() {
    }

    public Beneficiario(Long idBeneficiario, String nombreCompleto, String relacionConEmpleado, LocalDate fechaNacimiento, String documentoIdentidad, String direccion, String telefono, String correo, Double porcentajeBeneficio, Integer empleadoAsociado) {
        this.idBeneficiario = idBeneficiario;
        this.nombreCompleto = nombreCompleto;
        this.relacionConEmpleado = relacionConEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.documentoIdentidad = documentoIdentidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.empleadoAsociado = empleadoAsociado;
    }

    public Long getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(Long idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRelacionConEmpleado() {
        return relacionConEmpleado;
    }

    public void setRelacionConEmpleado(String relacionConEmpleado) {
        this.relacionConEmpleado = relacionConEmpleado;
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

    public Double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(Double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public Integer getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Integer empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "idBeneficiario=" + idBeneficiario +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", relacionConEmpleado='" + relacionConEmpleado + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", empleadoAsociado=" + empleadoAsociado +
                '}';
    }
}
