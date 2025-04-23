package Controllers;

import Models.Book;

public class MetodosControles {
    public void sortByName(Book[] libros) {
        for(int i = 0; i < libros.length - 1; i++){
            for(int j = 0; j < libros.length - i - 1; j++){
                if(libros[j].getNombre().compareToIgnoreCase(libros[j+1].getNombre())<0){
                    Book temp = libros[j];
                    libros[j] = libros[j+1];
                    libros[j+1] = temp;
                }
            }
        }
    }
    public Book searchByName(Book[] libros, String nombre) {
        int bajo = 0;
        int alto = libros.length - 1;
        while(bajo <= alto){
            int centro = bajo + (alto - bajo) / 2;
            String valorCentro = libros[centro].getNombre();
            int comparacion = valorCentro.compareToIgnoreCase(nombre);
            if(comparacion == 0){
                return libros[centro];
            }
            if(comparacion > 0){
                bajo = centro + 1;
            }else{
                alto = centro - 1;
            }
        }
        return null;
    }
}
