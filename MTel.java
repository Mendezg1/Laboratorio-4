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
