/*
 * Nombre del programadores: Dolan Cuellar 21965, Gabriel García 21352, Ricardo Mendez 21289
 * Contacto: cue21965@uvg.edu. gt, gar21352@uvg.edu.gt, men21289@uvg.edu.gt
 * Nombre del programa: Cancion.java, Carro.java, Controlador.java, Mproductividad.java, MRadio.java, 
                        MReproductor.java, MTel.java, TipoA.java, TipoB.java, Tipo C.java, TipoS.java, Vista.java
 * Herramientas: Sublime Text 3, Visual Studio Code, IntelliJ IDEA
 * Fecha de creación: 08/11/2021
 * Fecha de finalización: 16/11/2021
 */
public class Controlador {
    public static void main(String[] args){
        Vista v = new Vista();
        Carro c = new Carro();
        int opcion = -1;
        String tipo = "", nombre = "", modo = "";
        while(opcion == -1){
            opcion = v.askInts("¿Qué tipo de carro posee? Ingrese el número de la opción. \n 1. A\n 2. C \n 3. S");
            if(opcion == 1){
                tipo = "A";
            }
            else if(opcion == 2){
                tipo = "C";
            }
            else if(opcion == 3){
                tipo = "S";
            }
            else v.Mensaje("Por favor ingrese una de las opciones mostradas.");
        }
        nombre = v.askStrings("Ingrese su nombre");
        opcion = -1;
        while(opcion == -1){
            opcion = v.askInts("¿En qué modo desea iniciar el carro? \n 1. Radio \n 2. Reproductor \n 3. Productividad \n 4. Teléfono");
            if(opcion == 1){
                modo = "Radio";
            }
            else if(opcion == 2){
                modo = "Reproductor";
            }
            else if(opcion == 3){
                modo = "Productividad";
            }
            else if(opcion == 4){
                modo = "Telefono";
            }
            else v.Mensaje("Por favor ingrese una de las opciones mostradas.");
        }
        if(tipo.equals("A")){
            c = new TipoA(modo, nombre);
        }
        else if(tipo.equals("C")){
            c = new TipoC(modo, nombre);
        }
        if(tipo.equals("S")){
            c = new TipoS(modo, nombre);
        }
        opcion = 0;
        while(opcion != 3){
            opcion = v.Menu();
            if(opcion == 1){
                String[] mod = c.getModos();
                int m = v.askInts("¿A qué modo desea cambiar? Sus opciones son: \n 1. "+mod[0]+ " \n 2. "+ mod[1] + "\n 3. "+ mod[2]);
                modo = mod[m-1];
                c.setModo(modo);
            }

            if(opcion == 2){
                v.Mensaje(c.getFunciones());
                int funcion = v.askInts("¿Qué función desea realizar? (Ingrese el número)");
                if(modo.equals("Radio")){
                    if(funcion == 1){
                        c.cambiarEstadoRad();
                        v.Mensaje("Se cambio el estado de la radio.");
                    }
                    else if(funcion == 2){
                        String sb = v.askStrings("¿Desea subir volumen? (Y/N)\n Para bajar volumen ingrese 'N'");
                        int vol = -1;
                        while(vol == -1){
                            vol = v.askInts("¿Cuanto volumen desea subir o bajar? Ingrese el número");
                            if(vol == -1 || vol < 0){
                                v.Mensaje("Por favor ingrese un número válido.");
                            }
                        }
                        if(sb.equals("Y")) {
                            if(c.cambiarVolumen(vol) > 0){
                                v.Mensaje("Se ha subido "+ vol+ " de volumen.");
                            }
                            else v.Mensaje("El radio no se encuentra conectado.");
                            
                        }
                        else {
                            if(c.cambiarVolumen(vol*-1) > 0){
                                v.Mensaje("Se ha bajado "+ vol+" de volumen.");
                            }
                            else v.Mensaje("El radio no se encuentra conectado");
                        }
                        
                    }
                    else if(funcion == 3){
                        c.cambiarFrecuencia();
                        v.Mensaje("Se ha cambiado la frecuencia de la radio.");
                    }
                    else if(funcion == 4){
                        String sb = v.askStrings("¿Desea avanzar en las emisoras? (Y/N)\n Para regresar en las emisoras ingrese N.");
                        if(sb.equals("Y")){
                            v.Mensaje(c.cambiarEmisora(0.5));
                        }
                        else{
                            v.Mensaje(c.cambiarEmisora(-0.5));
                        }
                    }
                    else if(funcion == 5){
                        v.Mensaje(c.guardarEmisora());
                    }
                    else if(funcion == 6){
                        double emi = v.askDoubles("¿Qué número de emisora quiere cargar?");
                        if(emi > 0){
                            v.Mensaje(c.cargarEmisora(emi));
                        }
                        else v.Mensaje("Número de emisora inválido");
                    }
                    else v.Mensaje("Por favor ingrese una de las opciones mostradas.");
                }
                else if(modo.equals("Reproductor")){
                    if(funcion == 1){
                        v.Mensaje(c.getListas());
                        int lista = v.askInts("¿Qué lista desea seleccionar?");
                        c.seleccionarLista(lista);
                        v.Mensaje("Se ha seleccionado la lista "+lista);
                    }
                    else if(funcion == 2){
                        String sb = v.askStrings("¿Desea avanzar en la lista? (Y/N) \n Para regresar en la lista ingrese 'N'");
                        if(sb.equals("Y")){
                            v.Mensaje(c.cambiarCancion(1));
                        }
                        else v.Mensaje(c.cambiarCancion(-1));
                    }
                    else if(funcion == 3){
                        v.Mensaje(c.Escuchar());
                    }
                    else v.Mensaje("Por favor ingrese una de las opciones mostradas.");
                }
                else if(modo.equals("Productividad")){
                    if(tipo.equals("A")){
                        String[] n = {""}; // La función de productividad de este tipo de carros no necesita parámetros, pero al ser una
                        //función que forma parte del polimorfismo, requiere cumplirlos.
                        v.Mensaje(c.accionProductividad(n));
                    }
                    else if(tipo.equals("C")){
                        String[] n = {""}; //Al igual que la opción pasada, no requiere parámetros pero por temas de polimorfismo los requiere.
                        v.Mensaje(c.accionProductividad(n));
                    }
                    else if(tipo.equals("S")){
                        String[] n = new String[2];
                        n[0] = v.askStrings("Ingrese el punto de partida del viaje");
                        n[1] = v.askStrings("Ingrese el destino del viaje");
                        v.Mensaje(c.accionProductividad(n));
                    }
                }
                else if(modo.equals("Telefono")){
                    if(funcion == 1){
                        c.conectar();
                        if(c.getEstadoTel()) v.Mensaje("El telefono se conectó.");
                        else v.Mensaje("El telefono se desconectó.");
                    }
                    else if(funcion == 2){
                        v.Mensaje(c.getContactos());
                    }
                    else if(funcion == 3){
                        String contacto = v.askStrings("¿A qué contacto desea llamar?");
                        v.Mensaje(c.llamarContacto(contacto));
                    }
                    else if(funcion == 4){
                        v.Mensaje(c.Finalizar());
                    }
                    else if(funcion == 5){
                        v.Mensaje(c.accionTel());
                    }
                    else v.Mensaje("Por favor ingrese una de las opciones mostradas.");
                }
            }
        }
    }
}
e