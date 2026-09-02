public class Pelicula {

    String titulo;
    String director;
    int añoEstreno;
    String genero;
    int duracion;

    public Pelicula(String titulo,String director,int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno=añoEstreno;
        this.genero=genero;
        this.duracion=duracion;
    }

    public String getInformacion(){
        return "Titulo: "+titulo+
                "\nDirector: "+director+
                "\nAño de Estreno: "+añoEstreno+
                "\nGenero: "+genero+
                "\nDuracion: "+duracion;

    }

    public boolean esClasica(){
        int añoActual=2026;
        return (añoActual-añoEstreno)>25;
    }

    public String toString(){
        return getInformacion();
    }
}
