import java.time.LocalDateTime;

public class Turno {
    private Usuario usuario;
    private int precio;
    private int duracion;
    private LocalDateTime fecha;

    public Turno(Usuario usuario, int precio, int duracion, LocalDateTime fecha) {
        this.usuario = usuario;
        this.precio = precio;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    //GETS AND SETS
    public Usuario getUsuario() {
        return usuario;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
