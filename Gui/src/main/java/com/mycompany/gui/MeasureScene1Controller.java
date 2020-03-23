/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import CodeQuality.Importer;
import CodeQuality.Measurements;
import CodeQuality.Parser;
import CodeQuality.Exporter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
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
public class MeasureScene1Controller implements Initializable {
    Importer importedCode = new Importer();
    @FXML
    Measurements measures3 = new Measurements();
    Exporter export1 = new Exporter();
    @FXML
    private TextArea measureView;
    
    private String code1Measures;
    private int numberOfLines1;
    private int numberOfKeywords1;
    private int cyclomatic1;
    
    @FXML
    public void setAreaText(String text) {
    measureView.setText(text);
}

     @FXML
   public void CalculateMeasures1() throws IOException {
       Parent root;
    numberOfLines1 = measures3.calculateNumberOfLines1();
    numberOfKeywords1 = measures3.calculateNumberOfKeywords1();
    cyclomatic1 = measures3.calculateCyclomaticComplexity1();
            code1Measures = "Number of Lines: "+numberOfLines1 +"\n" 
                    + "Number of Keywords: "+numberOfKeywords1 +"\n"
                    + "Cyclomatic Complexity: "+cyclomatic1+"\n";
            System.out.println(code1Measures);
        URL location = getClass().getResource("/fxml/MeasureScene1.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        root = fxmlLoader.load(location.openStream());
        MeasureScene1Controller contr = fxmlLoader.getController();
        contr.setAreaText(code1Measures);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Measures for 1st Code");
        stage.show();
            
            //measureView.setText(code1Measures);
           }
   public void ExportCode1() throws IOException {
            TextInputDialog exporter1Name = new TextInputDialog();
            exporter1Name.setTitle("Enter File Name");
            exporter1Name.getDialogPane().setContentText("Enter File Name");
            Optional<String> result =exporter1Name.showAndWait();
            TextField input = exporter1Name.getEditor();
            if(input.getText()!= null && input.getText().toString().length()!=0)
            {
              export1.setFilename(input.getText().toString());
            }
            export1.ExportMeasures1();
           }
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
