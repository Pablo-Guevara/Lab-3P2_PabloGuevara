package lab.pkg3p2_pabloguevara;

import java.awt.Color;

public class TeatrosEnCasa extends Articulos{
    private int cantAltavoces;
    private int cantDiscBR;
    private String infoLimpieza;
    private String infoLectorDisco;

    public TeatrosEnCasa() {
    }

    public TeatrosEnCasa(int cantAltavoces, int cantDiscBR, String infoLimpieza, String infoLectorDisco) {
        this.cantAltavoces = cantAltavoces;
        this.cantDiscBR = cantDiscBR;
        this.infoLimpieza = infoLimpieza;
        this.infoLectorDisco = infoLectorDisco;
    }

    public TeatrosEnCasa(int cantAltavoces, int cantDiscBR, String infoLimpieza, String infoLectorDisco, int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
        this.cantAltavoces = cantAltavoces;
        this.cantDiscBR = cantDiscBR;
        this.infoLimpieza = infoLimpieza;
        this.infoLectorDisco = infoLectorDisco;
    }

    public int getCantAltavoces() {
        return cantAltavoces;
    }

    public void setCantAltavoces(int cantAltavoces) {
        this.cantAltavoces = cantAltavoces;
    }

    public int getCantDiscBR() {
        return cantDiscBR;
    }

    public void setCantDiscBR(int cantDiscBR) {
        this.cantDiscBR = cantDiscBR;
    }

    public String getInfoLimpieza() {
        return infoLimpieza;
    }

    public void setInfoLimpieza(String infoLimpieza) {
        this.infoLimpieza = infoLimpieza;
    }

    public String getInfoLectorDisco() {
        return infoLectorDisco;
    }

    public void setInfoLectorDisco(String infoLectorDisco) {
        this.infoLectorDisco = infoLectorDisco;
    }
    
    
}
