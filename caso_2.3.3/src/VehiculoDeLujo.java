/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC6
 */
public class VehiculoDeLujo extends Vehiculo{
    
    public VehiculoDeLujo(String idVehiculo, String modelo) {
        super(idVehiculo, modelo);
    }
    
    @Override
    public double calcularCostoAlquiler() {
        double costoTotal=0;
        costoTotal =getCostoBaseAlquiler()+400_000;
        return costoTotal;      
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    
    
    
}
