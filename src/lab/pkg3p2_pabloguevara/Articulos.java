package lab.pkg3p2_pabloguevara;

import java.awt.Color;

public class Articulos {
    private int numSerie;
    private float precio;
    private Color color;
    private String informacionGarantia;

    public Articulos() {
    }

    public Articulos(int numSerie, float precio, Color color, String informacionGarantia) {
        this.numSerie = numSerie;
        this.precio = precio;
        this.color = color;
        this.informacionGarantia = informacionGarantia;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getInformacionGarantia() {
        return informacionGarantia;
    }

    public void setInformacionGarantia(String informacionGarantia) {
        this.informacionGarantia = informacionGarantia;
    }

    @Override
    public String toString() {
        return "Articulos{" + "numSerie=" + numSerie + ", precio=" + precio + ", color=" + color + ", informacionGarantia=" + informacionGarantia + '}';
    }
    
    
}
