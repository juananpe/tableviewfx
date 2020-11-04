package ehu.isad.controller.ui;

import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class TopController {

    private Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tbData;

    @FXML
    private Button btnOK;

    @FXML
    void onClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void initialize() {

    }

    public void setMainApp(Main main) {
        this.main = main;
    }
}
