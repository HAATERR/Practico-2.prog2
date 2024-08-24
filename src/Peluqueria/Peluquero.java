import java.util.ArrayList;

public class Peluquero {
    private String name;
    private int dni;
    private ArrayList<Turno> turnos;

    public Peluquero(String name, int dni) {
        this.name = name;
        this.dni = dni;
        this.turnos = new ArrayList<Turno>();

    }
    public String getName(){
        return this.name;
    }
    public int getDni(){
        return this.dni;
    }
    public ArrayList<Turno> getTurnos(){
        return this.turnos;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
}
