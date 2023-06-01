public class Main {
    public static void main(String[] args) {
        BinarySearchTree  tree = new BinarySearchTree();
        int n;
        System.out.println("Numeros insertados");
        for(int i = 0; i<15; i++){
            tree.crearArbol(n = (int) (Math.random() *1000));
            System.out.println(n+"");
        }

        System.out.println("In-orden");
        tree.print();

    }
}