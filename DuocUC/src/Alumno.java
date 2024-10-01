/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class Alumno extends Persona{
    
    protected String carrera;

    public Alumno(String carrera, String nombre, int edad, float estatura) {
        super(nombre, edad, estatura);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Persona"+super.toString()+" Alumno{" + "carrera=" + carrera + '}';
    } 
    
   

   
    
    
    
    
    
    
    
}
