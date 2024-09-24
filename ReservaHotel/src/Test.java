/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Test {
    
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion("A1", 300_000.99, true);
        Habitacion habitacion2 = new Habitacion("A2", 400_000.99, true);
        
        Hotel hotel = new Hotel("ABC1", "RADISSON");
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.listarHabitacion();
        
        Reserva reserva1 = new Reserva(hotel, habitacion1);
        Reserva reserva2 = new Reserva(hotel, habitacion2);
        
        Cliente cliente1 = new Cliente("123", "HERNI");
        Cliente cliente2 = new Cliente("345", "LUCHO"); 
        
        cliente1.agregar(reserva1);
        cliente1.agregar(reserva2);
        cliente1.listar();
        
    }
    
}
