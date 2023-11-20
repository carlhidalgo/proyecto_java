package model;


/**
 *
 * @author carlos
 */
public class Cliente {

 private String run,nombre,genero,direccion,email,eCivil,fNacimiento,ciudad,nivelEducacional,ocupacion;
    private String dv_run;
    private int sueldo,c_id_nEducacional,c_id_ciudad,c_id_ocupacion;
    private boolean cuenta_existente;

    public Cliente() {
    }

    public Cliente(String run, String nombre, String genero, String direccion, String email, String eCivil, String fNacimiento, int sueldo, int c_id_nEducacional, int c_id_ciudad, int c_id_ocupacion, boolean cuenta_existente) {
        this.run = run;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.eCivil = eCivil;
        this.fNacimiento = fNacimiento;
        this.sueldo = sueldo;
        this.c_id_nEducacional = c_id_nEducacional;
        this.c_id_ciudad = c_id_ciudad;
        this.c_id_ocupacion = c_id_ocupacion;
  
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


    
    
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }         
    
}
