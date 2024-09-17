/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Audifono extends Producto{
    
    private String color;
    

    public Audifono(String nombre, String descripcion, double precio, int cantInventario, String color) {
        super(nombre, descripcion, precio, cantInventario);
        this.color = color;
        
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ ", color=" + color;
    }

    
    
}
