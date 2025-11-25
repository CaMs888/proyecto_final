package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa un equipo de comunicación en el sistema espacial.
 * Extiende de Producto y contiene especificaciones técnicas de comunicación.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class EquipoComunicacion extends Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String tipoComunicacion;
    private double rangoFrecuencia;
    private int potencia;
    
    /**
     * Constructor para crear un objeto EquipoComunicacion.
     * 
     * @param id Identificador único del equipo
     * @param nombre Nombre del equipo de comunicación
     * @param peso Peso del equipo en kilogramos
     * @param volumen Volumen del equipo en metros cúbicos
     * @param tipoComunicacion Tipo de comunicación (ej: radio, satelital, etc.)
     * @param rangoFrecuencia Rango de frecuencia en MHz
     * @param potencia Potencia del equipo en vatios
     */
    public EquipoComunicacion(String id, String nombre, double peso, double volumen, 
                             String tipoComunicacion, double rangoFrecuencia, int potencia) {
        super(id, nombre, peso, volumen);
        this.tipoComunicacion = tipoComunicacion;
        this.rangoFrecuencia = rangoFrecuencia;
        this.potencia = potencia;
    }
    
    /**
     * @return El tipo de comunicación del equipo
     */
    public String getTipoComunicacion() {
        return tipoComunicacion;
    }
    
    /**
     * @param tipoComunicacion El nuevo tipo de comunicación a establecer
     */
    public void setTipoComunicacion(String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }
    
    /**
     * @return El rango de frecuencia del equipo en MHz
     */
    public double getRangoFrecuencia() {
        return rangoFrecuencia;
    }
    
    /**
     * @param rangoFrecuencia El nuevo rango de frecuencia a establecer
     */
    public void setRangoFrecuencia(double rangoFrecuencia) {
        this.rangoFrecuencia = rangoFrecuencia;
    }
    
    /**
     * @return La potencia del equipo en vatios
     */
    public int getPotencia() {
        return potencia;
    }
    
    /**
     * @param potencia La nueva potencia a establecer
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}