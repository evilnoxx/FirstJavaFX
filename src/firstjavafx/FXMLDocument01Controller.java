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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author noxx
 */
public class FXMLDocument01Controller implements Initializable {
    
    @FXML
    private Button firstButton;
    
    Stage stage;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField PasswordTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void firstButtonAction(ActionEvent event) {
        FXMLLoader initialLoader = new FXMLLoader(getClass().getResource("FXMLFacturas.fxml"));
        Parent root = null;
        try {
            root = (Parent)initialLoader.load();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        FXMLFacturasController controller = (FXMLFacturasController) initialLoader.getController();
        controller.setStage(stage);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
}
