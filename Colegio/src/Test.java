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
        
        Alumno alumno1 = new Alumno("ALAN BRITO", 10, 1f);
        Alumno alumno2 = new Alumno("ELSA HUESO", 15, 1.2f);
        Alumno alumno3 = new Alumno("ARMANDO CASAS", 12, 1.1f);
        
        
        Curso curso1 = new Curso(5, "b", alumno1, alumno2, alumno3);
        System.out.println(curso1.toString());
    }
    
}
