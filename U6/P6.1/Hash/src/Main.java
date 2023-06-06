public class Main {
    public static void main(String[] args) {

        int[] arreglo = {77, 81, 23, 12, 15, 44, 103, 88};


        int mod = 10;

        for(int i=0;  i<arreglo.length;  i++){
            float hash = (arreglo[i] % mod +1);
            System.out.println("resultado de  "+i +": " + hash);
        }
    }
}