public class Main {
    public static void main(String[] args) {

        Pila s = new Pila(10);// Tamaño

        int j;
        System.out.println("Orden: ");
        for (int i = 0; i<10; i++){
            j= (int)(Math.random()*100);
            s.push(j);
            System.out.println(j + ", ");
        }
        System.out.println( " Orden inverso: ");
        while (!s.isEmpty()){
            System.out.println(((Integer)s.pop())+", ");
        }
    }
}