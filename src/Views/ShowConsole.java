package Views;
import Models.Book;

public class ShowConsole {
    public void imprimirArreglo(Book[] libros){
        for(Book l : libros){
            System.out.println(l+ " || ");
        }
    }
    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
