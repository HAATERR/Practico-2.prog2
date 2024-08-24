import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addCiudad(Ciudad c) {
        this.ciudades.add(c);
    }
    public boolean mitadCiudadesConDeficit(){
        int contador = 0;
        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).gastaMasDeLoRecaudado()){
                contador++;
            }
        }
        if (contador >= (ciudades.size()) / 2) {
            return true;
        }
        return false;
    }
}
