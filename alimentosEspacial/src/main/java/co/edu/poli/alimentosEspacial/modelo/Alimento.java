package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa un alimento en el sistema de gestión espacial.
 * Extiende de Producto y almacena información específica de alimentos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class Alimento extends Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String fechaCaducidad;
    private String tipoAlimento;
    private int caloriasPorRacion;
    
    /**
     * Constructor para crear un objeto Alimento.
     * 
     * @param id Identificador único del alimento
     * @param nombre Nombre del alimento
     * @param peso Peso del alimento en kilogramos
     * @param volumen Volumen del alimento en metros cúbicos
     * @param fechaCaducidad Fecha de caducidad del alimento
     * @param tipoAlimento Tipo de alimento (ej: liofilizado, enlatado, etc.)
     * @param caloriasPorRacion Calorías por ración del alimento
     */
    public Alimento(String id, String nombre, double peso, double volumen, 
                   String fechaCaducidad, String tipoAlimento, int caloriasPorRacion) {
        super(id, nombre, peso, volumen);
        this.fechaCaducidad = fechaCaducidad;
        this.tipoAlimento = tipoAlimento;
        this.caloriasPorRacion = caloriasPorRacion;
    }
    
    /**
     * @return La fecha de caducidad del alimento
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    
    /**
     * @param fechaCaducidad La nueva fecha de caducidad a establecer
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    /**
     * @return El tipo de alimento
     */
    public String getTipoAlimento() {
        return tipoAlimento;
    }
    
    /**
     * @param tipoAlimento El nuevo tipo de alimento a establecer
     */
    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    /**
     * @return Las calorías por ración del alimento
     */
    public int getCaloriasPorRacion() {
        return caloriasPorRacion;
    }
    
    /**
     * @param caloriasPorRacion Las nuevas calorías por ración a establecer
     */
    public void setCaloriasPorRacion(int caloriasPorRacion) {
        this.caloriasPorRacion = caloriasPorRacion;
    }
}