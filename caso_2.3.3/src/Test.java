/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC6
 */
public class Test {
    
    public static void main(String[] args) {
        
        VehiculoEstandar vehiculoEstandar1 = new VehiculoEstandar("123", "ÑUÑUKI");
        VehiculoEstandar vehiculoEstandar2 = new VehiculoEstandar("345", "V16");
        
        VehiculoDeLujo vehiculoDeLujo1 = new VehiculoDeLujo("222", "FERRARI");
        VehiculoDeLujo vehiculoDeLujo2 = new VehiculoDeLujo("333", "PHANTOM");
        
        Sucursal sucursal1 = new Sucursal("567", "SUZUVAL");
        
        sucursal1.agregarVehiculo(vehiculoDeLujo1);
        sucursal1.agregarVehiculo(vehiculoDeLujo2);
        sucursal1.agregarVehiculo(vehiculoEstandar1);
        sucursal1.agregarVehiculo(vehiculoEstandar2);
        sucursal1.listar();
        System.out.println("COSTO TOTAL DE LA SUCURSAL $"+sucursal1.calcularCostoTotalAlquilar());
    }
    
}
