package ehu.isad.controller.ui;

import java.net.URL;
import java.util.ResourceBundle;

import ehu.isad.Main;
import ehu.isad.model.HyperlinkCell;
import ehu.isad.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BozkaketaController {

    private Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Item> tbData;

    private TableColumn<Item, String> nameColumn;
    private TableColumn<Item, Hyperlink> urlColumn;

    private ObservableList<Item> websiteList;



    @FXML
    private Button btnBozkaketaGorde;

    @FXML
    void initialize() {
        nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("websiteName"));

        urlColumn = new TableColumn<>("Address");
        urlColumn.setCellValueFactory(new PropertyValueFactory<>("hyperlink"));
        urlColumn.setCellFactory(new HyperlinkCell());

        tbData.getColumns().add(nameColumn);
        tbData.getColumns().add(urlColumn);

        websiteList = FXCollections.observableArrayList();
        websiteList.add(new Item("Google", "www.google.com"));
        websiteList.add(new Item("Facebook", "www.facebook.com"));
        websiteList.add(new Item("Superglobals", "www.superglobals.net"));

        tbData.setItems(websiteList);
    }

    @FXML
    void onClick(ActionEvent event) {
        main.top3Bistaratu();
    }


    public void setMainApp(Main main) {
        this.main = main;
    }
}
