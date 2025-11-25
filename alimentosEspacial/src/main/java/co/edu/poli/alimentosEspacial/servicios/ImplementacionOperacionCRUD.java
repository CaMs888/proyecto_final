package co.edu.poli.alimentosEspacial.servicios;

import java.io.*;
import co.edu.poli.alimentosEspacial.modelo.Producto;

/**
 * Implementación concreta de las operaciones CRUD y de archivo para productos.
 * Proporciona funcionalidades para crear, leer, actualizar, eliminar y persistir productos.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {

    private Producto[] productos;
    private int capacidadInicial = 5;

    /**
     * Constructor que inicializa el arreglo de productos con capacidad inicial.
     */
    public ImplementacionOperacionCRUD() {
        productos = new Producto[capacidadInicial];
    }

    /**
     * Crea un nuevo producto en el sistema.
     * 
     * @param objeto El producto a crear
     * @return Mensaje indicando la posición donde fue agregado el producto
     */
    @Override
    public String create(Producto objeto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = objeto;
                return "Producto agregado en posición " + i;
            }
        }
        Producto[] nuevoArreglo = new Producto[productos.length + capacidadInicial];
        System.arraycopy(productos, 0, nuevoArreglo, 0, productos.length);
        nuevoArreglo[productos.length] = objeto;
        productos = nuevoArreglo;
        return "Producto agregado en nueva posición " + productos.length;
    }

    /**
     * Lee todos los productos del sistema.
     * 
     * @return Arreglo con todos los productos
     */
    @Override
    public Producto[] read() {
        return productos;
    }

    /**
     * Busca un producto por su identificador.
     * 
     * @param id Identificador del producto a buscar
     * @return El producto encontrado o null si no existe
     */
    @Override
    public Producto readId(String id) {
        for (Producto p : productos) {
            if (p != null && p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Actualiza un producto existente.
     * 
     * @param id Identificador del producto a actualizar
     * @param objeto El nuevo objeto producto con los datos actualizados
     * @return Mensaje indicando el resultado de la operación
     */
    @Override
    public String update(String id, Producto objeto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getId().equals(id)) {
                productos[i] = objeto;
                return "Producto actualizado en posición " + i;
            }
        }
        return "Producto con ID " + id + " no encontrado.";
    }

    /**
     * Elimina un producto del sistema.
     * 
     * @param id Identificador del producto a eliminar
     * @return El producto eliminado o null si no se encontró
     */
    @Override
    public Producto delete(String id) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getId().equals(id)) {
                Producto eliminado = productos[i];
                productos[i] = null;
                return eliminado;
            }
        }
        return null;
    }

    /**
     * Establece un nuevo arreglo de productos.
     * 
     * @param nuevosProductos El nuevo arreglo de productos
     */
    public void setProductos(Producto[] nuevosProductos) {
        this.productos = nuevosProductos;
    }

    /**
     * Serializa el arreglo de productos a un archivo.
     * 
     * @param productos Arreglo de productos a serializar
     * @param path Ruta del directorio donde guardar el archivo
     * @param name Nombre del archivo
     * @return Mensaje indicando el resultado de la operación
     */
    @Override
    public String serializar(Producto[] productos, String path, String name) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + File.separator + name))) {
            oos.writeObject(productos);
            return ">> Archivo '" + name + "' guardado exitosamente en '" + path + "'";
        } catch (IOException e) {
            return "Error al guardar el archivo: " + e.getMessage();
        }
    }

    /**
     * Deserializa un arreglo de productos desde un archivo.
     * 
     * @param path Ruta del directorio del archivo
     * @param name Nombre del archivo
     * @return Arreglo de productos deserializados o arreglo vacío si no existe el archivo
     */
    @Override
    public Producto[] deserializar(String path, String name) {
        File archivo = new File(path + File.separator + name);
        if (!archivo.exists()) {
            System.out.println(">> El archivo no existe. Se comenzará con una lista vacía.");
            return new Producto[10];
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Producto[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
            return null;
        }
    }
}