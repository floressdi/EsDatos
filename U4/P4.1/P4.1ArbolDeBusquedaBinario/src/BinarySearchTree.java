public class BinarySearchTree extends  BinaryTree {
    public BinarySearchTree ( ) {
        super ( );
    }
    public BinarySearchTree ( Object o ) {
        super ( o );
    }
    public void print ( ) {
        print (2);
    }

    public void crearArbol ( Object o ) {
        NodoABB p, q;
        for ( p = null, q = getRaiz ( );
              q != null && ((Integer)o).intValue() != ((Integer)q.getInfo( ) ).intValue();
              p = q, q = ((Integer)o).intValue() < ((Integer)q.getInfo( ) ).intValue()
                      ? q.getLeft ( ) : q.getRight ( ) );
        if ( q != null )
            return;
        else
            if ( p == null )setRaiz ( new NodoABB (o) );
            else
                if ( ((Integer)o).intValue() < ((Integer)p.getInfo( ) ).intValue() )
                    insLeft ( p, o );
                else
                    insRight ( p, o );
    }
}
