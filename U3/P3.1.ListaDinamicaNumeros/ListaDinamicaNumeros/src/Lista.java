import com.sun.source.tree.NewArrayTree;
import javax.swing.*;
public class Lista extends Nodo{
    public Lista(){
        L = null;
    }
    public void insInicio(Object x ){
        L = new Nodo(x, L);
    }
    public void insAfter(Nodo p, Object x){
        if (p == null){
            System.out.println("No existe el nodo");
        }else {
            Nodo dir = new Nodo(x, p.getNext());
            p.setNext(dir);
        }
    }
    public boolean isEmpty(){
        return L == null;
    }
    public void insFinal(Object x){
        if(isEmpty())
            insInicio(x);
        else {
            Nodo q = L;
            while (q.getNext()!=null)
                q = q.getNext();
            Nodo dir  = new Nodo(x, null);
            q.setNext(dir);
        }
    }
    public Object delAfter(Nodo p){
        if (p!= null && p.getNext()!=null){
            Object x = p.getNext().getInfo();
            p.setNext(p.getNext().getNext());
            return x;
        }
        return null;
    }
    public Object delInicio(){
        if(isEmpty())
            return null;
        Nodo dir = L;
        L = dir.getNext();
        return dir.getInfo();
    }
    public Object delFinal(){
        if(isEmpty())
            return null;
        if(L.getNext()==null)
            return delInicio();
        Nodo q =L;
        While(q.getNext().getNext()!=null){
            q = q.getNext();
        }
        Object x = q.getNext().getInfo();
        q.setNext(null);
        return x;
    }
}