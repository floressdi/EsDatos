public class Cola {
    protected Object[] info;
    protected int frente, fin;

    public Cola (int tam){
        info = new Object[tam];
        frente = fin = tam-1;
    }

    public boolean isEmpty(){
        return (frente == fin);
    }

    public void insert(Object x){
        if ( fin == (frente -1 + info.length)% info.length){
            System.out.println("Error de overflow");
        }else {
            fin = (fin +1)% info.length;
            info [fin] = x;
        }
    }

    public Object remove (){
        if (isEmpty()){
            return  null;
        }
        frente = (frente+1)% info.length;
        return info[frente];
    }
}
