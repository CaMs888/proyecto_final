package co.edu.poli.alimentosEspacial.servicios;

import co.edu.poli.alimentosEspacial.modelo.Producto;

/**
 * Interfaz que define las operaciones CRUD (Create, Read, Update, Delete) para productos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public interface OperacionCRUD {
    
    /**
     * Crea un nuevo producto en el sistema.
     * 
     * @param objeto El producto a crear
     * @return Mensaje indicando el resultado de la operación
     */
    String create(Producto objeto);
    
    /**
     * Lee todos los productos del sistema.
     * 
     * @return Arreglo con todos los productos
     */
    Producto[] read();
    
    /**
     * Busca un producto por su identificador.
     * 
     * @param id Identificador del producto a buscar
     * @return El producto encontrado o null si no existe
     */
    Producto readId(String id);
    
    /**
     * Actualiza un producto existente.
     * 
     * @param id Identificador del producto a actualizar
     * @param objeto El nuevo objeto producto con los datos actualizados
     * @return Mensaje indicando el resultado de la operación
     */
    String update(String id, Producto objeto);
    
    /**
     * Elimina un producto del sistema.
     * 
     * @param id Identificador del producto a eliminar
     * @return El producto eliminado o null si no se encontró
     */
    Producto delete(String id);
}