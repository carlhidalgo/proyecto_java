package model;


/**
 *
 * @author carlos
 */
public class Cliente {

 private String run,nombre,genero,direccion,email,eCivil,fNacimiento,ciudad,nivelEducacional,ocupacion;
    private char dv_run;
    private int sueldo,c_id_nEducacional,c_id_ciudad,c_id_ocupacion;
    private boolean cuenta_existente;

    public Cliente() {
    }

    public Cliente(String run, String nombre, String genero, String direccion, String email, String eCivil, String fNacimiento, String ciudad, String nivelEducacional, String ocupacion, char dv_run, int sueldo, int c_id_nEducacional, int c_id_ciudad, int c_id_ocupacion, boolean cuenta_existente) {
        this.run = run;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.eCivil = eCivil;
        this.fNacimiento = fNacimiento;
        this.ciudad = ciudad;
        this.nivelEducacional = nivelEducacional;
        this.ocupacion = ocupacion;
        this.dv_run = dv_run;
        this.sueldo = sueldo;
        this.c_id_nEducacional = c_id_nEducacional;
        this.c_id_ciudad = c_id_ciudad;
        this.c_id_ocupacion = c_id_ocupacion;
        this.cuenta_existente = cuenta_existente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getDv_run() {
        return dv_run;
    }

    public void setDv_run(char dv_run) {
        this.dv_run = dv_run;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String geteCivil() {
        return eCivil;
    }

    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getC_id_nEducacional() {
        return c_id_nEducacional;
    }

    public void setC_id_nEducacional(int c_id_nEducacional) {
        this.c_id_nEducacional = c_id_nEducacional;
    }

    public int getC_id_ciudad() {
        return c_id_ciudad;
    }

    public void setC_id_ciudad(int c_id_ciudad) {
        this.c_id_ciudad = c_id_ciudad;
    }

    public int getC_id_ocupacion() {
        return c_id_ocupacion;
    }

    public void setC_id_ocupacion(int c_id_ocupacion) {
        this.c_id_ocupacion = c_id_ocupacion;
    }

    public boolean isCuenta_existente() {
        return cuenta_existente;
    }

    public void setCuenta_existente(boolean cuenta_existente) {
        this.cuenta_existente = cuenta_existente;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    
    
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }         
    
}
