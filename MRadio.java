import java.util.ArrayList;
public interface MRadio {
    ArrayList<Double> guardadas = new ArrayList<Double>();
    String frecuencia = "AM";
    double estacion = 0;
    public int cambiarVolumen(int a);
    public boolean getEstadoRad();
    public void cambiarEstadoRad();
    public String cambiarFrecuencia();
    public String cambiarEmisora(double a);
    public String guardarEmisora();
    public String cargarEmisora(double a);
}
