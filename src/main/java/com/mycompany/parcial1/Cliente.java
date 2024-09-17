package com.mycompany.parcial1;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
    private ArrayList<Pedido> pedidos;
    private String nombre; 
    private String direccion;

    public Cliente(String nombre, String direccion) {
        pedidos = new ArrayList<>();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
