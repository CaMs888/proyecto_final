package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa un equipo médico en el sistema de gestión espacial.
 * Extiende de Producto y contiene información específica de equipos médicos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class EquipoMedico extends Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String usoEspecifico;
    private boolean esEsterilizado;
    private String fechaEsterilizacion;
    private String udt;
    
    /**
     * Constructor para crear un objeto EquipoMedico.
     * 
     * @param id Identificador único del equipo médico
     * @param nombre Nombre del equipo médico
     * @param peso Peso del equipo en kilogramos
     * @param volumen Volumen del equipo en metros cúbicos
     * @param usoEspecifico Uso específico del equipo médico
     * @param esEsterilizado Indica si el equipo está esterilizado
     * @param fechaEsterilizacion Fecha de esterilización del equipo
     * @param udt Unidad de tiempo de duración del equipo
     */
    public EquipoMedico(String id, String nombre, double peso, double volumen, 
                       String usoEspecifico, boolean esEsterilizado, String fechaEsterilizacion, String udt) {
        super(id, nombre, peso, volumen);
        this.usoEspecifico = usoEspecifico;
        this.esEsterilizado = esEsterilizado;
        this.fechaEsterilizacion = fechaEsterilizacion;
        this.udt = udt;
    }
    
    /**
     * @return El uso específico del equipo médico
     */
    public String getUsoEspecifico() {
        return usoEspecifico;
    }
    
    /**
     * @param usoEspecifico El nuevo uso específico a establecer
     */
    public void setUsoEspecifico(String usoEspecifico) {
        this.usoEspecifico = usoEspecifico;
    }
    
    /**
     * @return true si el equipo está esterilizado, false en caso contrario
     */
    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }
    
    /**
     * @param esEsterilizado El nuevo estado de esterilización a establecer
     */
    public void setEsEsterilizado(boolean esEsterilizado) {
        this.esEsterilizado = esEsterilizado;
    }
    
    /**
     * @return La fecha de esterilización del equipo
     */
    public String getFechaEsterilizacion() {
        return fechaEsterilizacion;
    }
    
    /**
     * @param fechaEsterilizacion La nueva fecha de esterilización a establecer
     */
    public void setFechaEsterilizacion(String fechaEsterilizacion) {
        this.fechaEsterilizacion = fechaEsterilizacion;
    }
    
    /**
     * @return La unidad de tiempo de duración del equipo
     */
    public String getUdt() {
        return udt;
    }
    
    /**
     * @param udt La nueva unidad de tiempo de duración a establecer
     */
    public void setUdt(String udt) {
        this.udt = udt;
    }
}