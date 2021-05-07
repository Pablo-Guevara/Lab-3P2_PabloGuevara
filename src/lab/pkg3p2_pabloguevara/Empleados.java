package lab.pkg3p2_pabloguevara;

public class Empleados extends Personas{
    private String rango;

    public Empleados() {
    }

    public Empleados(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    public Empleados(String rango, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.rango = rango;
    }

    public Empleados(String rango) {
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Empleados{" + "rango=" + rango + '}';
    }
   
    
    
}
