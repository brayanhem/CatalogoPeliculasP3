import java.util.ArrayList;

public class Catalogo {
    ArrayList<Pelicula>peliculas;

    public Catalogo(ArrayList<Pelicula> peliculas) {
        peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public String getPelicula(){
        String resultado="";
        for(int i=0;i<peliculas.size();i++){
            Pelicula p=peliculas.get(i);
            resultado= resultado + p.getInformacion()+ "\n" ;
        }
        return resultado;
    }

    public void buscarPeliculaPorTitulo(String titulo){
        for(int i=0;i<peliculas.size();i++){
            Pelicula p=peliculas.get(i);
            if(p.titulo.equalsIgnoreCase(titulo)){
                System.out.println("Pelicula Encontrada: "+p.getInformacion());
            }
        }
        System.out.println("Pelicula no Encontrada");
    }

    public String toString(){
        return "Catalogo con "+peliculas.size()+" peliculas";
    }
}
