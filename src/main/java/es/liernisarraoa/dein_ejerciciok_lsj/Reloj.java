package es.liernisarraoa.dein_ejerciciok_lsj;

import es.liernisarraoa.dein_ejerciciok_lsj.Controlador.RelojControlador;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;



/**
 * Clase principal de la aplicación del reloj.
 *
 * @author Lierni
 * @version 1.0
 */
public class Reloj extends Application {
    /**
     * Metodo que inicia la aplicación JavaFX.
     * Carga el archivo FXML, configura la escena y muestra la ventana principal.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Reloj.class.getResource("reloj.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        RelojControlador controlador = fxmlLoader.getController();
        controlador.iniciarReloj();
        stage.setTitle("Reloj");
        stage.getIcons().add(new Image(String.valueOf(Reloj.class.getResource("Imagenes/reloj.png"))));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        //Para que cuando se cierre se cierre tambien la ejecucion
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                controlador.stop();
            }
        });
    }

    /**
     * Metodo principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        launch();
    }
}