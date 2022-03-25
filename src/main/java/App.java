import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import util.R;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(R.getUI("formulario.fxml"));
        loader.setController(new AppController());

        VBox vBox = loader.load();
        Scene scene = new Scene(vBox);

        stage.setScene(scene);
        stage.setTitle("Formulario");
        stage.show();
    }


}
