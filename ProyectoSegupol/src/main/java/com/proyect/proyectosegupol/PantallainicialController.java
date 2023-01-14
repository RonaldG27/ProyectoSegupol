package com.proyect.proyectosegupol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PantallainicialController implements Initializable {
    @FXML
    private Button urbanizacionButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    /*@FXML*/
    /*public void pantallaurb(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pantallaurbanizacion.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) urbanizacionButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        urbanizacionButton.setOnAction(event -> {
            try {
                pantallaurb(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }*/
}






