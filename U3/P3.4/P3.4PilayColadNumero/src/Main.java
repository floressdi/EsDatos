import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int can;
        System.out.println("Ingrese la cantidad de cifras a crear");
        can = s.nextInt();
        cola c = new cola(can+1);
        Pila p = new Pila(can);
        int k;
        System.out.println("Datos almacenados en la cola: ");
        for(int i = 0; i<can; i++){
            k = (int) (Math.random()*100);
            System.out.println(k + ", ");
            c.insert(k);
        }
        for (int i = 0; i< can; i++){
            p.push(c.remove());
        }
        System.out.println("Orden inverso");
        while(!p.isEmpty()){
            System.out.println(((Integer)p.pop())+", ");
        }
    }
}