package org.example;

import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String tipoSangre;
    private String direccion;


    public Persona(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
    }

    private String getCedula() {
        return cedula;
    }

    private String getNombre() {
        return nombre;
    }

    private String getFechaNacimiento() {
        return fechaNacimiento;
    }

    private String getTipoSangre() {
        return tipoSangre;
    }

    private String getDireccion() {
        return direccion;

    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("Los datos de la persona son:");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("FechaNacimiento: " + fechaNacimiento);
        System.out.println("Tipo de Sangre: " + tipoSangre);
        System.out.println("Direccion: " + direccion);
    }

    public void cambiardatos(String cedula,String nombre,String fechaNacimiento,String tipoSangre,String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
    }

    public void cambiardatos2(String cedula,String nombre,String fechaNacimiento,String tipoSangre,String direccion) {
      setCedula(cedula);
      setNombre(nombre);
      setFechaNacimiento(fechaNacimiento);
      setTipoSangre(tipoSangre);
      setDireccion(direccion);
    }

public void cambiardatos3(){

    Scanner sc = new Scanner(System.in);
    String cedula=sc.nextLine();
    String  nombre=sc.nextLine();
    String  fechaNacimiento=sc.nextLine();
    String tipoSangre=sc.nextLine();
    String direccion=sc.nextLine();
    setCedula(cedula);
    setNombre(nombre);
    setFechaNacimiento(fechaNacimiento);
    setTipoSangre(tipoSangre);
    setDireccion(direccion);
}
    public void cambiardatos4(){

        Scanner sc = new Scanner(System.in);
        this.cedula=sc.nextLine();
        this.nombre=sc.nextLine();
        this.fechaNacimiento=sc.nextLine();
        this.tipoSangre=sc.nextLine();
        this.direccion=sc.nextLine();

    }
}
