package lab.pkg3p2_pabloguevara;

import java.util.ArrayList;

public class Clientes extends Personas{
    private String nombre;
    private String apellido;
    private float salario;
    private String nacionalidad;
    private float cantCredito;
    private ArrayList<Articulos> ArticulosComprados=new ArrayList();
    private int cantCompras;
    private String direcDomicilio;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, float salario, String nacionalidad, String direcDomicilio, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.direcDomicilio = direcDomicilio;
    }

    public Clientes(String nombre, String apellido, float salario, String nacionalidad, String direcDomicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.direcDomicilio = direcDomicilio;
    }

    public Clientes(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    public Clientes(String nombre, String apellido, float salario, String nacionalidad, float cantCredito, int cantCompras, String direcDomicilio, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantCredito = cantCredito;
        this.cantCompras = cantCompras;
        this.direcDomicilio = direcDomicilio;
    }

    public Clientes(String nombre, String apellido, float salario, String nacionalidad, float cantCredito, int cantCompras, String direcDomicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantCredito = cantCredito;
        this.cantCompras = cantCompras;
        this.direcDomicilio = direcDomicilio;
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

    public float getCantCredito() {
        return cantCredito;
    }

    public void setCantCredito(float cantCredito) {
        this.cantCredito = cantCredito;
    }

    public ArrayList<Articulos> getArticulosComprados() {
        return ArticulosComprados;
    }

    public void setArticulosComprados(ArrayList<Articulos> ArticulosComprados) {
        this.ArticulosComprados = ArticulosComprados;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public String getDirecDomicilio() {
        return direcDomicilio;
    }

    public void setDirecDomicilio(String direcDomicilio) {
        this.direcDomicilio = direcDomicilio;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", cantCredito=" + cantCredito + ", ArticulosComprados=" + ArticulosComprados + ", cantCompras=" + cantCompras + ", direcDomicilio=" + direcDomicilio + '}';
    }

  
    
    
}
