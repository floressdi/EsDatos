public class Nodo {
    protected Object info;
    protected Nodo point, next;

    public Nodo(){
        info = null;
        point = next=null;
    }

    public Nodo(Object x){
        info =x;
        point =next =null;
    }

    public void setPoint(Nodo p){
        point =p;
    }

    public void setNext(Nodo p){
        next = p;
    }

    public void setInfo(Object x){
        info =x;
    }
    public Nodo getPoint(){
        return point;
    }

    public Nodo getNext(){
        return next;
    }

    public Object getInfo(){
        return info;
    }

    public String toString(){
        return ""+info;
    }
}
