package org.example;

public class estudianteBecado extends Estudiante{
    private String tiboBeca;

    public estudianteBecado(String cedula, String nombre, String fechaNacimiento,
                            String tipoSangre, String direccion, int codigo, String tiboBeca) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.tiboBeca = tiboBeca;
    }

    private String getTiboBeca() {
        return tiboBeca;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estudiante becado:");
        System.out.println("tiboBeca: " + tiboBeca);
    }
}
