/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaclasiscos;

/**
 *
 * @author USUARIO
 */
public class Estudiante {
    String nombre;
    int semestre;
    int calificacion;

    public Estudiante(String nombre, int semestre, int calificacion) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "\nEstudiante: "+"  nombre: "+nombre+"  semestre: "+ semestre+" calificacion: "+ calificacion;
    }   
}
