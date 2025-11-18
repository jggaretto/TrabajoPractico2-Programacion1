public class Universidad {
    private ListaEnlazada<MiembroUniversidad> miembros;

    public Universidad() { miembros = new ListaEnlazada<>(); }

    public void agregarMiembro(MiembroUniversidad miembro) {
        miembros.agregar(miembro);
    }

    public void listarMiembros() {
        for (int i = 0; i < miembros.getTamanio(); i++)
            System.out.println(miembros.obtener(i).obtenerInformacionCompleta());
    }

    public static void ordenarEstudiantesPorApellido(Estudiante[] estudiantes) {
        int n = estudiantes.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (estudiantes[j].getApellido().compareTo(estudiantes[indiceMin].getApellido()) < 0)
                    indiceMin = j;
            }
            Estudiante temp = estudiantes[i];
            estudiantes[i] = estudiantes[indiceMin];
            estudiantes[indiceMin] = temp;
        }
    }

    public static int busquedaBinariaEstudiantes(Estudiante[] estudiantes, String apellido) {
        int left = 0, right = estudiantes.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = estudiantes[mid].getApellido().compareToIgnoreCase(apellido);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
