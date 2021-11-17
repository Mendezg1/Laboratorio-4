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
