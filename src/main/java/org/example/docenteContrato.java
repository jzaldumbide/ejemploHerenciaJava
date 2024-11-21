package org.example;

public class docenteContrato extends Docente{
    String tipoContrato;

    public docenteContrato(String cedula, String nombre, String fechaNacimiento, String tipoSangre,String direccion, String tipoContrato) {
        super(cedula, nombre, fechaNacimiento, direccion, tipoSangre);
        this.tipoContrato = tipoContrato;
    }
    public String getTipoContrato() {
        return tipoContrato;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de contrato: " + getTipoContrato());
    }
}
