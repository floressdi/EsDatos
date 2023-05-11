import java.util.Scanner;
public class App {    
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);

        System.out.println("¿Cuantos valores desea agregar?");
        int vector[] = new int[t.nextInt()];

        System.out.println("Ingrese los valores");
        for (int i=0; i< vector.length; i++){
            vector[i] = t.nextInt();
        }
        
        System.out.println("El resultado de la suma Iterativa es = " + sumaIterativa(vector));
        System.out.println("El resultado de la Suma Recursiva es = " + sumaRecursiva(vector, vector.length - 1));  
    }

    public static int sumaIterativa(int vector[]){
        int resVectorIterativo = 0;        
        for (int i=0; i < vector.length; i++){ //O(n)
           resVectorIterativo += vector[i];
        }
        return resVectorIterativo;
    }

    public static int sumaRecursiva(int vector[], int posicionDelVector){
        int tam = posicionDelVector;
            int rta;
            if (tam == 0){
                return  vector[tam];
            }else{
                 rta = (vector[tam]) + sumaRecursiva(vector,tam-1); //0(n2)
            }
            return rta;
    }
}