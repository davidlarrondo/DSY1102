/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Curso {
    
    private int nivel;
    private String paralelo;
    private Alumno alumno,alumno2,alumno3;

    public Curso() {
    }

    public Curso(int nivel, String paralelo, Alumno alumno, Alumno alumno2, Alumno alumno3) {
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.alumno = alumno;
        this.alumno2 = alumno2;
        this.alumno3 = alumno3;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno2() {
        return alumno2;
    }

    public void setAlumno2(Alumno alumno2) {
        this.alumno2 = alumno2;
    }

    public Alumno getAlumno3() {
        return alumno3;
    }

    public void setAlumno3(Alumno alumno3) {
        this.alumno3 = alumno3;
    }

    @Override
    public String toString() {
        return "Curso{" + "nivel=" + nivel + ", paralelo=" + paralelo + ", alumno=" + alumno + ", alumno2=" + alumno2 + ", alumno3=" + alumno3 + '}';
    }

    
    
    
    
    
    
    
}
