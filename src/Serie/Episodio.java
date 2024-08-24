public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo, String descripcion, boolean flag, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }
    public String getTitulo() {
        return titulo;

    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isFlag() {
        return flag;
    }

    public void ingresarCalificacion(int calificacion) {
        if (calificacion < 1  || calificacion > 5 && flag) {
            this.calificacion = calificacion;
        }else{
            System.out.println("Calificacion invalida. Debe ser entre 1 y 5");
        }
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public void marcarVisto() {
        this.flag = true;
    }
    public int getCalificacion(){
        return calificacion;
    }


}
