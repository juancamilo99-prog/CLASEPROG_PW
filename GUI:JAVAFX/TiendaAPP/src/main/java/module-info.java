module TiendaAPP {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires java.management;
    requires java.prefs;
    requires java.net.http;
    opens sample to javafx.fxml;
    exports sample;
}