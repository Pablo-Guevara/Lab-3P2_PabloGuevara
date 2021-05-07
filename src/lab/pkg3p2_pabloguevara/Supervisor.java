package lab.pkg3p2_pabloguevara;

import java.util.ArrayList;

public class Supervisor extends Empleados{
    private String nombre;
    private String apellido;
    private float salario;
    private String nacionalidad;
    private ArrayList<Cajero> cajerosSupervisa=new ArrayList();
    private float salarioPromEmplSup;
    private float metaPromCadaCajero;

    public Supervisor() {
    }

    public Supervisor(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    public Supervisor(String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
    }

    public Supervisor(String rango) {
        super(rango);
    }

    public Supervisor(String nombre, String apellido, float salario, String nacionalidad, float salarioPromEmplSup, float metaPromCadaCajero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.salarioPromEmplSup = salarioPromEmplSup;
        this.metaPromCadaCajero = metaPromCadaCajero;
    }

    public Supervisor(String nombre, String apellido, float salario, String nacionalidad, float salarioPromEmplSup, float metaPromCadaCajero, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.salarioPromEmplSup = salarioPromEmplSup;
        this.metaPromCadaCajero = metaPromCadaCajero;
    }

    public Supervisor(String nombre, String apellido, float salario, String nacionalidad, float salarioPromEmplSup, float metaPromCadaCajero, String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.salarioPromEmplSup = salarioPromEmplSup;
        this.metaPromCadaCajero = metaPromCadaCajero;
    }

    public Supervisor(String nombre, String apellido, float salario, String nacionalidad, float salarioPromEmplSup, float metaPromCadaCajero, String rango) {
        super(rango);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.salarioPromEmplSup = salarioPromEmplSup;
        this.metaPromCadaCajero = metaPromCadaCajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<Cajero> getCajerosSupervisa() {
        return cajerosSupervisa;
    }

    public void setCajerosSupervisa(ArrayList<Cajero> cajerosSupervisa) {
        this.cajerosSupervisa = cajerosSupervisa;
    }

    public float getSalarioPromEmplSup() {
        return salarioPromEmplSup;
    }

    public void setSalarioPromEmplSup(float salarioPromEmplSup) {
        this.salarioPromEmplSup = salarioPromEmplSup;
    }

    public float getMetaPromCadaCajero() {
        return metaPromCadaCajero;
    }

    public void setMetaPromCadaCajero(float metaPromCadaCajero) {
        this.metaPromCadaCajero = metaPromCadaCajero;
    }

    @Override
    public String toString() {
        return "Supervisor{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", cajerosSupervisa=" + cajerosSupervisa + ", salarioPromEmplSup=" + salarioPromEmplSup + ", metaPromCadaCajero=" + metaPromCadaCajero + '}';
    }
    
    
    
}
