public class Estudiante extends Persona implements MiembroUniversidad {
    private String carrera;
    private double promedio;
    private ListaEnlazada<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, Materia[] materiasArr) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;

        materias = new ListaEnlazada<>();
        for (Materia m : materiasArr) materias.agregar(m);

        this.promedio = calcularPromedioIterativo();
    }

    public double calcularPromedioIterativo() {
        if (materias.getTamanio() == 0) return 0;
        double suma = 0;
        for (int i = 0; i < materias.getTamanio(); i++)
            suma += materias.obtener(i).getNota();
        return suma / materias.getTamanio();
    }

    @Override
    public String obtenerRol() { return "Estudiante"; }

    @Override
    public String obtenerInformacionCompleta() { return toString(); }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() +
               ", Carrera: " + carrera +
               ", Promedio: " + promedio;
    }
}
