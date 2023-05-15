public class Main {
    public static void main(String[] args) {
        int j;
        int tam = 10;
        Pila s = new Pila(tam);
        System.out.println("Orden:");
       for ( int i = 0; i<tam; i++){
           j= (int)(Math.random()*100);
           s.push(j);
           System.out.println(j +",");
       }
        System.out.println("Orden inverso:");
       while (!s.isEmpty()){
           System.out.println(((Integer)s.pop())+ ", ");
       }
    }
}