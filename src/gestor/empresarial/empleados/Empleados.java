package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.*;
import login.DatosPersonales;

import java.time.Year;
import java.util.List;

public final class Empleados implements iEmpleados{
    private  int id;
    public GestionErrores error;
    private DatosEmpresariales datEmp[];
    private Contrato contra[];
    public GestionErrores err;
    private int i;
    private int j;
    private Empleados empleados;
    private DatosPersonales datPer[];

    public Empleados() {
        this.id = 0;
        empleados = null;
        datPer = new DatosPersonales[50];
        datEmp=new DatosEmpresariales[50];
        contra=new Contrato[50];
        i = 0;
        j = 0;
    }

    public Empleados(String nombre, String apellidos, String correo) {

    }


    public void addDatosPersonales(String nombre, String Apellidos, String Correo){
        if(i<100)
        {
            datEmp[i] = new DatosEmpresariales(i, nombre, Apellidos, Correo);
            i++;
        }
        else{
            System.out.println("Ya no esta disponible");
        }
    }
    public void addContato(int id, int annio){
        if (i < 100) {
            int i=findEmpleado(id);
            if (i>-1) {
                contra[j] = new Contrato(i);
                this.j++;
            }
        }
        else {
            System.out.println("Ya no hay vacantes");
        }
    }

    private int findEmpleado(int id){
        return id;
    }
    private int findEmpleado(String nombre){
        return 123;
    }
    public void setWhatsapp(int id, String whatsapp){

    }
    private String datosPersonales(int id){
        return "pendiente";
    }
    public String getInfoEmpleados(int id){
        return "pendiente";
    }
    public String getInfoEmpleado(String nombre){
        return "pendiente";
    }
    public void setAdscripcion(int id, String Correo){

    }
    public void setTelefonoExtension(int id, String lada){

    }
    public void setPuesto(int id, String puesto){

    }
    public void showDatosEmpleados(){

    }
    public void showContratoEmpleado(int id){

    }
    public int getAntiguedad(int id){
        return 123;
    }
    public void setCargo(Cargos cargo){

    }

    public void addEmpleado(Empleados empleado) {
    }

    public List<Empleados> getListaEmpleados() {
        return getListaEmpleados();
    }
}
//package gestor.empresarial.empleados;
//
////Importa dos clases de otros paquetes
//import gestor.empresarial.contrato.*;
//        import gestor.empresarial.datos.*;
//        import gestor.errores.GestionErrores;
//import java.time.Year;
//
////Declara una clase abstracta Empleados que implementa la interfaz iEmpleados.
//// Al ser final, esta clase no puede ser heredada
//public final class Empleados implements iEmpleados {
//    //Atibutos
//    //arreglo de objetos
//    private DatosEmpresariales empreDatos[];
//    private gestor.empresarial.datos.DatosPersonales persoDatos[];
//    private Contrato contraDatos[];
//    public int[] guard = new int[50]; //Arreglo
//    private static Empleados dependencia;//atributo de tipo Empleado
//    private int i;
//    public GestionErrores error; //atributo de  tipo GestionErrores
//
//    //Constructor sin parámetros
//    public Empleados() {
//        i = 0;//inicializar i
//        dependencia = null; //no contiene nada
//        //inicializar arrglos
//        empreDatos = new DatosEmpresariales[50];
//        persoDatos = new gestor.empresarial.datos.DatosPersonales[50];
//        contraDatos = new Contrato[50];
//    }
//
//    //Mantener datos
//    public static Empleados getInstancia() {
//        if (dependencia == null) {
//            dependencia = new Empleados();
//        }
//        return dependencia;//devuelve instancia de empleados
//    }
//
//    //Método addDatosPersonales con paso de parámetros-agregacion
//    public void addDatosPersonales(gestor.empresarial.datos.DatosPersonales datosPersonales) {//Agregar datos personales de un empleado
//        this.persoDatos[this.i] = datosPersonales;
//        guard[i] = i + 1; //Asigna valor al arreglo
//        this.i++;
//    }
//
//    public void imprimirDatos(){
//        if(datosPerVacios() == false){//Ciclo para recorrer el arreglo
//            for(int j=0; j<50; j++){
//                if (persoDatos[j] != null){
//                    String nombre = persoDatos[j].getNombre();
//                    String correo = persoDatos[j].getCorreo();
//                    String whatsapp = persoDatos[j].getWhatsapp();
//                    System.out.println("Id: "+guard[j]+"\tNombre: "+nombre + "\tCorreo: "+correo + "\tWhatsapp: "+whatsapp);
//                }
//            }
//        }
//        if (datosEmpVacios() == false){// verifica si los datos empresariales están vacíos
//            for(int j=0; j<50; j++){
//                if (empreDatos[j] != null){
//                    String telefono = empreDatos[j].getTelefonoExterior();
//                    String extencion = empreDatos[j].getExtension();
//                    String adscripcion = empreDatos[j].getAdscripcion();
//                    String puesto = empreDatos[j].getPuesto();
//                    System.out.println("ID:" + guard[j] + "\tTelefono:" + telefono + "\tExtension:" + extencion + "\tAdscripcion:" + adscripcion + "\tPuesto:" + puesto);
//                }
//            }
//        }
//
//        if (datosContratoVacios() == false){ //Se obtienen los datos empresariales del empleado en la posición j
//            for(int j=0; j<50; j++){
//                if (contraDatos[j] != null){
//                    int noContrato = contraDatos[j].getNoContrato();
//                    int annio = contraDatos[j].getAnnio();
//                    //String horario = contraDatos[j].getHorario();
///*********/         Cargos tipoCargo = contraDatos[j].getTipoCargo();
//                    //Se imprimen datos
//                    System.out.println("ID:" + guard[j] + "\tNoContrato:" + noContrato + "\tAnnio:" + annio + "\tCargo:" + tipoCargo);
//                }
//            }
//        }
//    }
//
//    //Método addContrato con pas de parámetros
//    /*public void addContrato(int indice, Contrato contrato) {
//
//        this.contraDatos[indice] = contrato;
//    }*/
//
//    //Método addDatosEmpresariales-agregacion
//    public void addDatosEmpresariales(int start, DatosEmpresariales datosEmpresariales) {
//        this.empreDatos[start] = datosEmpresariales;
//    }
//
//    //Método addContrato-agregacion
//    public void addContrato(int start, Contrato contrato) {
//        this.contraDatos[start] = contrato;
//    }
//
//
//    //Método Para buscar Empleados
//    public int findEmpleado(int id) {//busca un empleado por su Id
//        int start = -1;
//        for (int j = 0; j < 50; j++) {//ciclo que recorre el arreglo
//            if (guard[j] == id) {//si la posición j es igual al id
//                start = j;
//                break;
//            }
//        }
//        return start;//devuelve -1 si no se encuentra
//    }
//
//    //Método  findEmpleado
//    private int findEmpleado(String nombre) {//busca un empleado por su nombre
//        int start = -1;
//        for (int j = 0; j < 50; j++) {//ciclo que recorre el arreglo
//            if (persoDatos[j] != null && persoDatos[j].getNombre().equals(nombre)) {
//                start = j;
//                break;
//            }
//        }
//        return start;//devuelve -1 si no se encuentra
//    }
//
//    //Get de id
//    public int getId(int start){
//        return guard[start];
//    }
//    //Get de infoPersonal
//    public gestor.empresarial.datos.DatosPersonales getInfoPersonal(int start) {
//        gestor.empresarial.datos.DatosPersonales datosPersonales = this.persoDatos[start];
//        return datosPersonales;
//    }
//    //Get de infoEmpresarial
//    public DatosEmpresariales getInfoEmpresarial(int start) {
//        DatosEmpresariales datosEmpresariales = this.empreDatos[start];
//        return datosEmpresariales;
//    }
//    //Get para infoContarto
//    public Contrato getInfoContrato(int start) {
//        Contrato contrato = this.contraDatos[start];
//        return contrato;
//    }
//
//    //Mostrar datos del empleado
//    public void showDatosEmpleados() {
//
//    }
//
//    //Mostrar contratos
//    public void showContradosEmpleados(int x) {
//
//    }
//
//    //Método getAntiguedad que regresa w
//    public int getAntiguedad(int anio) {
//        int antiguedad = Year.now().getValue() - anio;
//        return 0;
//    }
//
//    //Método setCargo con paso de parámetro
//    public void setCargo(Cargos r) {
//
//    }
//
//
//    //Método para dedectar datos persoanles vacios
//    public boolean datosPerVacios(){
//        int a=0;
//        boolean vacio;
//        for(int j=0; j<50; j++){//Ciclo que recorre el arreglo
//            if(persoDatos[j] != null){//si persoDatos en la posición j es diferente a null
//                a=a + 1;
//            }
//        }
//        if (a>0){
//            vacio = false;
//        }else{
//            vacio = true;
//        }
//        return vacio;
//    }
//
//    //Método para dedectar datos empresarilaes vacios
//    public boolean datosEmpVacios(){
//        int t=0;
//        boolean vacio;
//        for(int j=0; j<50; j++){
//            if(empreDatos[j] != null){//Si empreDatos en la posición j es difrente a null
//                t=t+ 1;
//            }
//        }
//        if (t>0){
//            vacio = false;
//        }else{
//            vacio = true;
//        }
//        return vacio;
//    }
//
//    //Método para dedectar datos de contrato vacios
//    public boolean datosContratoVacios(){
//        int z=0;
//        boolean vacio;
//        for(int j=0; j<50; j++){//Ciclo que recorre el arreglo
//            if(contraDatos[j] != null){
//                z=z+ 1;
//            }
//        }
//        if (z>0){
//            vacio = false;
//        }else{
//            vacio = true;
//        }
//        return vacio;
//    }
//
//    @Override
//    public String getInfoEmpleado(int a) {
//        return null;
//    }
//
//    @Override
//    public String getInfoEmpleado(String a) {
//        return null;
//    }
//
//
//    @Override
//    public void showDatosEmpleado() {
//
//    }
//
//    @Override
//    public int getAntiguedad() {
//        return 0;
//    }
//
//    //metodo para encontrar los datos duplicados
//    public boolean buscarDuplicadosP(int id, String nombre, String whatsapp, String correo){
//        boolean hayDuplicados = false; //se inicia en false porque no a detectado ningún duplicado
//        for(int j=0; j<50; j++){//ciclo para recorrer el arreglo
//            gestor.empresarial.datos.DatosPersonales obj = getInfoPersonal(j);//objeto de datosPersonales
//            if (obj != null){//si el objeto no es nula, es porque hay datos almacenados
//                int idP = guard[j];
//                //Se obtiene datos de empleados
//                String nombreP = obj.getNombre();
//                String whatsP = obj.getWhatsapp();
//                String correoP = obj.getCorreo();
//                //se verifica si alguno de los datos personales del empleado
//                // es igual a los parámetros que se pasaron
//                if(idP == id || nombreP.equals(nombre) || whatsP.equals(whatsapp) || correoP.equals(correo)){
//                    hayDuplicados = true;// true si hay datos duplicados
//                    break;
//                }
//            }
//        }
//        return hayDuplicados;//indica si hay o no duplicados
//    }
//}
//
//
//
//
