package lab.pkg3p2_pabloguevara;

import java.awt.Color;

public class Televisores extends Articulos{
    private float tamañoPantalla;
    private boolean smart;
    private String Marca;
    private int cantConexiones;
    private float grosor;

    public Televisores() {
    }

    public Televisores(int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
    }

    public Televisores(float tamañoPantalla, boolean smart, String Marca, int cantConexiones, float grosor) {
        this.tamañoPantalla = tamañoPantalla;
        this.smart = smart;
        this.Marca = Marca;
        this.cantConexiones = cantConexiones;
        this.grosor = grosor;
    }

    public Televisores(float tamañoPantalla, boolean smart, String Marca, int cantConexiones, float grosor, int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
        this.tamañoPantalla = tamañoPantalla;
        this.smart = smart;
        this.Marca = Marca;
        this.cantConexiones = cantConexiones;
        this.grosor = grosor;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCantConexiones() {
        return cantConexiones;
    }

    public void setCantConexiones(int cantConexiones) {
        this.cantConexiones = cantConexiones;
    }

    public float getGrosor() {
        return grosor;
    }

    public void setGrosor(float grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Televisores{" + "tamañoPantalla=" + tamañoPantalla + ", smart=" + smart + ", Marca=" + Marca + ", cantConexiones=" + cantConexiones + ", grosor=" + grosor + '}';
    }
    
    
}
