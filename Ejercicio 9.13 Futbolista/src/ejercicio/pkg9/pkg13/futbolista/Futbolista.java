/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg9.pkg13.futbolista;

public class Futbolista {

    String dni;
    String nombre;
    int edad;
    int numerogoles;

    Futbolista(String dni, String nombre, int edad, int numerogoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numerogoles = numerogoles;

    }
    public String toString(){
        return dni + nombre + edad + "Numero de goles " + numerogoles;
    }
   
    
    
    
    

}
