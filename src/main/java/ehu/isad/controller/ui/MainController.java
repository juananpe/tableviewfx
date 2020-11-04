package ehu.isad.controller.ui;

import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    private Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBozkatu;

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    void initialize() {

        btnBozkatu.setOnAction(event -> {
            main.herrialdeaHautatu();
        });

    }
}
