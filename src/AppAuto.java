/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w3203
 */
import java.util.LinkedList;


public class AppAuto {
    public static void main(String[] args){
        //Crear un objeto
        CAuto ferrari = new CAuto("P-1212","Toyota",45078.0f);
        CAuto tico = new CAuto("P-1111","For",5078.0f);
        CAuto vocho = new CAuto("P-4142","Datsum",78078.0f);
        
       //Almacenar en una lista los autos creados
       // Crear una lista
       LinkedList<CAuto> listaAutos = new LinkedList<CAuto>();
       //Añadir elementos a la lista
       listaAutos.add(ferrari);
       listaAutos.add(tico);
       listaAutos.add(vocho);
       //Mostrar informacion de la lista
       System.out.println("Numero de elementos: "+listaAutos.size());
       //Mostrar los elementos de la lista
       for (int i=0;i<listaAutos.size();i++){
           CAuto oTemp = listaAutos.get(i);
           System.out.println("Auto nro "+(i+1)+": "+oTemp.verDatos());
       }
    }
}
