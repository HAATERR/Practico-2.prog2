import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> canchas;
    private int cantTurnosSerSocio;
    private int descuento;
    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.canchas = new ArrayList<Cancha>();
        this.cantTurnosSerSocio = 4;
        this.descuento = 10;
    }
    public LocalDate getFechaLimite(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = LocalDate.of(hoy.getYear(),(hoy.getMonth().minus(2)), hoy.getDayOfMonth());

        return fechaLimite;
    }

    public boolean verificarSocio(Usuario usuario){
        int turnosSacadosEnFecha = 0;
        for (int i = 0;i < usuario.getTurnos().size();i++){
            if (ChronoUnit.MONTHS.between(this.getFechaLimite(),usuario.getTurnos().get(i).getFecha()) <= 2){
                turnosSacadosEnFecha++;
            }
        }
        if (turnosSacadosEnFecha >= 4){
            return true;
        }
        return false;
    }
    public void reservarTurno(Turno turno){
        for (int i = 0;i < canchas.size();i++){
            if (!canchas.get(i).getTurnos().contains(turno)){
                canchas.get(i).addTurno(turno);
            }
        }
    }
}
}
