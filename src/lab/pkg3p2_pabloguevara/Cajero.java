package lab.pkg3p2_pabloguevara;

public class Cajero extends Empleados{
    private String nombre;
    private String apellido;
    private float salario;
    private String nacionalidad;
    private int cantAñosLab;
    private String horarioTrajado;
    private String horaAlmuerzo;
    private int metaVenderMes;
    private int cantAtendidos;

    public Cajero() {
    }

    public Cajero(String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
    }

    public Cajero(String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
    }

    public Cajero(String rango) {
        super(rango);
    }

    public Cajero(String nombre, String apellido, float salario, String nacionalidad, int cantAñosLab, String horarioTrajado, String horaAlmuerzo, int metaVenderMes, int cantAtendidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantAñosLab = cantAñosLab;
        this.horarioTrajado = horarioTrajado;
        this.horaAlmuerzo = horaAlmuerzo;
        this.metaVenderMes = metaVenderMes;
        this.cantAtendidos = cantAtendidos;
    }

    public Cajero(String nombre, String apellido, float salario, String nacionalidad, int cantAñosLab, String horarioTrajado, String horaAlmuerzo, int metaVenderMes, int cantAtendidos, String nomUsuario, String contraseña) {
        super(nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantAñosLab = cantAñosLab;
        this.horarioTrajado = horarioTrajado;
        this.horaAlmuerzo = horaAlmuerzo;
        this.metaVenderMes = metaVenderMes;
        this.cantAtendidos = cantAtendidos;
    }

    public Cajero(String nombre, String apellido, float salario, String nacionalidad, int cantAñosLab, String horarioTrajado, String horaAlmuerzo, int metaVenderMes, int cantAtendidos, String rango, String nomUsuario, String contraseña) {
        super(rango, nomUsuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantAñosLab = cantAñosLab;
        this.horarioTrajado = horarioTrajado;
        this.horaAlmuerzo = horaAlmuerzo;
        this.metaVenderMes = metaVenderMes;
        this.cantAtendidos = cantAtendidos;
    }

    public Cajero(String nombre, String apellido, float salario, String nacionalidad, int cantAñosLab, String horarioTrajado, String horaAlmuerzo, int metaVenderMes, int cantAtendidos, String rango) {
        super(rango);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.cantAñosLab = cantAñosLab;
        this.horarioTrajado = horarioTrajado;
        this.horaAlmuerzo = horaAlmuerzo;
        this.metaVenderMes = metaVenderMes;
        this.cantAtendidos = cantAtendidos;
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

    public int getCantAñosLab() {
        return cantAñosLab;
    }

    public void setCantAñosLab(int cantAñosLab) {
        this.cantAñosLab = cantAñosLab;
    }

    public String getHorarioTrajado() {
        return horarioTrajado;
    }

    public void setHorarioTrajado(String horarioTrajado) {
        this.horarioTrajado = horarioTrajado;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public int getMetaVenderMes() {
        return metaVenderMes;
    }

    public void setMetaVenderMes(int metaVenderMes) {
        this.metaVenderMes = metaVenderMes;
    }

    public int getCantAtendidos() {
        return cantAtendidos;
    }

    public void setCantAtendidos(int cantAtendidos) {
        this.cantAtendidos = cantAtendidos;
    }

    @Override
    public String toString() {
        return "Cajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", cantA\u00f1osLab=" + cantAñosLab + ", horarioTrajado=" + horarioTrajado + ", horaAlmuerzo=" + horaAlmuerzo + ", metaVenderMes=" + metaVenderMes + ", cantAtendidos=" + cantAtendidos + '}';
    }
    
    
}
