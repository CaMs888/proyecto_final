package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa un astronauta en el sistema de gestión espacial.
 * Contiene información personal y profesional del astronauta.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class Astronauta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String idAstronauta;
    private String nombre;
    private String especialidad;
    private String rango;
    private boolean esEMision;
    
    /**
     * Constructor para crear un objeto Astronauta.
     * 
     * @param idAstronauta Identificador único del astronauta
     * @param nombre Nombre completo del astronauta
     * @param especialidad Especialidad del astronauta
     * @param rango Rango del astronauta en la misión
     * @param esEMision Indica si el astronauta está actualmente en misión
     */
    public Astronauta(String idAstronauta, String nombre, String especialidad, String rango, boolean esEMision) {
        this.idAstronauta = idAstronauta;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.rango = rango;
        this.esEMision = esEMision;
    }
    
    /**
     * @return El identificador del astronauta
     */
    public String getIdAstronauta() {
        return idAstronauta;
    }
    
    /**
     * @param idAstronauta El nuevo identificador del astronauta
     */
    public void setIdAstronauta(String idAstronauta) {
        this.idAstronauta = idAstronauta;
    }
    
    /**
     * @return El nombre del astronauta
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre El nuevo nombre del astronauta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return La especialidad del astronauta
     */
    public String getEspecialidad() {
        return especialidad;
    }
    
    /**
     * @param especialidad La nueva especialidad del astronauta
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    /**
     * @return El rango del astronauta
     */
    public String getRango() {
        return rango;
    }
    
    /**
     * @param rango El nuevo rango del astronauta
     */
    public void setRango(String rango) {
        this.rango = rango;
    }
    
    /**
     * @return true si el astronauta está en misión, false en caso contrario
     */
    public boolean isEsEMision() {
        return esEMision;
    }
    
    /**
     * @param esEMision El nuevo estado de misión del astronauta
     */
    public void setEsEMision(boolean esEMision) {
        this.esEMision = esEMision;
    }
}