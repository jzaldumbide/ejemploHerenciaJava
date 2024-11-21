package org.example;

public class Docente extends Persona {
    private int codigo;

    public Docente(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
    }
    private int getCodigo() {
        return codigo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Codigo: " + codigo);
    }
}
