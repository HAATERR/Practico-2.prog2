import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int DNI;
    private ArrayList<Turno> cant_turnos;

    public Usuario(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.cant_turnos = new ArrayList<>();
    }
    public void addTurno(Turno turno) {
        cant_turnos.add(turno);
    }
    public ArrayList<Turno> getTurnos() {
        return cant_turnos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDNI() {
        return DNI;
    }
}
