import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ListaNumeros_p3_2 li = new ListaNumeros_p3_2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese calificaciones de los estudiantes");
        for (int i = 0; i<=20; i++){
            System.out.println("Calificacion del estudiante " + i +": ");
            int calificacion = scanner.nextInt();
            li.agregarCalif(calificacion);
        }
        System.out.println("Estudiantes Aprobados: " + li.obtenerAlumnosAprobados());
        System.out.println("Estudiantes Reprobados: " + li.obtenerAlumnosReprobados());
        System.out.println("Estudiantes con calificacion de 90 - 100: " + li.obtenerAlumnosEnRango(90, 100));
        System.out.println("Estudiantes con calificacion de 80 - 89: " +li.obtenerAlumnosEnRango(80, 89));
        System.out.println("Estudiantes con calificacion de 70 - 79: " +li.obtenerAlumnosEnRango(70, 79));
        System.out.println("Estudiantes con calificacion de 60 - 69: " +li.obtenerAlumnosEnRango(60, 69));
        System.out.println("Estudiantes con calificacion de 0 - 59: " +li.obtenerAlumnosEnRango(0, 59));
        double promedioGrupo = li.obtenerPromedioGrupo();
        System.out.println("Promedio del grupo es de: " + promedioGrupo);
    }
}