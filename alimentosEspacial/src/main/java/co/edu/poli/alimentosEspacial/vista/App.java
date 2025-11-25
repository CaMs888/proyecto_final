package co.edu.poli.alimentosEspacial.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal que inicia la aplicación JavaFX del Sistema de Gestión de Productos Espaciales.
 * Esta clase extiende de Application y configura la ventana principal de la interfaz gráfica.
 * 
 * @author Sarah Chaves
 * @author Juan Medellin
 * @version 1.0
 */
public class App extends Application {

    /**
     * Método principal que inicia la aplicación JavaFX.
     * 
     * @param stage El escenario principal de la aplicación
     * @throws Exception Si ocurre algún error al cargar la interfaz
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ProductoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 750);
        stage.setTitle("Sistema de Gestión de Productos Espaciales.");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método main que lanza la aplicación JavaFX.
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        launch(args);
    }
}