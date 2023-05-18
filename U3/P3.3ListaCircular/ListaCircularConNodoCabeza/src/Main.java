

public class Main {
    public static void main(String[] args) {
        PilaLCCNC s = new PilaLCCNC(10);
        agregar(s);
        System.out.println("====================");
        mostrar(s);
    }

    static void agregar (PilaLCCNC s){ //O(n)
        for(int i = 0; i<10; i++){
            int j =(int)(Math.random() * 100);
            s.push(j);
            System.out.println("Insertar: " + j);
        }
    }

    static void mostrar(PilaLCCNC s){ //O(n)
        while (!s.isEmpty()){
            System.out.println(((Integer) s.pop()));
        }
    }
}