package ehu.isad.controller.ui;

import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class HerrialdeakController {

    private Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> comboHerrialdeak;

    @FXML
    private Button btnOK;

    @FXML
    void initialize() {

    }

    @FXML
    void onClick(ActionEvent event) {
        main.bozkaketaBistaratu();
    }
    public void setMainApp(Main main){
        this.main = main;
    }

}
