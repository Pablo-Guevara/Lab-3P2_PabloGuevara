package lab.pkg3p2_pabloguevara;

import java.awt.Color;

public class EquiposSonido extends Articulos{
    private int cantAltavoces;
    private float potenciaMax;
    private int cantPuertosAux;
    private int cantDiscosSopor;
    private int cantPuertosUSB;

    public EquiposSonido() {
    }

    public EquiposSonido(int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
    }

    public EquiposSonido(int cantAltavoces, float potenciaMax, int cantPuertosAux, int cantDiscosSopor, int cantPuertosUSB) {
        this.cantAltavoces = cantAltavoces;
        this.potenciaMax = potenciaMax;
        this.cantPuertosAux = cantPuertosAux;
        this.cantDiscosSopor = cantDiscosSopor;
        this.cantPuertosUSB = cantPuertosUSB;
    }

    public EquiposSonido(int cantAltavoces, float potenciaMax, int cantPuertosAux, int cantDiscosSopor, int cantPuertosUSB, int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
        this.cantAltavoces = cantAltavoces;
        this.potenciaMax = potenciaMax;
        this.cantPuertosAux = cantPuertosAux;
        this.cantDiscosSopor = cantDiscosSopor;
        this.cantPuertosUSB = cantPuertosUSB;
    }

    public int getCantAltavoces() {
        return cantAltavoces;
    }

    public void setCantAltavoces(int cantAltavoces) {
        this.cantAltavoces = cantAltavoces;
    }

    public float getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(float potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public int getCantPuertosAux() {
        return cantPuertosAux;
    }

    public void setCantPuertosAux(int cantPuertosAux) {
        this.cantPuertosAux = cantPuertosAux;
    }

    public int getCantDiscosSopor() {
        return cantDiscosSopor;
    }

    public void setCantDiscosSopor(int cantDiscosSopor) {
        this.cantDiscosSopor = cantDiscosSopor;
    }

    public int getCantPuertosUSB() {
        return cantPuertosUSB;
    }

    public void setCantPuertosUSB(int cantPuertosUSB) {
        this.cantPuertosUSB = cantPuertosUSB;
    }

    @Override
    public String toString() {
        return "EquiposSonido{" + "cantAltavoces=" + cantAltavoces + ", potenciaMax=" + potenciaMax + ", cantPuertosAux=" + cantPuertosAux + ", cantDiscosSopor=" + cantDiscosSopor + ", cantPuertosUSB=" + cantPuertosUSB + '}';
    }
    
    
}
