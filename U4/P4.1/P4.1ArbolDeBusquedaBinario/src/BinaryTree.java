public abstract class  BinaryTree {
    private NodoABB r;

    protected NodoABB getRaiz(){
        return r;
    }

    protected void setRaiz(NodoABB raiz){
        r = raiz;
    }
    public BinaryTree ( ) {
        setRaiz ( null );
    }
    public BinaryTree ( Object x ) {
        setRaiz ( new NodoABB (x) );
    }

    public boolean isEmpty ( ) {
        return getRaiz ( ) == null;
    }
    public Object getInfo ( ) {
        if ( !isEmpty ( ) )
            return getRaiz ( ).getInfo ( );
        return null;
    }
    public NodoABB getLeft ( ) {
        if ( !isEmpty ( ) )
            return getRaiz ( ).getLeft ( );
        return null;
    }
    public NodoABB getRight ( ) {
        if ( !isEmpty ( ) )
            return getRaiz ( ).getRight ( );
        return null;
    }
    public void setInfo ( Object x ) {
        if ( !isEmpty ( ) )
            getRaiz ( ).setInfo ( x );
    }
    public void insLeft ( NodoABB p, Object x ) {
        if ( ( p != null ) && ( p.getLeft ( ) == null ) )
            p.setLeft ( new NodoABB (x) );
    }
    public void insRight ( NodoABB p, Object x ) {
        if ( ( p != null )&& ( p.getRight ( ) == null ) )
            p.setRight ( new NodoABB (x) );
    }
    public void print ( int modo ) {
        if ( modo == 1 )
            preOrden( );
        else if ( modo == 2 )
            inOrden ( );
        else if ( modo == 3 )
            postOrden ( );
    }

    public void preOrden ( ) {
        preOrden ( getRaiz ( ) );
    }
    protected void preOrden ( NodoABB p ) {
        if ( p == null )
            return;
        System.out.print ( p.getInfo ( ) + " " );
        preOrden ( p.getLeft ( ) );
        preOrden ( p.getRight ( ) );
    }
    public void inOrden ( ) {
        inOrden ( getRaiz ( ) );
    }

    protected void inOrden ( NodoABB p ) {
        if ( p == null )
            return;inOrden ( p.getLeft ( ) );
            System.out.print ( p.getInfo ( ) + " " );
            inOrden ( p.getRight ( ) );
    }
    public void postOrden ( ) {
        postOrden ( getRaiz ( ) );
    }

    protected void postOrden ( NodoABB p ) {
        if ( p == null )
            return;postOrden ( p.getLeft ( ) );
            postOrden ( p.getRight ( ) );
            System.out.print ( p.getInfo ( ) + " " );
    }
}
