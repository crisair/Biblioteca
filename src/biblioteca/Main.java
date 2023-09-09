
package biblioteca;


public class Main {

    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("El alcoiris","Antoine ", "el camino",001,10);
        Libro libro2 = new Libro("El tiempo oscuros", "camila guerrero", "el pez ",002,15);
        Libro libro3 = new Libro("El cadaver", "Antoni Saint", "el marino",003,20);
        Libro libro4 = new Libro ("Tu mejor amigo","bruce cameron","el monte",004,30);

        biblioteca.ingresarLibro((libro1));
        biblioteca.ingresarLibro((libro2));
        biblioteca.ingresarLibro((libro3));
        biblioteca.eliminarLibro(libro1);
        biblioteca.ingresarLibro(libro2);
         
        biblioteca.mostrarInventario();
        biblioteca.buscarLibro("El cadaver");
        
       
        libro3.imprimirInformacion();
        libro3.prestarLibro(3);
        libro3.devolverrLibro(2);
        
        libro4.imprimirInformacion();
        
       
        
    }
    
}
