package co.edu.poli.alimentosEspacial.servicios;

import co.edu.poli.alimentosEspacial.modelo.Producto;

/**
 * Interfaz que define las operaciones de persistencia en archivos para productos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public interface OperacionArchivo {
    
    /**
     * Serializa un arreglo de productos a un archivo.
     * 
     * @param productos Arreglo de productos a serializar
     * @param path Ruta del directorio donde guardar el archivo
     * @param name Nombre del archivo
     * @return Mensaje indicando el resultado de la operación
     */
    String serializar(Producto[] productos, String path, String name);
    
    /**
     * Deserializa un arreglo de productos desde un archivo.
     * 
     * @param path Ruta del directorio del archivo
     * @param name Nombre del archivo
     * @return Arreglo de productos deserializados
     */
    Producto[] deserializar(String path, String name);
}