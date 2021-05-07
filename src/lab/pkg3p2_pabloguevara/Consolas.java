package lab.pkg3p2_pabloguevara;

import java.awt.Color;

public class Consolas extends Articulos{
    private String marca;
    private int cantAlmacenamiento;
    private int cantControles;
    private int numAccesorios;
    private String infoTarjetaVideo;

    public Consolas() {
    }

    public Consolas(int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
    }

    public Consolas(String marca, int cantAlmacenamiento, int cantControles, int numAccesorios, String infoTarjetaVideo) {
        this.marca = marca;
        this.cantAlmacenamiento = cantAlmacenamiento;
        this.cantControles = cantControles;
        this.numAccesorios = numAccesorios;
        this.infoTarjetaVideo = infoTarjetaVideo;
    }

    public Consolas(String marca, int cantAlmacenamiento, int cantControles, int numAccesorios, String infoTarjetaVideo, int numSerie, float precio, Color color, String informacionGarantia) {
        super(numSerie, precio, color, informacionGarantia);
        this.marca = marca;
        this.cantAlmacenamiento = cantAlmacenamiento;
        this.cantControles = cantControles;
        this.numAccesorios = numAccesorios;
        this.infoTarjetaVideo = infoTarjetaVideo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantAlmacenamiento() {
        return cantAlmacenamiento;
    }

    public void setCantAlmacenamiento(int cantAlmacenamiento) {
        this.cantAlmacenamiento = cantAlmacenamiento;
    }

    public int getCantControles() {
        return cantControles;
    }

    public void setCantControles(int cantControles) {
        this.cantControles = cantControles;
    }

    public int getNumAccesorios() {
        return numAccesorios;
    }

    public void setNumAccesorios(int numAccesorios) {
        this.numAccesorios = numAccesorios;
    }

    public String getInfoTarjetaVideo() {
        return infoTarjetaVideo;
    }

    public void setInfoTarjetaVideo(String infoTarjetaVideo) {
        this.infoTarjetaVideo = infoTarjetaVideo;
    }

    @Override
    public String toString() {
        return "Consolas{" + "marca=" + marca + ", cantAlmacenamiento=" + cantAlmacenamiento + ", cantControles=" + cantControles + ", numAccesorios=" + numAccesorios + ", infoTarjetaVideo=" + infoTarjetaVideo + '}';
    }
    
    
}
