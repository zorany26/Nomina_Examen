package org.example.MODELOS;

import java.time.LocalDate;

public class Nomina {
    private Integer idNomina;
    private Integer empleadoAsociado;
    private Double salarioBase;
    private Double deducciones;
    private Double bonificaciones;
    private Double netoAPagar;
    private LocalDate fechaPago;
    private String periodoPago;
    private String tipoPago;
    private Double estadoPago;

    public Nomina() {
    }

    public Nomina(Integer idNomina, Integer empleadoAsociado, Double salarioBase, Double deducciones, Double bonificaciones, Double netoAPagar, LocalDate fechaPago, String periodoPago, String tipoPago, Double estadoPago) {
        this.idNomina = idNomina;
        this.empleadoAsociado = empleadoAsociado;
        this.salarioBase = salarioBase;
        this.deducciones = deducciones;
        this.bonificaciones = bonificaciones;
        this.netoAPagar = netoAPagar;
        this.fechaPago = fechaPago;
        this.periodoPago = periodoPago;
        this.tipoPago = tipoPago;
        this.estadoPago = estadoPago;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Integer empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public Double getNetoAPagar() {
        return netoAPagar;
    }

    public void setNetoAPagar(Double netoAPagar) {
        this.netoAPagar = netoAPagar;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(String periodoPago) {
        this.periodoPago = periodoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Double getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Double estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "idNomina=" + idNomina +
                ", empleadoAsociado=" + empleadoAsociado +
                ", salarioBase=" + salarioBase +
                ", deducciones=" + deducciones +
                ", bonificaciones=" + bonificaciones +
                ", netoAPagar=" + netoAPagar +
                ", fechaPago=" + fechaPago +
                ", periodoPago='" + periodoPago + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                ", estadoPago=" + estadoPago +
                '}';
    }
}
