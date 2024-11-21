package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String cedula;
    String nombre;
    String fechaNacimiento;
    String tipoSangre;
    String direccion;


    Scanner sc = new Scanner(System.in);
    cedula=sc.nextLine();
    nombre=sc.nextLine();
    fechaNacimiento=sc.nextLine();
    tipoSangre=sc.nextLine();
    direccion=sc.nextLine();

    Persona persona1=new Persona(cedula,nombre,fechaNacimiento,tipoSangre,direccion);
    persona1.imprimir();
    persona1.cambiardatos("456789","Pablo","09/09/2000","o","La Luz");
    System.out.println("nuevos datos");
    persona1.imprimir();
    persona1.cambiardatos2("456789","Pedro","09/09/2000","o","La Luz");
    persona1.imprimir();
    persona1.cambiardatos3();
    persona1.imprimir();
        persona1.cambiardatos4();
        persona1.imprimir();

/*
    Estudiante estudiante1=new Estudiante("1234567890","Ana Vasquez"
    ,"10/10/1991","0+",123456);
    //estudiante1.imprimir();

    estudianteBecado estudianteBecado1=new estudianteBecado("09876543321",
            "Veronica Arias","11/11/1995","O+",
            23456,"media beca");
    estudianteBecado1.imprimir();*/



    }

}