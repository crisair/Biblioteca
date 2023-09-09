
package biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca  {
    
    private final List<Libro> inventario;

    public Biblioteca() {
        inventario = new ArrayList<>();
    }

    public List<Libro> getInventario() {
        return inventario;
    }
    
    
    
public void ingresarLibro(Libro libro) {
    
        inventario.add(libro);
        System.out.println("fue ingresado correctamente : " + libro.getNombre());
    }

public void eliminarLibro(Libro libro) {
        inventario.remove(libro);
        System.out.println("fue elimidado correctamente : " +  libro.getNombre());
        
    }

public void mostrarInventario(){
    System.out.println("EL inventario de los libros es:");
    for (Libro libro: inventario){
     System.out.println("************************** " );
      libro.imprimirInformacion();
     System.out.println("************************** " );
}            
    
}

public void buscarLibro(String NombreLibro) {
    
        for (Libro libro : inventario) {
            if (libro.getNombre() == NombreLibro) {
                
             libro.imprimirInformacion();
             break;
            }
            
       System.out.println("+++++++++++++++++++++++++" ); 
       System.out.println("No se ha encontrado el libro" );
       System.out.println("+++++++++++++++++++++++++" );
        }
}

}