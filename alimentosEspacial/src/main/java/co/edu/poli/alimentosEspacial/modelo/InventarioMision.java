package co.edu.poli.alimentosEspacial.modelo;

import java.io.Serializable;

/**
 * Clase que representa el inventario de una misión espacial.
 * Gestiona los productos asociados a una misión específica.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class InventarioMision implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String fechaRegistro;
    
    /**
     * Constructor para crear un objeto InventarioMision.
     * 
     * @param fechaRegistro Fecha de registro del inventario
     */
    public InventarioMision(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    /**
     * Agrega un producto al inventario de la misión.
     * 
     * @return Mensaje de confirmación de producto agregado
     */
    public String agregarProducto() {
        return "Producto agregado al inventario";
    }
    
    /**
     * Elimina un producto del inventario de la misión.
     * 
     * @return Mensaje de confirmación de producto eliminado
     */
    public String eliminarProducto() {
        return "Producto eliminado del inventario";
    }
    
    /**
     * Genera un reporte del inventario actual.
     * 
     * @return Mensaje de confirmación de reporte generado
     */
    public String generarReporte() {
        return "Reporte generado del inventario";
    }
    
    /**
     * @return La fecha de registro del inventario
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    
    /**
     * @param fechaRegistro La nueva fecha de registro a establecer
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}