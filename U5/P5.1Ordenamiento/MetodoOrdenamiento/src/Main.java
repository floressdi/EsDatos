public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i ;
        int [] arr = new int [10];
        System.out.println("Numeros generados");
        for (i =0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(" " + arr[i]);
        }
        bubbleSort(arr);
        qSort(arr, 0, arr.length-1);
        shellSort(arr, arr.length);
        radixSort(arr);
        System.out.println("Impresion ordenados: ");
        for (i = 0; i< arr.length; i++){
            System.out.println(" " + arr[i]);
        }
    }

    //====== burbuja
    public static void bubbleSort(int []a){
        long timeb= System.nanoTime();
        boolean intercambia = true;
        int aux;
        for(int i= 0; i<a.length -1 && intercambia; i++){
            intercambia = false;
            for (int j =0; j<a.length-i-1; j++)
                if (a[j] > a[j+1]){
                    intercambia= true;
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1]= aux;
                }
        }
        long timeb2 = System.nanoTime();
        long timefullb = timeb2 - timeb;
        System.out.println("Tiempo de burbuja: " + timefullb);
    }

    //===== quicksort
    public static void qSort(int[] a, int ini, int fin){
        long timesort = System.nanoTime();
        int izq = ini, der = fin, pivote =izq;
        int aux;
        boolean ban = true;
        while (ban){
            ban = false;
            while ((a[pivote] <= a[der]&& pivote !=der))
                --der;
            if(pivote != der){
                aux = a[pivote];
                a[pivote] = a[der];
                a[der] = aux;
                pivote = der;
            }
            while ((a[pivote] >=a[izq] && pivote!=izq))
                ++izq;
            if(pivote != izq){
                ban = true;
                aux= a[pivote];
                a[pivote] = a[izq];
                a[izq] = aux;
                pivote = izq;
            }
        }
        if(pivote -1 >ini){
            qSort(a, ini, pivote -1);
        }

        if (fin > pivote+1){
            qSort(a, pivote+1, fin);
        }

        long timesort2 = System.nanoTime();
        long timefullsort = timesort2 - timesort;
        System.out.println("Tiempo de quicksort: "+timefullsort);
    }
    //====== shellSort
    public static void shellSort ( int[] a, int n ){
        long times = System.nanoTime();
        int incr = n, i=0;
        int aux;
        boolean ban = true;
        while (incr > i) {
            incr = incr / 2;
            ban = true;
            while (ban) {
                ban = false;
                i = 0;
                while ((i + incr) < n) {
                    if (a[i] > a[i + incr]) {
                        aux = a[i];
                        a[i] = a[i + incr];
                        a[i + incr] = aux;
                        ban = true;
                    }
                    ++i;
                }
            }
        }
        long times2 = System.nanoTime();
        long timefulls= times2 - times;
        System.out.println("Tiempo de ShellSort: " + timefulls);
    }
    //==== RadixSort
    public static void radixSort(int[]arr){
        long timeradix = System.nanoTime();
            if (arr.length == 0)
                return;
            int[][] np = new int [arr.length][2];
            int[] q = new int [0x100];
            int i, j, k, l, f =0;
            for(k =0; k<4; k++){
                for (i=0; i<(np.length -1); i++)
                    np[i][1] =i+1;
                np[i][1] =-1;
                for (i=0; i<q.length; i++)
                    q[i] = -1;
                for(f = i =0; i< arr.length; i++){
                    j =((0xFF <<(k<<3))&arr[i])>>(k<<3);
                    if(q[j] == -1)
                        l = q[j]= f;
                    else {
                        l= q[j];
                        while (np[l][1] != -1)
                            l = np[l][1];
                        np[l][1] =f;
                        l = np[l][1];
                    }
                    f =np[f][1];
                    np[l][0] = arr[i];
                    np[l][1]=-1;
                }
                for(l = q[i=j=0]; i<0x100; i++)
                    for (l = q[i]; l !=-1; l=np[l][1])
                        arr[j++]=np[l][0];
            }
            long timeradix2 = System.nanoTime();
            long timefullradix = timeradix2 - timeradix;
            System.out.println("Tiempo de Radix: "+ timefullradix);
    }
}