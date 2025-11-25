package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase base que representa un producto genérico en el sistema espacial.
 * Esta clase es abstracta y sirve como base para todos los tipos de productos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nombre;
    private double peso;
    private double volumen;

    /**
     * Constructor para crear un objeto Producto.
     * 
     * @param id Identificador único del producto
     * @param nombre Nombre del producto
     * @param peso Peso del producto en kilogramos
     * @param volumen Volumen del producto en metros cúbicos
     */
    public Producto(String id, String nombre, double peso, double volumen) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.volumen = volumen;
    }

    /**
     * @return El identificador del producto
     */
    public String getId() {
        return id;
    }

    /**
     * @param id El nuevo identificador del producto
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El peso del producto en kilogramos
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso El nuevo peso del producto
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return El volumen del producto en metros cúbicos
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * @param volumen El nuevo volumen del producto
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}