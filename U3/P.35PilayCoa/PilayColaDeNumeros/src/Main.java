import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int cantidad;
        System.out.println("Ingrese cantidad de cifras a crear");
        cantidad = sca.nextInt();
        Cola c = new Cola(cantidad+1);
        Pilap3 p = new Pilap3(cantidad);
        int k;
        System.out.println("Datos almacenados en la cola:");
        for(int i =0; i<cantidad; i++){
            k =(int) (Math.random()*100);
            System.out.println(k + ", ");
            c.insert(k);
        }

        for (int i= 0; i<cantidad; i++){
            p.push(c.remove());
        }
        System.out.println("Orden inverso:");
        while (!p.isEmpty()){
            System.out.println(((Integer)p.pop())+",");
        }
    }
}