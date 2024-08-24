import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private double totalRecaudado;
    private ArrayList<Gasto> gastos;

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.totalRecaudado = 0;
        this.gastos = new ArrayList<>();
    }
    public void addRecaudacion(Impuesto imp1,Impuesto imp2,Impuesto imp3,Impuesto imp4,Impuesto imp5){
        this.totalRecaudado = imp1.getTotalRecaudado() + imp2.getTotalRecaudado() + imp3.getTotalRecaudado() + imp4.getTotalRecaudado() + imp5.getTotalRecaudado();
    }
    public void addGasto(Gasto g){
        this.gastos.add(g);
    }
    public boolean gastaMasDeLoRecaudado(){
        double total = getTotalGastado();
        if (total > totalRecaudado){
            return true;
        }
        return false;
    }

    public double getTotalGastado(){
        double totalGastado = 0;
        for (int i = 0;i < gastos.size();i++){
            totalGastado += gastos.get(i).getTotalGasto();
        }
        return totalGastado;
    }
    //GETS
    public String getNombre() {
        return nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public double getTotalRecaudado() {
        return totalRecaudado;
    }
    //SETS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

}
