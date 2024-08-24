import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public boolean addReunion(Reunion r) {
        for (int i = 0; i < this.reuniones.size(); i++) {
            if (this.reuniones.get(i).getFecha() == r.getFecha()) {
                return false;
            }
        }
        return this.reuniones.add(r);
    }
}
