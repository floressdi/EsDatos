public class ListaNumeros extends Lista {
    public void muestra(Nodo q){//O(n)
        if (q.getNext()!=null){
            muestra(q.getNext());
        }
        System.out.println(q.getInfo());
    }

    public int sumar(Nodo q){ //O(n)
        if(q.getNext()!=null){
            return (Integer)q.getInfo()+sumar(q.getNext());
        }
        return (Integer)q.getInfo();
    }
}