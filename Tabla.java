public class Tabla {
    private int codigo;
    private double largoPies;
    private boolean enReparacion;


    public Tabla(int codigo, double largoPies, boolean enReparacion) {
        this.codigo = codigo;
        this.largoPies = largoPies;
        this.enReparacion = enReparacion;

    }

    public void LargoPies(double largoPies) {
        if (largoPies >= 5 && largoPies <= 10) {
            this.largoPies = largoPies;
        } else System.out.println("la Tabla no esta dentro del rango");

    }

    public Tabla(int codigo, double largoPies) {
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

    public boolean Disponible() {
        return !enReparacion;
    }

    public String descripcion() {
        return "Tabla: [codigo:" + codigo + " | largo: " + largoPies + " pies | Estado:" + enReparacion + "]";
    }
}