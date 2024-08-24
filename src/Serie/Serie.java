import java.util.ArrayList;

public class Serie {
    private String nombre;
    private String autor;
    private ArrayList<Temporada> temporadas;
    private String genero;


    public Serie(String nombre, String autor, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
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

    public void addTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int cantVistos() {
        int total = 0;
        for (Temporada temporada : temporadas) {
            total += temporada.cantVistos();
        }
        return total;
    }

    public double obtPromedio() {
        double promedio = 0;

        for (Temporada temporada : temporadas) {
            promedio += temporada.obtPromedio();
        }
        return promedio;
    }
    public boolean seVieronTodos(){
        boolean seVieron = false;
        for (Temporada temporada : temporadas) {
            if (temporada.cantVistos() == temporada.getCantidadEpisodios()){
                seVieron = true;
            }else {
                seVieron = false;
            }

        }
        return seVieron;
    }

}

