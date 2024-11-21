package org.example;

public class estudianteDeportista extends Estudiante{
    private String deporte;

    public estudianteDeportista(String cedula, String nombre, String fechaNacimiento,
                                String tipoSangre, String direccion, int codigo, String deporte) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion,codigo);
        this.deporte = cedula;
    }
    private String getDeporte() {
        return deporte;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println(getDeporte());
    }
}
