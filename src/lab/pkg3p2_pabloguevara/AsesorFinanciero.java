package lab.pkg3p2_pabloguevara;

import java.util.ArrayList;

public class AsesorFinanciero extends Empleados{
    private String nombre;
    private String apellido;
    private float salario;
    private String nacionalidad;
    private ArrayList<Clientes> clientesAtendidos=new ArrayList();
    int cantProdCompradosPorClientes;
    float creditosConcedidos;

    public AsesorFinanciero() {
    }

    public AsesorFinanciero(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    public AsesorFinanciero(String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
    }

    public AsesorFinanciero(String rango) {
        super(rango);
    }

    public AsesorFinanciero(String nombre, String apellido, float salario, String nacionalidad, int cantProdCompradosPorClientes, float creditosConcedidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantProdCompradosPorClientes = cantProdCompradosPorClientes;
        this.creditosConcedidos = creditosConcedidos;
    }

    public AsesorFinanciero(String nombre, String apellido, float salario, String nacionalidad, int cantProdCompradosPorClientes, float creditosConcedidos, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantProdCompradosPorClientes = cantProdCompradosPorClientes;
        this.creditosConcedidos = creditosConcedidos;
    }

    public AsesorFinanciero(String nombre, String apellido, float salario, String nacionalidad, int cantProdCompradosPorClientes, float creditosConcedidos, String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantProdCompradosPorClientes = cantProdCompradosPorClientes;
        this.creditosConcedidos = creditosConcedidos;
    }

    public AsesorFinanciero(String nombre, String apellido, float salario, String nacionalidad, int cantProdCompradosPorClientes, float creditosConcedidos, String rango) {
        super(rango);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantProdCompradosPorClientes = cantProdCompradosPorClientes;
        this.creditosConcedidos = creditosConcedidos;
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

    public ArrayList<Clientes> getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(ArrayList<Clientes> clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    public int getCantProdCompradosPorClientes() {
        return cantProdCompradosPorClientes;
    }

    public void setCantProdCompradosPorClientes(int cantProdCompradosPorClientes) {
        this.cantProdCompradosPorClientes = cantProdCompradosPorClientes;
    }

    public float getCreditosConcedidos() {
        return creditosConcedidos;
    }

    public void setCreditosConcedidos(float creditosConcedidos) {
        this.creditosConcedidos = creditosConcedidos;
    }

    @Override
    public String toString() {
        return "AsesorFinanciero{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", clientesAtendidos=" + clientesAtendidos + ", cantProdCompradosPorClientes=" + cantProdCompradosPorClientes + ", creditosConcedidos=" + creditosConcedidos + '}';
    }
    
    
}
