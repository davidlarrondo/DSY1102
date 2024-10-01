/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class AlumnoOnline extends Alumno{
    
    private String userName;

    public AlumnoOnline(String userName, String carrera, String nombre, int edad, float estatura) {
        super(carrera, nombre, edad, estatura);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Alumno "+super.toString()+" AlumnoOnline{" + "userName=" + userName + '}';
    }
    
    
    
}
