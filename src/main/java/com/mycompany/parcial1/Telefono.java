/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Telefono extends Producto{
    
    private String marca;
    private int capacidadAlmacenamiento;

    public Telefono(String nombre, String descripcion, double precio, int cantInventario, String marca, int capacidadAlmacenamiento) {
        super(nombre, descripcion, precio, cantInventario);
        this.marca = marca;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    @Override
    public String toString() {
        return super.toString()+ ", marca=" + marca + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento;
    }
    
    
    
    
}
