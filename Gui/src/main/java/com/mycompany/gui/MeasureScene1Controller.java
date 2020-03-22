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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author k1746252
 */
public class MeasureScene1Controller implements Initializable {
    Importer importedCode = new Importer();
    Measurements measures3 = new Measurements();
    Exporter export1 = new Exporter();
    @FXML
    private TextArea measureView;
    private String code1Measures;
    private int numberOfLines1;
    private int numberOfKeywords1;
    private int cyclomatic1;

     @FXML
   public void CalculateMeasures() throws IOException {
    numberOfLines1 = measures3.calculateNumberOfLines();
    numberOfKeywords1 = measures3.calculateNumberOfKeywords();
    cyclomatic1 = measures3.calculateCyclomaticComplexity();
            code1Measures = numberOfLines1 +"\n" 
                    + numberOfKeywords1 +"\n"
                    +cyclomatic1+"\n";
            System.out.println(code1Measures);
            measureView.setText(code1Measures);
           }
   public void ExportCode1() throws IOException {
            export1.ExportMeasures1();
           }
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
