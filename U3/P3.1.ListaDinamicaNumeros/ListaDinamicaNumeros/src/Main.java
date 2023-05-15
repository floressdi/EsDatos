public class Main {
    public static void main(String[] args) {
        ListaNumeros li= new ListaNumeros();
        for(int i=1; i<=50; i++){
            li.insFinal(i);
        }
        Nodo q = li.L;
        System.out.println("Numeros");
        li.muestra(q);
        int suma = li.sumar(q);
        System.out.println("La suma de los numeros es: "+suma);
    }
}