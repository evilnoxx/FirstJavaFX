/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author noxx
 */
public class FXMLFacturasController implements Initializable {
    @FXML
    private TitledPane x1;
    @FXML
    private Button BackButton;

    private Stage stage;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBack(ActionEvent event) {
        FXMLLoader initialLoader = new FXMLLoader(getClass().getResource("FXMLDocument01.fxml"));
        Parent root = null;
        try {
            root = (Parent)initialLoader.load();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FXMLDocument01Controller controller = (FXMLDocument01Controller) initialLoader.getController();
        controller.setStage(stage);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
