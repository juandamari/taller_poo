import java.util.Scanner;

public class vehiculos {
    private String placa;
    private String marca;
    private int modelo;
    private double kmRecorridos;
    private double litrosConsumidos;
    private double precioLitro;
    private boolean activo;

    public vehiculos (){
    }

    public vehiculos(String placa, String marca, int modelo, double kmRecorridos, double litrosConsumidos, double precioLitro, boolean activo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
        this.litrosConsumidos = litrosConsumidos;
        this.precioLitro = precioLitro;
        this.activo = activo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public double getLitrosConsumidos() {
        return litrosConsumidos;
    }

    public double getPrecioLitro() {
        return precioLitro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void setLitrosConsumidos(double litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    public void setPrecioLitro(double precioLitro) {
        this.precioLitro = precioLitro;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "vehiculos{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", kmRecorridos=" + kmRecorridos +
                ", litrosConsumidos=" + litrosConsumidos +
                ", precioLitro=" + precioLitro +
                ", activo=" + activo +
                '}';
    }
    public double rendimiento () {
        double consumoPromedio = kmRecorridos / litrosConsumidos;
        if ( consumoPromedio > 0) {
            return consumoPromedio;
        } else {
            System.out.println("el valor debe ser mayor a 0");
            return 0.0;
        }
    }
    public String clasificarRendimiento() {
        if (rendimiento() <8){
            return "Consumo alto";
        } else if (rendimiento() < 12){
            return "Consumo moderado";
        } else if (rendimiento() <16){
            return "Consumo eficiente";
        }
        return "";
    }
    public double calcularCostoCombustible() {
        double costo = litrosConsumidos * precioLitro;
        return costo;
    }
    public double costoPorKilometro() {
        double costokm = calcularCostoCombustible() / kmRecorridos;
        return costokm;
    }
}


