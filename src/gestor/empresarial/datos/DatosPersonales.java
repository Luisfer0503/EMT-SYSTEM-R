package gestor.empresarial.datos;

public class DatosPersonales {
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    public DatosPersonales(String nombre, String whatsapp, String correo){
        this.nombre=nombre;
        this.whatsapp=whatsapp;
        this.correo=correo;
    }

    public DatosPersonales() {

    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    protected String getCorreo() {
        return correo;
    }

    protected void setCorreo(String correo) {
        this.correo = correo;
    }

    protected String getWhatsapp() {
        return whatsapp;
    }

    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
