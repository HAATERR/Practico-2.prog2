import AgendaPersonal.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private LocalDateTime fecha;
    private int precio;
    private Usuario usuario;

    public Turno(LocalDateTime fecha, int precio, Usuario usuario) {
        this.fecha = fecha;
        this.precio = precio;
        this.usuario = usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
