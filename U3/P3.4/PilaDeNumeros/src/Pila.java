public class Pila {
    protected  Object [] info;
    protected  int top;

    public Pila (int tam){
        info = new Object[tam];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void  push( Object x){
        if  ( top +1 < info.length)
            info[++top] = x;
    }

    public Object pop(){
        if( isEmpty())
            return null;
            return  info[top--];
    }
    public Object peek (){
        if (isEmpty())
            return null;
            return info[top];
    }

}
