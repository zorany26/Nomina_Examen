package org.example;
import org.example.MODELOS.Area;
import org.example.MODELOS.Beneficiario;
import org.example.MODELOS.Sucursal;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        Area areaVacia= new Area();
        Area areaLlena= new Area(1l,"Recursos humanos","Reclutamiento y selección",25,"Juana Francisca",35000000d,"Edificio principal, Piso 3, Oficina 302","3126425183","rrhh.@sura.co", LocalDate.of(2024,10,2));
        Beneficiario beneficiarioVacia=new Beneficiario();
        Beneficiario beneficiarioLleno=new Beneficiario(101l,"Carlos Andres Palacios","Hija",LocalDate.of(2010,5,12),"123456789","calle 45 #123,ciudad","555-1234","carlospalacios@example.com",50.0,202);
        Sucursal sucursalVacia =new Sucursal();
        Sucursal sucursalLleno=new Sucursal(301l,"Sucursal Centro","Av. Principal #456, Ciudad","555-7890","contacto@sucursalcentro.com","Carlos López",25,500000d,LocalDate.of(2018, 3, 15),"Ciudad Central");

        System.out.println("***************DATOS AREA*************");
        System.out.print("Ingrese nombre area: ");
        areaVacia.setNombreArea(lea.nextLine());

        System.out.print("Ingrese descripción: ");
        areaVacia.setDescripcion(lea.nextLine());

        System.out.print("Ingrese el responsable del area: ");
        areaVacia.setResponsableArea(lea.nextLine());

        System.out.print("Ingrese la ubicación: ");
        areaVacia.setUbicacion(lea.nextLine());

        System.out.print("Ingrese telefono: ");
        areaVacia.setTelefono(lea.nextLine());

        System.out.print("Ingrese correo:");
        areaVacia.setCorreo(lea.nextLine());

        System.out.print("Ingrese numero de empleados: ");
        areaVacia.setNumeroEmpleado(lea.nextInt());

        System.out.print("Ingrese el presupuesto del area: ");
        areaVacia.setPresupuestoArea(lea.nextDouble());

        System.out.print("Ingrese la fecha de creacion:");
        areaVacia.setFechaCreacion(LocalDate.now());

        System.out.print("Ingrese el id area: ");
        areaVacia.setIdArea(lea.nextLong());

        System.out.println(areaVacia);

    }

}