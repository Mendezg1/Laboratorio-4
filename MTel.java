/*
 * Nombre del programadores: Dolan Cuellar 21965, Gabriel García 21352, Ricardo Mendez 21289
 * Contacto: cue21965@uvg.edu. gt, gar21352@uvg.edu.gt, men21289@uvg.edu.gt
 * Nombre del programa: Cancion.java, Carro.java, Controlador.java, Mproductividad.java, MRadio.java, 
                        MReproductor.java, MTel.java, TipoA.java, TipoB.java, Tipo C.java, TipoS.java, Vista.java
 * Herramientas: Sublime Text 3, Visual Studio Code, IntelliJ IDEA
 * Fecha de creación: 08/11/2021
 * Fecha de finalización: 16/11/2021
 */
public interface MTel {
    String tel = "11225599";
    boolean conectado = true;
    String ultimollamado = "";
    String llamadaActual = "";
    boolean enEspera = false;
    public void conectar();
    public String getContactos();
    public String llamarContacto(String s);
    public String Finalizar();
    public String accionTel();
    public boolean getEstadoTel();
}
