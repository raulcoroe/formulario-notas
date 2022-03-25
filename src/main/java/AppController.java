import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    public ComboBox<String> cbx1;
    public ComboBox<String> cbx2;
    public ComboBox<String> cbx3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void action1 (MouseEvent event) {
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("Raul Martin Catalan", "Manuel Garcia Sanz", "Pepito Martinez Perez", "Jose Alegre Aliaga");
        cbx1.setItems(items);
    }

    @FXML
    public void action2 (MouseEvent event) {
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("1-DAM", "2-DAM", "1-DAW", "2-DAW", "1-ASIR", "2-ASIR");
        cbx2.setItems(items);
    }

    @FXML
    public void action3 (MouseEvent event) {
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("Desarrollo de Interfaces", "Programacion de Servicios y Procesos", "Programacion Multimedia", "Acceso a Datos");
        cbx3.setItems(items);
    }

    @FXML
    public void guardar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("La nota ha sido guardada correctamente");
        alert.show();
    }
}
