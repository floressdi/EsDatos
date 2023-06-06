public class ListaNumeros_p3_2 {
    private Lista_p3_2 listaCalificaciones;
    public ListaNumeros_p3_2(){
        listaCalificaciones = new Lista_p3_2();
    }
    public void agregarCalif(int calificacion){
       listaCalificaciones.agregarNodo(calificacion);
    }
    public int obtenerAlumnosAprobados(){
        return listaCalificaciones.contarAlumnosAprobados();
    }
    public int obtenerAlumnosReprobados(){
        int totalAlumnos  = listaCalificaciones.contarAlumnos();
        int aprobados = listaCalificaciones.contarAlumnosAprobados();
        return  totalAlumnos - aprobados;
    }
    public int obtenerAlumnosEnRango(int rangoinicio, int rangoFin){
        return listaCalificaciones.contarAlumnosEnRango(rangoinicio, rangoFin);
    }
    public double obtenerPromedioGrupo(){
        return listaCalificaciones.obtenerPromedio();
    }
}
