/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxscenescloseexitopen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXScenesCloseExitOpen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file for the first scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        // Set the title for the first scene
        primaryStage.setTitle("Scene 1");
        // Set the scene for the primary stage
        primaryStage.setScene(new Scene(loader.load(), 600, 400));
        // Show the primary stage
        primaryStage.show();
    }

}
