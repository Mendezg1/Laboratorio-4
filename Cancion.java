/*
 * Nombre del programadores: Dolan Cuellar 21965, Gabriel García 21352, Ricardo Mendez 21289
 * Contacto: cue21965@uvg.edu. gt, gar21352@uvg.edu.gt, men21289@uvg.edu.gt
 * Nombre del programa: Cancion.java, Carro.java, Controlador.java, Mproductividad.java, MRadio.java, 
                        MReproductor.java, MTel.java, TipoA.java, TipoB.java, Tipo C.java, TipoS.java, Vista.java
 * Herramientas: Sublime Text 3, Visual Studio Code, IntelliJ IDEA
 * Fecha de creación: 08/11/2021
 * Fecha de finalización: 16/11/2021
 */
public class Cancion {
    private String nombre;
    private int duracion;
    private String autor;
    private String genero;

    // @param informacion de la cancion 
    public Cancion(String n, int d, String a, String g){
        nombre = n;
        duracion = d;
        autor = a;
        genero = g;
    }
    // @Return el nombre 
    public String getNombre(){
        return nombre;
    }
    //@Return la duracion de la cancion
    public int getDuracion(){
        return duracion;
    }
    // @Return el nombre del autor
    public String getAutor(){
        return autor;
    }
    // @Return el genero 
    public String getGen(){
        return genero;
    }
}
