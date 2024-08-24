public class Gasto {
    private String tipoGasto;
    private double totalGasto;

    public Gasto(String tipoGasto, double totalGasto) {
        this.tipoGasto = tipoGasto;
        this.totalGasto = totalGasto;

    }
    public String getTipoGasto() {
        return tipoGasto;

    }
    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }
    public double getTotalGasto() {
        return totalGasto;
    }
    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }
}
