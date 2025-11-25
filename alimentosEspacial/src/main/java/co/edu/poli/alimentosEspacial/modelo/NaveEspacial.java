package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa una nave espacial en el sistema.
 * Gestiona la capacidad y carga de productos en la nave.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class NaveEspacial implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String idNave;
    private String modelo;
    private double capacidadPeso;
    private double capacidadVol;
    private double pesoActual;
    private double volumenActual;
    
    /**
     * Constructor para crear un objeto NaveEspacial.
     * 
     * @param idNave Identificador único de la nave
     * @param modelo Modelo de la nave espacial
     * @param capacidadPeso Capacidad máxima de peso en kilogramos
     * @param capacidadVol Capacidad máxima de volumen en metros cúbicos
     */
    public NaveEspacial(String idNave, String modelo, double capacidadPeso, double capacidadVol) {
        this.idNave = idNave;
        this.modelo = modelo;
        this.capacidadPeso = capacidadPeso;
        this.capacidadVol = capacidadVol;
        this.pesoActual = 0;
        this.volumenActual = 0;
    }
    
    /**
     * Verifica si la nave tiene capacidad disponible.
     * 
     * @return 1 si tiene capacidad disponible, 0 si no tiene capacidad
     */
    public int verificarCapacidad() {
        if (pesoActual < capacidadPeso && volumenActual < capacidadVol) {
            return 1;
        }
        return 0;
    }
    
    /**
     * Calcula el porcentaje de espacio disponible en la nave.
     * 
     * @return Porcentaje de espacio disponible (el menor entre peso y volumen)
     */
    public int calcularEspacioDisponible() {
        double espacioPeso = ((capacidadPeso - pesoActual) / capacidadPeso) * 100;
        double espacioVol = ((capacidadVol - volumenActual) / capacidadVol) * 100;
        return (int) Math.min(espacioPeso, espacioVol);
    }
    
    /**
     * Intenta agregar un producto a la nave verificando la capacidad.
     * 
     * @param producto El producto a agregar
     * @return 1 si el producto fue agregado, 0 si no hay capacidad
     */
    public int agregarProducto(Producto producto) {
        if (verificarCapacidad() == 1) {
            return 1; 
        }
        return 0; 
    }
    
    /**
     * @return El identificador de la nave
     */
    public String getIdNave() {
        return idNave;
    }
    
    /**
     * @param idNave El nuevo identificador de la nave
     */
    public void setIdNave(String idNave) {
        this.idNave = idNave;
    }
    
    /**
     * @return El modelo de la nave
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * @param modelo El nuevo modelo de la nave
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * @return La capacidad de peso máxima de la nave
     */
    public double getCapacidadPeso() {
        return capacidadPeso;
    }
    
    /**
     * @param capacidadPeso La nueva capacidad de peso a establecer
     */
    public void setCapacidadPeso(double capacidadPeso) {
        this.capacidadPeso = capacidadPeso;
    }
    
    /**
     * @return La capacidad de volumen máxima de la nave
     */
    public double getCapacidadVol() {
        return capacidadVol;
    }
    
    /**
     * @param capacidadVol La nueva capacidad de volumen a establecer
     */
    public void setCapacidadVol(double capacidadVol) {
        this.capacidadVol = capacidadVol;
    }
    
    /**
     * @return El peso actual cargado en la nave
     */
    public double getPesoActual() {
        return pesoActual;
    }
    
    /**
     * @param pesoActual El nuevo peso actual a establecer
     */
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    /**
     * @return El volumen actual ocupado en la nave
     */
    public double getVolumenActual() {
        return volumenActual;
    }
    
    /**
     * @param volumenActual El nuevo volumen actual a establecer
     */
    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }
}