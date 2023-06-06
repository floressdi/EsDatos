import com.sun.source.tree.NewArrayTree;
import javax.swing.*;
public class Lista_p3_2 {
        Nodo_p3_2 primerNodo;
        public Lista_p3_2(){
            primerNodo =null;
        }
        public void agregarNodo(int calificacion){// O(n)
            Nodo_p3_2 nuevoNodo = new Nodo_p3_2(calificacion);
            if (primerNodo == null){
                primerNodo = nuevoNodo;
            }else {
                Nodo_p3_2 actual = primerNodo;
                while (actual.siguiente !=  null){
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoNodo;
            }
        }
        public int sumarCalificaciones(){// O(n)
            return sumarCalificacionesRecursivo(primerNodo);
        }
        private int sumarCalificacionesRecursivo(Nodo_p3_2 nodo){
            if (nodo== null){
                return 0;
            }
            return nodo.calificacion + sumarCalificacionesRecursivo(nodo.siguiente);
        }
        public double obtenerPromedio(){
            int sum =  sumarCalificaciones();
            int count = contarAlumnos();
            return (double) sum/count;
        }
        public int contarAlumnosAprobados(){ //O(n)
            return contarAlumnosAprobadosRecursivo(primerNodo);
        }
        private int contarAlumnosAprobadosRecursivo(Nodo_p3_2 nodo){
            if(nodo == null){
                return 0;
            }
            if(nodo.calificacion >=60){
                return 1 + contarAlumnosAprobadosRecursivo(nodo.siguiente);
            }else {
                return contarAlumnosAprobadosRecursivo(nodo.siguiente);
            }
        }
        public int contarAlumnosEnRango(int rangoInicio, int rangoFin){
            return contarAlumnosEnRangoRecursivo(primerNodo, rangoInicio, rangoFin);
        }
        private int contarAlumnosEnRangoRecursivo(Nodo_p3_2 nodo, int rangoInicio, int rangoFin){
            if (nodo == null){
                return 0;
            }
            if (nodo.calificacion >= rangoInicio && nodo.calificacion <= rangoFin){
                return 1 + contarAlumnosEnRangoRecursivo(nodo.siguiente, rangoInicio, rangoFin);
            }else {
                return contarAlumnosEnRangoRecursivo(nodo.siguiente, rangoInicio, rangoFin);
            }
        }
        public int contarAlumnos(){
            return contarAlumnosRecursivo(primerNodo);
        }
        private int contarAlumnosRecursivo(Nodo_p3_2 nodo){
            if(nodo ==null){
                return 0;
            }
            return 1+ contarAlumnosRecursivo(nodo.siguiente);
        }
}
