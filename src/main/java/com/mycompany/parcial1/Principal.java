package com.mycompany.parcial1;

import java.util.ArrayList;

public class Principal {

    static ArrayList<Producto> inventario;
    
    public static void main(String[] args) {
        // TODO: Aquí ingresas tu código para iniciar la aplicación.
        
        inventario = new ArrayList<>();
        
        Telefono tf1 = new Telefono("OPPO 16", "Smartphone",1200000,2,"Lenovo",500);
        Telefono tf2 = new Telefono("A22", "Smartphone", 850000,3,"Kalley",164);
        Laptop lp1 = new Laptop("MSI pc", "Portatil Gamer", 6500000, 5, "MF605", "Ryzen");
        Laptop lp2 = new Laptop("ASUS pc", "Portatil Casero", 2500000, 3, "AS51", "Intel");
        Audifono ad1 = new Audifono("Auricaular inalambrico","Bluetooth",100000,7,"rojo");
        Audifono ad2 = new Audifono("Auricaular de cable","Alambrico",130000,12,"azul");
        
        agregarProducto(tf1);
        agregarProducto(tf2);
        agregarProducto(lp1);
        agregarProducto(lp2);
        agregarProducto(ad1);
        agregarProducto(ad2);
        
        System.out.println("El inventario dispnible en la tienda The Punisher Store es:");
        imprimirInventario();
        System.out.println("---------------------------------------------------");
        
        Cliente cliente1 = new Cliente("Laura Gil","cll80a#76-50");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(tf1, 2);
        pedido1.agregarProducto(ad2, 10);
        pedido1.agregarProducto(ad1, 5);
        pedido1.agregarProducto(lp1, 5);
        System.out.println("Este es el resumen de su pedido:");
        pedido1.mostrarResumenPedido();
        System.out.println("---------------------------------------------------");
        
        
    }
    
    public static boolean agregarProducto(Producto producto){
        
        if(producto != null){
            inventario.add(producto);
            return true;
        }else{
            return false;
        }
        
    }
    
    public static void imprimirInventario(){
        for (Producto producto : inventario) {
            System.out.println(producto.toString());
        }
    }
    
}
