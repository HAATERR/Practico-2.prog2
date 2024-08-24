import java.util.ArrayList;

public class Cancha {
    private ArrayList<Turno> turnos;
    private double precios;
    public Cancha(double precios) {
        this.precios = precios;
        this.turnos = new ArrayList<>();
    }
    public ArrayList<Turno> getTurnos() {
        return turnos;
    }
    public void addTurno(Turno turno) {
        turnos.add(turno);
    }

}
