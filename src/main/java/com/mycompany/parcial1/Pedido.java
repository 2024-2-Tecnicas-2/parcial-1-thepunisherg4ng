/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Pedido {
    
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;

    public Pedido(Cliente cliente) {
        productos = new ArrayList<>();
        cantidades = new ArrayList<>();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }
    
    public boolean agregarProducto(Producto producto, int cantidadCompra){
        
        
        if(producto != null && producto.getCantInventario() >= cantidadCompra){
            productos.add(producto);
            cantidades.add(cantidadCompra);
            producto.setCantInventario(producto.getCantInventario()-cantidadCompra);
            return true;
        }else if(producto != null && producto.getCantInventario() < cantidadCompra){
            return false;
        }else{
            return false;
        }
    }
    
    public void mostrarResumenPedido(){
        double totalPedido = 0;
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString() + "\n Cantidad comprada: "+cantidades.get(i));
            totalPedido += (cantidades.get(i)*productos.get(i).getPrecio());
        }
        
        System.out.println("El total a pagar por el pedido es de $"+totalPedido);
        
    }
    
    
}
