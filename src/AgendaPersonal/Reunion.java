import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private String tema;
    private int duracion;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Asistente> asistentes;
    private LocalDate fecha;

    public Reunion(String lugar, String tema, int duracion, LocalDate fecha) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.fecha = fecha;
        this.usuarios = new ArrayList<>();
        this.asistentes = new ArrayList<>();
    }
    //GETS
    public String getLugar() {
        return lugar;

    }
    public String getTema() {
        return tema;
    }
    public int getDuracion() {
        return duracion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    //SETS

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void deleteUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }
    public void addAsistente(Asistente asistente) {
        this.asistentes.add(asistente);
    }
    public void deleteAsistente(Asistente asistente) {
        this.asistentes.remove(asistente);
    }
}
