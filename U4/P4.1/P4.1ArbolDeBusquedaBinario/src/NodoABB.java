public class NodoABB{
    protected Object info;
    protected NodoABB left, right;
    public NodoABB(){
        info = null;
        left = right = null;
    }
    public NodoABB(Object x){
        info =x;
        left = right = null;
    }
    public void setLeft(NodoABB p){
        left =p;
    }
    public void setRight(NodoABB p){
        right=p;
    }
    public void setInfo(Object x){
        info =x;
    }
    public NodoABB getLeft(){
        return left;
    }
    public NodoABB getRight(){
        return right;
    }
    public Object getInfo(){
        return info;
    }
    public String toString(){
        return  " " + info;
    }
}

