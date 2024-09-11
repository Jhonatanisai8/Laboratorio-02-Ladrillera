package modelo;

public class Embarque {

    //atributos
    private int numero;
    private int codigo;
    private String nombreDistribuidor;
    private String tipoLadrillos;
    private String tipoCamion;
    private int cantidadLadrillos;

    //montos a calcular
    private double precioUnidad;
    private double costoTotalEmbarque;

    private static int ultimo;

    
    //constructores
    public Embarque() {
        
    }

    public Embarque(int codigo, String nombreDistribuidor, String tipoLadrillos, String tipoCamion, int cantidadLadrillos) {
        this.numero = ++ultimo;
        this.codigo = codigo;
        this.nombreDistribuidor = nombreDistribuidor;
        this.tipoLadrillos = tipoLadrillos;
        this.tipoCamion = tipoCamion;
        this.cantidadLadrillos = cantidadLadrillos;
    }

    public int getCodigo() { return codigo;  }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) {this.numero = numero; }

    public String getNombreDistribuidor() { return nombreDistribuidor;}

    public void setNombreDistribuidor(String nombreDistribuidor) { this.nombreDistribuidor = nombreDistribuidor;}

    public String getTipoLadrillos() { return tipoLadrillos; }

    public void setTipoLadrillos(String tipoLadrillos) {  this.tipoLadrillos = tipoLadrillos; }
    
    public String getTipoCamion() {  return tipoCamion; }

    public void setTipoCamion(String tipoCamion) {this.tipoCamion = tipoCamion; }

    public int getCantidadLadrillos() {return cantidadLadrillos; }

    public void setCantidadLadrillos(int cantidadLadrillos) {this.cantidadLadrillos = cantidadLadrillos;}

    public double getPrecioUnidad() {return precioUnidad; }

    public void setPrecioUnidad(double precioUnidad) {this.precioUnidad = precioUnidad;}

    public double getCostoTotalEmbarque() {return costoTotalEmbarque; }

    public void setCostoTotalEmbarque(double costoTotalEmbarque) {this.costoTotalEmbarque = costoTotalEmbarque; }

    
    public void calcularMontoTotal() {
        double gasto = 0;
        //minusculas
        switch (getTipoLadrillos().toLowerCase()) {
            case "kin kong", "pandereta" ->
                setPrecioUnidad(120);
        }

        double monto = getPrecioUnidad() * getCantidadLadrillos();

        switch (getTipoCamion().toLowerCase()) {
            case "paletizados" -> {
                if (getCantidadLadrillos() <= 3000) {
                    gasto = 420;
                } else {
                    gasto = 350;
                }
            }
            case "con guinche" -> {
                if (getCantidadLadrillos() <= 3000) {
                    gasto = 490;
                } else {
                    gasto = 420;
                }
            }
        }
        this.costoTotalEmbarque = 1.19 * (monto + gasto);
    }

    @Override
    public String toString() {
        return "\n*********Registro Nº" + getNumero() + "*********"
                + "\nCódigo                         : " + getCodigo()
                + "\nDistribuidor                   : " + getNombreDistribuidor()
                + "\nTipo Camión                    : " + getTipoCamion()
                + "\nTipo Ladrillos                 : " + getTipoLadrillos()
                + "\nCantidad Ladrilos              : " + getCantidadLadrillos()
                + "\nPrecio por Unidad              : " + getPrecioUnidad()
                + "\nCosto Total Embarque           : " + getCostoTotalEmbarque();
    }

}
