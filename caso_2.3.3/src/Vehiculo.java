/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC6
 */
public class Vehiculo implements CostoAlquilerCalculable{
    
    protected String idVehiculo,modelo;
    protected double costoBaseAlquiler;

    public Vehiculo(String idVehiculo, String modelo) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.costoBaseAlquiler = 400_000;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCostoBaseAlquiler() {
        return costoBaseAlquiler;
    }

    public void setCostoBaseAlquiler(double costoBaseAlquiler) {
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", modelo=" + modelo + ", costoBaseAlquiler=" ;
    }
    

    @Override
    public double calcularCostoAlquiler() {
        double costoAlquiler=0;
        return costoAlquiler;
    }
    
    
    
}
