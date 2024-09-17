package com.mycompany.parcial1;

public class Producto {
    
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantInventario;

    public Producto(String nombre, String descripcion, double precio, int cantInventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantInventario = cantInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantInventario() {
        return cantInventario;
    }

    public void setCantInventario(int cantInventario) {
        this.cantInventario = cantInventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", cantInventario=" + cantInventario + '}';
    }
    
    
    
    
}
