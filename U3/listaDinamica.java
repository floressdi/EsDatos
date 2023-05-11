import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class listaDinamica {
    List<Integer> listanumeros = new ArrayList();
    public void añadir(int score) {
        listanumeros.add(score);
    }

    public static int sumaRecursiva(int numero){
      int suma;
      if(numero>0){
          suma = numero + sumaRecursiva(numero -1);
      }else {
          return 0;
      }
      return suma;
    }

    public static int invertirRecursiva(int  listad, int posicion){
       if(listad<10){
           return listad;
       }else {
           return listad%10 * (int)Math.pow(10, posicion) + invertirRecursiva(listad/10, posicion-1);
       }
    }
    public static void main(String[] args){
        listaDinamica listad = new listaDinamica();
        System.out.println("Numeros: ");
        int numero = 0;
        for (int i=1; i <= 50; i++){
            listad.añadir(i);
            numero = i;
        }
        System.out.println(listad.listanumeros);
        System.out.println("Suma recursiva: "+ sumaRecursiva(numero));
        System.out.println("Invertida: "+ invertirRecursiva(listad, numero));
    }
}