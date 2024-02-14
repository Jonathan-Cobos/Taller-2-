/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesenerocidad;

/**
 *
 * @author Acer
 */
public class Estudiante implements CompararEstudiante<Estudiante>{
    private int semestres,crditos;
    private String nombre;

    public Estudiante(int semestres, int crditos, String nombre) {
        this.semestres = semestres;
        this.crditos = crditos;
        this.nombre = nombre;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public int getCrditos() {
        return crditos;
    }

    public void setCrditos(int crditos) {
        this.crditos = crditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    


    @Override
    public void compareTo(Estudiante a) {
        if(this.semestres>a.semestres||this.crditos>a.crditos){
             System.out.println("El estudiante " + this.nombre + " es mayor al estuante " + a.getNombre());
                 }
                if(this.semestres<a.semestres||this.crditos<a.crditos){
             System.out.println("El estudiante " + this.nombre + " es menor al estuante " + a.getNombre());
                 }
              if(this.semestres==a.semestres&&this.crditos==a.crditos){
             System.out.println("El estudiante " + this.nombre + " y el estudiante  " + a.getNombre()+" Tienen la misma edad ");
                 }
    }
    
    
}
