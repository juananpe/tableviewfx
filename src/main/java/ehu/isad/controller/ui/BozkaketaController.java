package ehu.isad.controller.ui;

import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class BozkaketaController {

    private Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tbData;

    @FXML
    private Button btnBozkaketaGorde;

    @FXML
    void initialize() {

    }

    @FXML
    void onClick(ActionEvent event) {
        main.top3Bistaratu();
    }


    public void setMainApp(Main main) {
        this.main = main;
    }
}
