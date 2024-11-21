package org.example;


public class docenteNombramiento extends Docente{

    String tipoNombramiento;

    public docenteNombramiento(String cedula, String nombre, String fechaNacimiento, String tipoSangre,String direccion, String tipoNombramiento) {
        super(cedula, nombre, fechaNacimiento, direccion,tipoSangre);
        this.tipoNombramiento = tipoNombramiento;
    }
    private String getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(getTipoNombramiento());
    }

}
