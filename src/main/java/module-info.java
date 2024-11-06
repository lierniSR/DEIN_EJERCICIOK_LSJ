module es.liernisarraoa.dein_ejerciciok_lsj {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.liernisarraoa.dein_ejerciciok_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejerciciok_lsj;
    exports es.liernisarraoa.dein_ejerciciok_lsj.Controlador;
    opens es.liernisarraoa.dein_ejerciciok_lsj.Controlador to javafx.fxml;
}