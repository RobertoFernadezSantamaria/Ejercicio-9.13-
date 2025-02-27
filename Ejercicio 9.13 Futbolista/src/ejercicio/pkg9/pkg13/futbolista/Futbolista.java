/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg9.pkg13.futbolista;

public class Futbolista implements Comparable{

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

    @Override
    public int compareTo(Object otro) {
       
         return dni.compareTo(((Futbolista) otro).dni); 
    }
    
    @Override
    public boolean equals(Object otro){
        return dni.equals(((Futbolista)otro).dni);
        // otro es el otro objeto que en este caso seria
         // p2 y el .dni es el dni de p2 por eso se pone asi de la clase Futbol el objeto que elijamos y el atributo
    
    }
    
    
    
    
    

}
