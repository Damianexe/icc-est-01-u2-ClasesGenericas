public class App {
    public static void main(String[] args) 
    {
        // Caja que guarda un String
        Caja1<String> cajaDeTexto = new Caja1<>("Hola, Genéricos!");
        System.out.println(cajaDeTexto.getcontent());

        // Caja que guarda un Integer
        Caja1<Integer> cajaDeNumero = new Caja1<>(42);
        System.out.println(cajaDeNumero.getcontent());
    }
}
