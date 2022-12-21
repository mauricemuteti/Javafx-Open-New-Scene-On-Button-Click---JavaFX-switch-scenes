/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxscenescloseexitopen;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Scene2Controller {

    public Button btnCloseScene2;

    public void closeScene2(ActionEvent event) {
        // Get the current stage
        Stage stage = (Stage) btnCloseScene2.getScene().getWindow();
        // Close the current stage
        stage.close();
    }

}