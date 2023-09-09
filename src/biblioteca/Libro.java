
package biblioteca;


public class Libro {
    
    public  String nombre ;
    public  String autor;
    public  String editoria;
    protected  int codigo ;
    protected  int cantidad ;

    public Libro(String nombre, String autor, String editoria, int codigo, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.editoria = editoria;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

public void prestarLibro (int numero ){
    
    if (numero > 0 ){
        
        cantidad = cantidad - numero;
         
         System.out.println("se han prestado: " + numero + " de " + nombre );   
        
    }else{
        
       System.out.println("No hay ejemplares disponibles de " + nombre + " para prestar.");   
    }   
   
}


public void devolverrLibro (int numero){
    
    numero  = cantidad + numero;
    System.out.println("se han devuelto: " + numero + " de " + nombre);
    
}


public void imprimirInformacion (){
    
     System.out.println("el nombre del libro es: " + nombre);
     System.out.println("el autor es : " + autor);
     System.out.println("la editorial es: " + editoria);
     System.out.println("el codigo es : " + codigo);
     System.out.println(" la cantidad es : " + cantidad);
        
}
    
    
    
            
    
      
    
}
