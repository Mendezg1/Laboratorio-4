/*
 * Nombre del programadores: Dolan Cuellar 21965, Gabriel García 21352, Ricardo Mendez 21289
 * Contacto: cue21965@uvg.edu. gt, gar21352@uvg.edu.gt, men21289@uvg.edu.gt
 * Nombre del programa: Cancion.java, Carro.java, Controlador.java, Mproductividad.java, MRadio.java, 
                        MReproductor.java, MTel.java, TipoA.java, TipoB.java, Tipo C.java, TipoS.java, Vista.java
 * Herramientas: Sublime Text 3, Visual Studio Code, IntelliJ IDEA
 * Fecha de creación: 08/11/2021
 * Fecha de finalización: 16/11/2021
 */
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
