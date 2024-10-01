/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class Test {
    
    public static void main(String[] args) {
        
        AlumnoOnline alumnoOnline1 = new AlumnoOnline("fenix23", "Ballet", "Felix", 25, 1.7f);
        System.out.println(alumnoOnline1.toString());
        
        Alumno alumno1 = new Alumno("TEATRO", "PEPE", 20, 1.6f);
        System.out.println(alumno1.toString());
        
        Profesor profesor1 = new Profesor("ingeniero", "PH", 22, 1.9f);
        System.out.println(profesor1.toString());
        
    }
            
    
}
