import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Catalogo miCatalogo = new Catalogo();

        Pelicula p1 = new Pelicula("", "Wachowski", 1999, "Acción", 136);
        Pelicula p2 = new Pelicula("Interstelar", "Nolan", 2014, "Sci-Fi", 169);
        Pelicula p3 = new Pelicula("Titanic", "Cameron", 1997, "Drama", 195);
        //Se agregaran las peloculas al ccatalogo
        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);
        // Mostrar todas las películas
        System.out.println("LISTA DE PELÍCULAS");
        System.out.println(miCatalogo.getPelicula());

        System.out.print("Escribe el título de la película que buscas: ");
        String peliculaABuscar = entrada.nextLine();

        miCatalogo.buscarPeliculaPorTitulo(peliculaABuscar);
    }
}
