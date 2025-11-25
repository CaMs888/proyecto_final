package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa una herramienta en el sistema de gestión espacial.
 * Extiende de Producto y contiene información específica de herramientas.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class Herramienta extends Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String funcion;
    private String material;
    private boolean requiereEnergia;
    
    /**
     * Constructor para crear un objeto Herramienta.
     * 
     * @param id Identificador único de la herramienta
     * @param nombre Nombre de la herramienta
     * @param peso Peso de la herramienta en kilogramos
     * @param volumen Volumen de la herramienta en metros cúbicos
     * @param funcion Función principal de la herramienta
     * @param material Material de construcción de la herramienta
     * @param requiereEnergia Indica si la herramienta requiere energía para funcionar
     */
    public Herramienta(String id, String nombre, double peso, double volumen, 
                     String funcion, String material, boolean requiereEnergia) {
        super(id, nombre, peso, volumen);
        this.funcion = funcion;
        this.material = material;
        this.requiereEnergia = requiereEnergia;
    }
    
    /**
     * @return La función de la herramienta
     */
    public String getFuncion() {
        return funcion;
    }
    
    /**
     * @param funcion La nueva función a establecer
     */
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    /**
     * @return El material de la herramienta
     */
    public String getMaterial() {
        return material;
    }
    
    /**
     * @param material El nuevo material a establecer
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * @return true si la herramienta requiere energía, false en caso contrario
     */
    public boolean isRequiereEnergia() {
        return requiereEnergia;
    }
    
    /**
     * @param requiereEnergia El nuevo estado de requerimiento de energía
     */
    public void setRequiereEnergia(boolean requiereEnergia) {
        this.requiereEnergia = requiereEnergia;
    }
}