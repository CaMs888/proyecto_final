package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa una misión espacial en el sistema.
 * Contiene información sobre la planificación y ejecución de misiones.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class Mision implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String codigoMision;
    private String nombre;
    private String fechalnicio;
    private String fechaFin;
    private String destino;
    private String estado;
    
    /**
     * Constructor para crear un objeto Mision.
     * 
     * @param codigoMision Código único identificador de la misión
     * @param nombre Nombre de la misión
     * @param fechalnicio Fecha de inicio de la misión
     * @param fechaFin Fecha de finalización de la misión
     * @param destino Destino de la misión
     * @param estado Estado actual de la misión
     */
    public Mision(String codigoMision, String nombre, String fechalnicio, String fechaFin, String destino, String estado) {
        this.codigoMision = codigoMision;
        this.nombre = nombre;
        this.fechalnicio = fechalnicio;
        this.fechaFin = fechaFin;
        this.destino = destino;
        this.estado = estado;
    }
    
    /**
     * Cambia el estado de la misión según el flujo establecido.
     * 
     * @return El nuevo estado de la misión
     */
    public String cambiarEstado() {
        if ("Planificada".equals(estado)) {
            estado = "En Progreso";
        } else if ("En Progreso".equals(estado)) {
            estado = "Completada";
        }
        return estado;
    }
    
    /**
     * Calcula la duración de la misión.
     * 
     * @return Mensaje indicando que la duración fue calculada
     */
    public String calcularDuracion() {
        return "Duración calculada";
    }
    
    /**
     * @return El código de la misión
     */
    public String getCodigoMision() {
        return codigoMision;
    }
    
    /**
     * @param codigoMision El nuevo código de misión a establecer
     */
    public void setCodigoMision(String codigoMision) {
        this.codigoMision = codigoMision;
    }
    
    /**
     * @return El nombre de la misión
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre El nuevo nombre de la misión
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return La fecha de inicio de la misión
     */
    public String getFechalnicio() {
        return fechalnicio;
    }
    
    /**
     * @param fechalnicio La nueva fecha de inicio a establecer
     */
    public void setFechalnicio(String fechalnicio) {
        this.fechalnicio = fechalnicio;
    }
    
    /**
     * @return La fecha de fin de la misión
     */
    public String getFechaFin() {
        return fechaFin;
    }
    
    /**
     * @param fechaFin La nueva fecha de fin a establecer
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    /**
     * @return El destino de la misión
     */
    public String getDestino() {
        return destino;
    }
    
    /**
     * @param destino El nuevo destino de la misión
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    /**
     * @return El estado actual de la misión
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * @param estado El nuevo estado de la misión
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}