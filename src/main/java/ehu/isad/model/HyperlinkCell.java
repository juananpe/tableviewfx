package ehu.isad.model;

import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HyperlinkCell implements  Callback<TableColumn<Item, Hyperlink>, TableCell<Item, Hyperlink>> {

    @Override
    public TableCell<Item, Hyperlink> call(TableColumn<Item, Hyperlink> arg) {
        TableCell<Item, Hyperlink> cell = new TableCell<Item, Hyperlink>() {
            @Override
            protected void updateItem(Hyperlink item, boolean empty) {

                if (item != null) {
                    item.setOnAction(e -> {
                            String url =  "https://" + item.getText();
                            try {
                                System.out.println( url );
                                Desktop.getDesktop().browse(new URI(url));
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            } catch (URISyntaxException e1) {
                                e1.printStackTrace();
                            }

                    });
                }

                setGraphic(item);
            }

        };
        return cell;
    }
}
