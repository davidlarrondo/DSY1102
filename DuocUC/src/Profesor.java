/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class Profesor extends Persona{
    
    private String profesion;

    public Profesor(String profesion, String nombre, int edad, float estatura) {
        super(nombre, edad, estatura);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
     @Override
    public String toString() {
        return "Persona"+super.toString()+" Profesor{" + "profesion=" + profesion + '}';
    } 
    
    
    
}
