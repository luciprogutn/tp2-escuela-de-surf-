public class Tabla {
    private int codigo;
    private double largoPies;
    private boolean enReparacion;


    public Tabla(int codigo, double largoPies, boolean enReparacion){
        this.codigo = codigo;
        this.largoPies= largoPies;
        this.enReparacion = enReparacion;

    }
    public Tabla(String codigo, double largoPies) {
        this(codigo, largoPies, false);
    }
    public boolean disponible() {
        return !this.enReparacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean enReparacion() {
        return enReparacion;
    }

    public double getLargoPies() {
        return largoPies;
    }
    public void setEnReparacion(boolean enReparacion) {
        this.enReparacion = enReparacion;
    }

}