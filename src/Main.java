public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Fernando", "Rosales", 45, "10223344", "Matemática", 20);
        Profesor profesor2 = new Profesor("Walter", "Magallanes", 50, "11222333", "Programación", 25);

        Materia[] materias1 = {
            new Materia("Matemática I", 7.5, profesor1),
            new Materia("Programación", 9.0, profesor2)
        };
        Materia[] materias2 = {
            new Materia("Matemática II", 8.5, profesor1),
            new Materia("Programación Avanzada", 9.5, profesor2)
        };

        Estudiante estudiante1 = new Estudiante("Guillermina", "Hernandez", 20, "45111222", "Ingeniería", materias1);
        Estudiante estudiante2 = new Estudiante("Juan", "Garetto", 21, "44954668", "Sistemas", materias2);

        Personal personal1 = new Personal("Antonella", "Martínez", 38, "33111444", "Administración", "Secretaria", "2010-03-12");

        Universidad universidad = new Universidad();
        universidad.agregarMiembro(estudiante1);
        universidad.agregarMiembro(estudiante2);
        universidad.agregarMiembro(profesor1);
        universidad.agregarMiembro(profesor2);
        universidad.agregarMiembro(personal1);

        System.out.println("Listado de Miembros: ");
        universidad.listarMiembros();

        System.out.println("\nOrdenamiento por Apellido:");
        Estudiante[] lista = {estudiante1, estudiante2};
        Universidad.ordenarEstudiantesPorApellido(lista);
        for (Estudiante estudiante : lista) System.out.println(estudiante);

        System.out.println("\nBúsqueda Binaria (Apellido = 'Garetto') ");
        int pos = Universidad.busquedaBinariaEstudiantes(lista, "Garetto");
        System.out.println(pos >= 0 ? "Encontrado: " + lista[pos] : "No encontrado");
    }
}
