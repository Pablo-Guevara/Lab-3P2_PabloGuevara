package lab.pkg3p2_pabloguevara;

public class Tienda {
    private String identificador;
    private String ubicacion;
    private int cantMaxEmpleados;
    private int cantCajas;
    private String productoMasVendido;
    private int cantMaxArticulos;

    public Tienda() {
    }

    public Tienda(String identificador, String ubicacion, int cantMaxEmpleados, int cantCajas, String productoMasVendido, int cantMaxArticulos) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.cantMaxEmpleados = cantMaxEmpleados;
        this.cantCajas = cantCajas;
        this.productoMasVendido = productoMasVendido;
        this.cantMaxArticulos = cantMaxArticulos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantMaxEmpleados() {
        return cantMaxEmpleados;
    }

    public void setCantMaxEmpleados(int cantMaxEmpleados) {
        this.cantMaxEmpleados = cantMaxEmpleados;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public String getProductoMasVendido() {
        return productoMasVendido;
    }

    public void setProductoMasVendido(String productoMasVendido) {
        this.productoMasVendido = productoMasVendido;
    }

    public int getCantMaxArticulos() {
        return cantMaxArticulos;
    }

    public void setCantMaxArticulos(int cantMaxArticulos) {
        this.cantMaxArticulos = cantMaxArticulos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "identificador=" + identificador + ", ubicacion=" + ubicacion + ", cantMaxEmpleados=" + cantMaxEmpleados + ", cantCajas=" + cantCajas + ", productoMasVendido=" + productoMasVendido + ", cantMaxArticulos=" + cantMaxArticulos + '}';
    }
    
    
}
