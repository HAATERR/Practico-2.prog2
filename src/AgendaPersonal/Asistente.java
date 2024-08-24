public class Asistente {
    private String nombre;
    private String email;
    private int telefono;

    public Asistente(String nombre, String email, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    //GETS
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getTelefono() {
        return telefono;
    }
    //SETS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
