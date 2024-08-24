import java.util.ArrayList;


public class Temporada {
    private ArrayList<Episodio> episodios;
    private int numeroTemporada;


    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = new ArrayList<>();
    }

    public void addEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }
    public int getCantidadEpisodios() {
        return this.episodios.size();
    }
    public int cantVistos() {
        int cant = 0;
        for (Episodio episodio : episodios) {
            if (episodio.isFlag()) {
                cant++;
            }
        }
        return cant;
    }
    public double obtPromedio() {
        double promedio = 0;
        int total_cali = 0;
        int total_epi = cantVistos();
        for (Episodio episodio : episodios) {
            if (episodio.isFlag()) {
                total_cali += episodio.getCalificacion();
            }
        }
        return promedio = total_cali / total_epi;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
    
}

