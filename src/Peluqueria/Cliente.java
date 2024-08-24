import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList<Turno> turnos;
    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void addTurno(Turno turno) {
        turnos.add(turno);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

}
