package ehu.isad;

import ehu.isad.controller.ui.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

  private Parent mainUI, herrialdeakUI, bozkaketaUI, top3UI;
  private Stage stage;
  private MainController mainController;
  private HerrialdeakController herrialdeakController;
  private BozkaketaController bozkaketaController;
  private TopController top3Controller;


  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("Eurobisioa");
    stage.setScene(new Scene(mainUI, 650, 475));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderHasiera = new FXMLLoader(getClass().getResource("/main.fxml"));
    mainUI = (Parent) loaderHasiera.load();
    mainController = loaderHasiera.getController();
    mainController.setMainApp(this);

    FXMLLoader herrialdeakLoader = new FXMLLoader(getClass().getResource("/herrialdeak.fxml"));
    herrialdeakUI = (Parent) herrialdeakLoader.load();
    herrialdeakController = herrialdeakLoader.getController();
    herrialdeakController.setMainApp(this);

    FXMLLoader bozkaketaLoader = new FXMLLoader(getClass().getResource("/bozkaketa.fxml"));
    bozkaketaUI = (Parent) bozkaketaLoader.load();
    bozkaketaController = bozkaketaLoader.getController();
    bozkaketaController.setMainApp(this);

    FXMLLoader top3Loader = new FXMLLoader(getClass().getResource("/top3.fxml"));
    top3UI = (Parent) top3Loader.load();
    top3Controller = top3Loader.getController();
    top3Controller.setMainApp(this);

  }


  public static void main(String[] args) {
    launch(args);
  }

  public void herrialdeaHautatu() {
    stage.setScene(new Scene(herrialdeakUI));
    stage.show();
  }

  public void bozkaketaBistaratu() {
    stage.setScene(new Scene(bozkaketaUI));
    stage.show();
  }

  public void top3Bistaratu() {
    stage.setScene(new Scene(top3UI));
    stage.show();
  }



}
