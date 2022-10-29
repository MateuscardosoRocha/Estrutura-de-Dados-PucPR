public class Main {

    public static void main (String args[]) {
        Lista l = new Lista();
        No n = new No();
        l.inserePrimeiro(20);
        l.inserePrimeiro(40);
        l.inserePrimeiro(60);
        
        l.mostrar();
        System.out.println("\n");
        n = l.procurar(40);
        l.remove(n);
        l.mostrar();
    }
}