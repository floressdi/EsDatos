public class Nodo {
    protected Object info;
    protected Nodo next;
    public Nodo(){
        next = null;
        info = null;
    }
    public Nodo(Object x, Nodo dir){
        this.info =x;
        this.next = dir;
    }
    public void setNext(Nodo dir){
        this.next = dir;
    }
    public void setInfo(Object x){
        this.info =x;
    }
    public Nodo getNext(){
        return next;
    }
    public Object getInfo(){
        return info;
    }
    @Override
    public String toString(){
        return ""+this.info;
    }
}
