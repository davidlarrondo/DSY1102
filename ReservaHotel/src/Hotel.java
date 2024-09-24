
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Hotel {
    
    private String idHotel,nombre;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        //
    }

    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        habitacionesDisponibles = new ArrayList<Habitacion>();
    }
    
    //agregar
    public boolean agregarHabitacion(Habitacion habitacion){
        return habitacionesDisponibles.add(habitacion);
    }
    
    //listar
    public void listarHabitacion(){
        for (Habitacion i : habitacionesDisponibles) {
            System.out.println(i.toString());
        }
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombre=" + nombre + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }
    
    
}
