package ejercicio.pkg9.pkg13.futbolista;


import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roberto.fersan
 */
public class compara_nombres implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista) o1).nombre.compareTo(((Futbolista) o2).nombre);

    }
    
}
