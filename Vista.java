/*
 * Nombre del programadores: Dolan Cuellar 21965, Gabriel García 21352, Ricardo Mendez 21289
 * Contacto: cue21965@uvg.edu. gt, gar21352@uvg.edu.gt, men21289@uvg.edu.gt
 * Nombre del programa: Cancion.java, Carro.java, Controlador.java, Mproductividad.java, MRadio.java, 
                        MReproductor.java, MTel.java, TipoA.java, TipoB.java, Tipo C.java, TipoS.java, Vista.java
 * Herramientas: Sublime Text 3, Visual Studio Code, IntelliJ IDEA
 * Fecha de creación: 08/11/2021
 * Fecha de finalización: 16/11/2021
 */
import java.util.Scanner;
public class Vista {
    Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }
    // @params El mensaje a mostrar
    // @return la lectura del ususario

    public String askStrings(String s){
        System.out.println("\n"+s+"\n");
        return scan.nextLine();
    }
    // @params El mensaje a mostrar
    // @return la lectura del ususario

    public int askInts(String s){
        System.out.println("\n"+s+"\n");
        try{
            return Integer.parseInt(scan.nextLine());
        }
        catch(Exception e){
            return -1;
        }
    }

    // @params El mensaje a mostrar
    // @return la lectura del ususario

    public Double askDoubles(String s){
        System.out.println("\n"+s+"\n");
        try{
            return Double.parseDouble(scan.nextLine());
        }
        catch(Exception e){
            return -1.0;
        }
    }
    
    // @return la opcion del ususario
    
    public int Menu(){
        
        System.out.println("\n¡Bienvenido!. ¿Qué desea hacer? \n 1. Cambiar de Modo \n 2. Seleccionar alguna función del Modo \n 3. Salir \n");
        try{
            return Integer.parseInt(scan.nextLine());
        }
        catch(Exception e){
            return -1;
        }
        
        
    }

    // @params El mensaje a mostrar
    // @return

    public void Mensaje(String s){
        System.out.println(s);
    }
}
