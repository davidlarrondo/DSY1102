
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC6
 */
public class Sucursal {
    
    private String idSucursal,nombre;
    private ArrayList<Vehiculo> vehiculosDisponibles;

    public Sucursal(String idSucursal, String nombre) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.vehiculosDisponibles=new ArrayList<>();
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    public void setVehiculosDisponibles(ArrayList<Vehiculo> vehiculosDisponibles) {
        this.vehiculosDisponibles = vehiculosDisponibles;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculosDisponibles.add(vehiculo);
    }
    
    public void listar(){
        System.out.println("LISTA VEHÍCULOS");
        System.out.println("---------------");
        for (Vehiculo i : vehiculosDisponibles) {
            System.out.println(i.toString()+i.calcularCostoAlquiler());  
        }
    }
    
    public double calcularCostoTotalAlquilar(){
        double costoTotal=0;
        for (Vehiculo i : vehiculosDisponibles) {
            costoTotal+=i.calcularCostoAlquiler(); 
        }
        return costoTotal;         
    }
    
    
    
}
