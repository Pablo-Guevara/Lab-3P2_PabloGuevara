package lab.pkg3p2_pabloguevara;

public class Personas {
     private String nomUsuario;
    private String contraseña;

    public Personas(String nomUsuario, String contraseña) {
        this.nomUsuario = nomUsuario;
        this.contraseña = contraseña;
    }

    public Personas() {
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Personas{" + "nomUsuario=" + nomUsuario + ", contraseña=" + contraseña + '}';
    }
    
    
}
