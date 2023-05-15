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

    }
}