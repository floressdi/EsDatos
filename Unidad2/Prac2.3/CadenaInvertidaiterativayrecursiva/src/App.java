import java.io.StringReader;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CADENAS");   
        String cadena = "AnitaLavaLaTina";
        System.out.println("Cadena original "+ cadena);
        System.out.println("Cadena invertida de forma iterativa "+ iterativaInvertida(cadena));
        System.out.println("Cadena invertida de forma recursiva "+ recursivaInvertida(cadena));
    }

    //FORMA ITERATIVA
    public static String iterativaInvertida(String cadena){ 
        String cinvertida ="";
        for(int indice = cadena.length() - 1; indice >=0; indice--){ //O(n)
          cinvertida = cinvertida + cadena.charAt(indice); //concatenamos cada carácter 
        }
        return cinvertida;
    }

    //FORMA RECURSIVA
    public static String recursivaInvertida(String cadena){ 
        if ((cadena == null)||(cadena.length() <=1)){
            return cadena;
        }else{
            return recursivaInvertida(cadena.substring(1))+ cadena.charAt(0); //O(n2)
        }
    }
}