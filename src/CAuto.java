/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w3203
 */
public class CAuto {
    //Atributos
    private String numSerie;
    private String marca;
    private float precio;
    //Constructores
    public CAuto(){
        numSerie = "";
        marca = "";
        precio = 0.0f;
    }
    public CAuto(String numSerie, String marca, float precio){
        this.numSerie = numSerie;
        this.marca = marca;
        this.precio = precio;
    }
    //
    public void incrementoPrecio(float incremento){
        this.precio = this.precio+incremento;
    }
    public String verDatos(){
        return ("Serie: "+numSerie+" Marca: "+marca+" Precio: "+precio);
    }
    public String accesarNumSerie(){
        return numSerie;
    }   
}
