package es.liernisarraoa.dein_ejerciciok_lsj.Controlador;

import es.liernisarraoa.dein_ejerciciok_lsj.Reloj;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Controlador principal de la aplicación del reloj
 * Aqui es donde se actualiza
 *
 * @author Lierni
 * @version 1.0
 */
public class RelojControlador {
    //Para la hora
    private static Timer hora;
    private static String horaString = "";

    @FXML
    public ImageView horaNum1;
    @FXML
    public ImageView horaNum2;
    @FXML
    public ImageView minutoNum1;
    @FXML
    public ImageView minutoNum2;
    @FXML
    public ImageView segundoNum1;
    @FXML
    public ImageView segundoNum2;

    /**
     * Metodo estatico para llamarlo desde el Reloj
     * Este metodo inicia el atributo hora
     * Y crea una ejecucion de una tarea
     */
    public void iniciarReloj(){
        hora = new Timer();
        //Este metodo se utiliza para programar una ejecucion de una tarea(En este caso TimerTask)
        hora.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                //Metodo para actualizar la hora
                actualizarHora();
                //Metodo para actualizar la pantalla
                actualizarHoraPantalla();
            }
        }, 0, 1000); //0 delay, 1000 ms = 1 entre ejecuciones, es decir se actualiza cada segundo
    }

    /**
     *Metodo para actualizar la hora
     */
    private void actualizarHora(){
        //Obtenermos la hora actual
        LocalDateTime hoy = LocalDateTime.now();

        //Formatear la hora
        DateTimeFormatter tipoFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaString = hoy.format(tipoFormato);
    }

    /**
     * Metodo para terminar la ejecucion de la tarea
     */
    public void stop(){
        //Para parar el temporizador
        if(hora != null){
            hora.cancel();
        }
    }

    private void actualizarHoraPantalla(){
        cambiarHora();
        cambiarMinuto();
        //cambiarSegundo();
    }

    /**
     * Metodo para cambiar los minutos que a su vez llama a otros dos metodos
     * Esto lo he hecho así porque sabía que si no me iva a liar
     */
    private void cambiarMinuto() {
        cambiarMinutoNum1();
        cambiarMinutoNum2();
    }

    /**
     * Metodo para cambiar el numero 2 del minuto
     */
    private void cambiarMinutoNum2() {
        if(horaString.charAt(4) == '0'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ZERO.png"))));
        }
        if(horaString.charAt(4) == '1'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ONE.png"))));
        }
        if(horaString.charAt(4) == '2'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/TWO.png"))));
        }
        if(horaString.charAt(4) == '3'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/THREE.png"))));
        }
        if(horaString.charAt(4) == '4'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FOUR.png"))));
        }
        if(horaString.charAt(4) == '5'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FIVE.png"))));
        }
        if(horaString.charAt(4) == '6'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SIX.png"))));
        }
        if(horaString.charAt(4) == '7'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SEVEN.png"))));
        }
        if(horaString.charAt(4) == '8'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/EIGHT.png"))));
        }
        if(horaString.charAt(4) == '9'){
            minutoNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/NINE.png"))));
        }
    }

    /**
     * Metodo para cambiar el numero 1 del minuto
     */
    private void cambiarMinutoNum1() {
        if(horaString.charAt(3) == '0'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ZERO.png"))));
        }
        if(horaString.charAt(3) == '1'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ONE.png"))));
        }
        if(horaString.charAt(3) == '2'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/TWO.png"))));
        }
        if(horaString.charAt(3) == '3'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/THREE.png"))));
        }
        if(horaString.charAt(3) == '4'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FOUR.png"))));
        }
        if(horaString.charAt(3) == '5'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FIVE.png"))));
        }
        if(horaString.charAt(3) == '6'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SIX.png"))));
        }
        if(horaString.charAt(3) == '7'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SEVEN.png"))));
        }
        if(horaString.charAt(3) == '8'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/EIGHT.png"))));
        }
        if(horaString.charAt(3) == '9'){
            minutoNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/NINE.png"))));
        }
    }

    /**
     * Metodo para cambiar la hora que a su vez llama a otros dos metodos
     * Esto lo he hecho así porque sabía que si no me iva a liar
     */
    private void cambiarHora() {
        cambiarHoraNum1();
        cambiarHoraNum2();
    }

    /**
     * Metodo para camiar el numero 2 de la hora
     */
    private void cambiarHoraNum2() {
        if(horaString.charAt(1) == '0'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ZERO.png"))));
        }
        if(horaString.charAt(1) == '1'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ONE.png"))));
        }
        if(horaString.charAt(1) == '2'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/TWO.png"))));
        }
        if(horaString.charAt(1) == '3'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/THREE.png"))));
        }
        if(horaString.charAt(1) == '4'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FOUR.png"))));
        }
        if(horaString.charAt(1) == '5'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FIVE.png"))));
        }
        if(horaString.charAt(1) == '6'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SIX.png"))));
        }
        if(horaString.charAt(1) == '7'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SEVEN.png"))));
        }
        if(horaString.charAt(1) == '8'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/EIGHT.png"))));
        }
        if(horaString.charAt(1) == '9'){
            horaNum2.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/NINE.png"))));
        }
    }

    /**
     * Metodo para camiar el numero 1 de la hora
     */
    private void cambiarHoraNum1() {
        if(horaString.charAt(0) == '0'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ZERO.png"))));
        }
        if(horaString.charAt(0) == '1'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/ONE.png"))));
        }
        if(horaString.charAt(0) == '2'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/TWO.png"))));
        }
        if(horaString.charAt(0) == '3'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/THREE.png"))));
        }
        if(horaString.charAt(0) == '4'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FOUR.png"))));
        }
        if(horaString.charAt(0) == '5'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/FIVE.png"))));
        }
        if(horaString.charAt(0) == '6'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SIX.png"))));
        }
        if(horaString.charAt(0) == '7'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/SEVEN.png"))));
        }
        if(horaString.charAt(0) == '8'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/EIGHT.png"))));
        }
        if(horaString.charAt(0) == '9'){
            horaNum1.setImage(new Image(String.valueOf(Reloj.class.getResource("Imagenes/NINE.png"))));
        }
    }
}