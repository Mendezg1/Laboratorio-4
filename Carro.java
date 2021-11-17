import java.util.ArrayList;
import java.util.Random;
public class Carro implements MTel, MProductividad, MRadio, MReproductor{
    public boolean estadoRadio = false;
    public boolean estadoTel = false;
    public String modo = "";
    public int volumen = 0;
    public ArrayList<String> contactos = new ArrayList<String>();
    public ArrayList<Cancion> ListaRap = new ArrayList<Cancion>();
    public ArrayList<Cancion> ListaPop = new ArrayList<Cancion>();
    public ArrayList<Cancion> ListaRock = new ArrayList<Cancion>();
    public int posCancion = 0;
    public int listaActual = 0;
    public String tipo = "";
    protected void Contactos(){
        contactos.add("Emilio");
        contactos.add("Mamá");
        contactos.add("Papá");
        contactos.add("Tito");
        contactos.add("Gaby");
        contactos.add("Fernando");
        contactos.add("George");
        contactos.add("Papá 2");
        contactos.add("Bobby");
        contactos.add("Gio");
    }

    protected void Listas(){
        ListaRap.add(new Cancion("Big Poppa", 262, "The Notorius B.I.G.", "Rap"));
        ListaRap.add(new Cancion("La Pronoia del Sun Joke Fú", 241, "ChysteMC", "Rap"));
        ListaRap.add(new Cancion("Púrpura Pulpa", 356, "ChysteMC", "Rap"));
        ListaRap.add(new Cancion("Boombarrio", 241, "ChysteMC", "Rap"));
        ListaRap.add(new Cancion("Crudo", 181, "MNAK", "Rap"));
        ListaRap.add(new Cancion("Don Diablo", 136, "MNAK", "Rap"));
        ListaRap.add(new Cancion("Alfred's Theme", 341, "Eminem", "Rap"));
        ListaRap.add(new Cancion("When I Grow Up", 241, "NF", "Rap"));

        ListaPop.add(new Cancion("Shape of You", 263, "Ed Sheeran", "Pop"));
        ListaPop.add(new Cancion("Señorita", 206, "Shawn Mendes", "Pop"));
        ListaPop.add(new Cancion("Señirota", 211, "Abraham Mateo", "Pop"));
        ListaPop.add(new Cancion("7 rings", 185, "Ariana Grande", "Pop"));
        ListaPop.add(new Cancion("thank u, next", 331, "Ariana Grande", "Pop"));
        ListaPop.add(new Cancion("Call Me Maybe", 200, "Carly Rae Jepsen", "Pop"));
        ListaPop.add(new Cancion("Swalla", 236, "Jason Derulo", "Pop"));
        ListaPop.add(new Cancion("GMA", 176, "Jason Derulo", "Pop"));

        ListaRock.add(new Cancion("Chop Suey", 209, "System of a Down", "Rock"));
        ListaRock.add(new Cancion("The lines", 266, "Beartooth", "Rock"));
        ListaRock.add(new Cancion("Born For Greatness", 228, "Papa Roach", "Rock"));
        ListaRock.add(new Cancion("PA PA YA!!", 235, "BABYMETAL", "Rock"));
        ListaRock.add(new Cancion("Disease", 244, "Beartooth", "Rock"));
        ListaRock.add(new Cancion("Beaten In Lips", 247, "Beartooth", "Rock"));
        ListaRock.add(new Cancion("KARATE", 293, "BABYMETAL", "Rock"));
        ListaRock.add(new Cancion("HEADBANGER!!", 326, "BABYMETAL", "Rock"));

    }
    //@Param establecer el modo del carro

    public void setModo(String s){
        modo = s;
    }

    //@Return el modo

    public String getModo(){
        return modo;
    }

    public String[] getModos(){
        String[] s = new String[3];
        if(modo.equals("Radio")){
            s[0] = "Reproductor";
            s[1] = "Productividad";
            s[2] = "Telefono";
        }
        else if(modo.equals("Reproductor")){
            s[0] = "Radio";
            s[1] = "Productividad";
            s[2] = "Telefono";
        }
        else if(modo.equals("Productividad")){
            s[0] = "Radio";
            s[1] = "Reproductor";
            s[2] = "Telefono";
        }
        else if(modo.equals("Telefono")){
            s[0] = "Radio";
            s[1] = "Reproductor";
            s[2] = "Productividad";
        }
        return s;
    }

    //@param el cambio
    //@return volumen

    public int cambiarVolumen(int a){
        if(estadoRadio){
            if(a > 0){
                volumen += a;
            }
            else{
                if(volumen > 0){
                    volumen += a;
                }
            }
            return volumen;
        } else return -1;
    }

    //@Return las opciones

    public String getFunciones(){
        String s = "Las opciones del modo " + modo + " son: \n";
        if(modo.equals("Radio")){
            s+= " 1. Encender/Apagar \n 2. Cambiar Volumen \n 3. Cambiar Frecuencia \n 4. Cambiar Emisora \n 5. Guardar Emisora \n 6. Cargar Emisora \n";
        }
        else if(modo.equals("Reproductor")){
            s+= "1.  Seleccionar lista \n 2. Cambiar canción \n 3. Escuchar Canción";
        }
        else if(modo.equals("Productividad")){
            if(tipo.equals("A")) s+= "1. Tarjeta de presentación";
            else if(tipo.equals("C")) s+= "1. Ver pronóstico del tiempo";
            else if(tipo.equals("S")) s+= "1. Planificar Viaje";
        }
        else if(modo.equals("Telefono")){
            s+= "1. Conectar/Desconectar \n 2. Mostrar contactos \n 3. Llamar a contacto \n 4. Finalizar Llamada";
            if(tipo.equals("A")) s+= "\n 5. Llamar al último contacto llamado";
            else if(tipo.equals("C")) s+= "\n 5. Cambiar a llamada en espera";
            else if(tipo.equals("S")) s+= "\n 5. Cambiar entre bocina/auricular";
        }
        return s;
    }

    //@return el estado
    public boolean getEstadoRad(){
        return estadoRadio;
    }

    public void cambiarEstadoRad(){
        if(estadoRadio) estadoRadio = false;
        else estadoRadio = true;
    }
     //@return el estado del telefono
    public boolean getEstadoTel(){
        return estadoTel;
    }

    protected ArrayList<Double> guardadas = new ArrayList<Double>();
    String frecuencia = "AM";
    double estacion = 0;
    String tel = "11225599";
    protected String nombre = "";
    boolean conectado = true;
    boolean enEspera = false;
    String ultimollamado = "";
    String llamadaActual = "";
    String modoTel = "bocinas";
    public void conectar(){
        if(estadoTel){
            estadoTel = false;
        }
        else estadoTel = true;
    }
    //@Return la lista de contactos
    public String getContactos(){
        String s = "Los contactos registrados son: \n";
        for(int i = 0; i < contactos.size(); i++){
            s += (i+1 +". ") + contactos.get(i) + "\n";
        }
        return s;
    }
    //@param a quien llamar
    //@return si se llamo 
    public String llamarContacto(String s){
        if(getEstadoTel()){
            int p = -1;
            for(int i = 0; i < contactos.size(); i++){
                if(s.equals(contactos.get(i))){
                    p = i;
                }
            }
            if(p == -1){
                return "El contacto no se encuentra registrado";
            }
            else {
                llamadaActual = contactos.get(p);
                return "Se ha llamado al contacto: " + llamadaActual;
            }
        }
        else return "El teléfono no se encuentra conectado";
    }
 //@return la llamada finalizada
    public String Finalizar(){
        if(llamadaActual != ""){
            String s = "Se ha finalizado la llamada con: " + llamadaActual;
            ultimollamado = llamadaActual;
            llamadaActual = "";
            return s;
        }
        else return "No se encuentra en llamada.";
    }
     //@return lo que hace el telefono
    public String accionTel(){
        if(getEstadoTel()){
            String s = "";
            if(tipo.equals("A")){
                s = llamarContacto(ultimollamado);
            }
            else if(tipo.equals("C")){
                if(enEspera) enEspera = false;
                else{
                    enEspera = true;
                    s+= "Se ha puesto la llamada más reciente en espera";
                }
            }
            else if(tipo.equals("S")){
                s+= "Se ha cambiado la modalidad de "+ modoTel;
                if(modoTel.equals("bocinas")) modoTel = "auriculares";
                else modoTel = "bocinas";
                s+= " a "+ modoTel;
            }
            return s;
        }
        else return "El teléfono está desconectado";
    }

     //@return  las listas de reproduccion
    public String getListas(){
        String s = "Las listas de reproducción son: \n 1. Lista de Rock \n 2. Lista de Pop \n 3. Lista de Rap";
        return s;
    }
     //@param la lista 
    public void seleccionarLista(int a){
        listaActual = a;
    }
     //@return  El nombre de la cancion
    public String cambiarCancion(int a){
        String s = "La nueva canción es: ";
        if(listaActual == 1){
            if(a > 0){
                if(posCancion < ListaRock.size()){
                    posCancion += a;
                    s+= ListaRock.get(posCancion).getNombre();
                }
                else {
                    posCancion = 0;
                    s += ListaRock.get(posCancion).getNombre();
                }
            }
            else{
                if(posCancion == 0){
                    posCancion = ListaRock.size() -1;
                    s += ListaRock.get(posCancion).getNombre();
                } 
                else{
                    posCancion += a;
                    s += ListaRock.get(posCancion).getNombre();
                }
            }
        }
        else if (listaActual == 2){
            if(a > 0){
                if(posCancion < ListaPop.size()){
                    posCancion += a;
                    s+= ListaPop.get(posCancion).getNombre();
                }
                else {
                    posCancion = 0;
                    s += ListaPop.get(posCancion).getNombre();
                }
            }
            else{
                if(posCancion == 0){
                    posCancion = ListaPop.size() -1;
                    s += ListaPop.get(posCancion).getNombre();
                } 
                else{
                    posCancion += a;
                    s += ListaPop.get(posCancion).getNombre();
                }
            }
        }
        else if(listaActual == 3){
            if(a > 0){
                if(posCancion < ListaRap.size()){
                    posCancion += a;
                    s+= ListaRap.get(posCancion).getNombre();
                }
                else {
                    posCancion = 0;
                    s += ListaRap.get(posCancion).getNombre();
                }
            }
            else{
                if(posCancion == 0){
                    posCancion = ListaRap.size() -1;
                    s += ListaRap.get(posCancion).getNombre();
                } 
                else{
                    posCancion += a;
                    s += ListaRap.get(posCancion).getNombre();
                }
            }
        }
        return s;
    }

     //@return informacion de la cancion
    public String Escuchar(){
        String s = "";
        if(listaActual == 1){
            Cancion c = ListaRock.get(posCancion);
            s = "Se está reproduciendo la canción "+ c.getNombre() + " del género " + c.getGen() +  " que dura " + c.getDuracion() + " segundos, del cantante "+ c.getAutor() ;
        }
        else if(listaActual == 2){
            Cancion c = ListaPop.get(posCancion);
            s = "Se está reproduciendo la canción "+ c.getNombre() + " del género " + c.getGen() +  " que dura " + c.getDuracion() + " segundos, del cantante "+ c.getAutor() ;
        }
        else if(listaActual == 3){
            Cancion c = ListaRap.get(posCancion);
            s = "Se está reproduciendo la canción "+ c.getNombre() + " del género " + c.getGen() +  " que dura " + c.getDuracion() + " segundos, del cantante "+ c.getAutor() ;
        }
        return s;
    }
     //@return cambio de la frecuencia
    public String cambiarFrecuencia(){
        if(getEstadoRad()){
                String s = "Se cambió la frecuencia de " + frecuencia;
            if(frecuencia.equals("AM")) frecuencia = "FM";
            else frecuencia = "AM";
            s+= " a " + frecuencia;
            return s;
        } 
        else return "El radio se encuentra desconectado";
    }
     //@returnlos cambios de la emisora
    public String cambiarEmisora(double a){
        if(getEstadoRad()){
            String s = "La nueva emisora es ";
            if( a > 0){
                estacion += a;
                s+= estacion + "";
            }
            else{
                if(estacion < 0){
                    return "No se puede regresar más la emisora";
                }
                else {
                    estacion += a;
                    s += estacion + "";
                }
            }
            return s;
        }
        else return "El radio se encuentra desconectado";
    }
     //@return si se puede guardar
    public String guardarEmisora(){
        if(getEstadoRad()){
            if(guardadas.size() < 50){
                guardadas.add(estacion);
                return "Se ha guardado la emisora "+estacion;
            }
            else return "Se ha llegado al límite de espacios disponibles para guardar";
        }
        else return "El radio se encuentra desconectado.";
    }
     //@return informacion de la emisora
    public String cargarEmisora(double a){
        if(getEstadoRad()){
            estacion = a;
            return "Se ha cargado la emisora "+ estacion;
        }
        else return "El radio se encuentra desconectado";
    }

    public String accionProductividad(String[] n){
        String s = "";
        if(tipo.equals("A")){
            s = "-----Tarjeta de Presentación----- \n Nombre: " + nombre + "\n Número : "+ tel;
        }
        else if(tipo.equals("C")){
            Random rnd = new Random();
            int prob = rnd.nextInt(3);
            if(prob == 0){
                return "Pronóstico del día: Día Lluvioso";
            }
            else if(prob == 1){
                return "Pronóstico del día: Día Soleado";
            }
            else if(prob == 2){
                return "Pronóstico del día: Día caluroso";
            }
        }
        else if(tipo.equals("S")){
            s = "Se ha planificado el viaje. El punto de partida es " + n[0] + " y su destino será "+ n[1];
        }
        return s;
    }
}
