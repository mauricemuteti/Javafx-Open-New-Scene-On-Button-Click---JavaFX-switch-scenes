/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxscenescloseexitopen;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    public void openScene2(ActionEvent event) throws IOException {
    // Load the FXML file for the second scene
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
    // Create a new stage for the second scene
    Stage stage = new Stage();
    // Create a new Scene with the root element from the FXML file, and set the width and height
    Scene scene = new Scene(loader.load(), 600, 400);
    stage.setScene(scene);
    // Set the title for the second scene
    stage.setTitle("Scene 2");
    // Show the second scene
    stage.show();
    }

}
