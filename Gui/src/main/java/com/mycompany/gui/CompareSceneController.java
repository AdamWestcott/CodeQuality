/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import CodeQuality.Exporter;
import CodeQuality.Measurements;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author k1746252
 */

public class CompareSceneController implements Initializable {
    @FXML
    Measurements measures3 = new Measurements();
private String comparison;
@FXML
    private TextArea compareView;
Exporter export1 = new Exporter();
@FXML
    public void setAreaText(String text) {
    compareView.setText(text);
}

     public void CalculateComparison() throws IOException {
       Parent root;
            comparison = measures3.compareCyclomaticComplexity() +"\n" 
                    + measures3.compareNumberOfKeywords()+"\n"
                    + measures3.compareNumberOfLines()+"\n";
            System.out.println(comparison);
        URL location = getClass().getResource("/fxml/CompareScene.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        root = fxmlLoader.load(location.openStream());
        CompareSceneController contr = fxmlLoader.getController();
        contr.setAreaText(comparison);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Measures for 1st Code");
        stage.show();
            
            //measureView.setText(code1Measures);
           }
     
     @FXML
   public void ExportCode3() throws IOException {
            TextInputDialog exporter1Name = new TextInputDialog();
            exporter1Name.setTitle("Enter File Name");
            exporter1Name.getDialogPane().setContentText("Enter File Name");
            Optional<String> result =exporter1Name.showAndWait();
            TextField input = exporter1Name.getEditor();
            if(input.getText()!= null && input.getText().toString().length()!=0)
            {
            export1.setFilename3(input.getText().toString());
            }
            export1.ExportMeasures3();
           }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
