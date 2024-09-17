/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Laptop extends Producto{
    
    private String modelo;
    private String tipoProcesador;

    public Laptop(String nombre, String descripcion, double precio, int cantInventario,String modelo,String tipoProcesador) {
        super(nombre, descripcion, precio, cantInventario);
        this.modelo = modelo;
        this.tipoProcesador = tipoProcesador;
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    @Override
    public String toString() {
        return super.toString()+ ", modelo=" + modelo + ", tipoProcesador=" + tipoProcesador;
    }
    
    
}
