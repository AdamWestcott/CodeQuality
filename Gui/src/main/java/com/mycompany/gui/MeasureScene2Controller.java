/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import CodeQuality.Exporter;
import CodeQuality.Importer;
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
public class MeasureScene2Controller implements Initializable {

    Importer importedCode = new Importer();
    @FXML
    Measurements measures3 = new Measurements();
    Exporter export2 = new Exporter();
    @FXML
    private TextArea measureView2;
    
    private String code1Measures;
    private int numberOfLines2;
    private int numberOfKeywords2;
    private int cyclomatic2;
    
    @FXML
    public void setAreaText(String text) {
    measureView2.setText(text);
}
    
    public void CalculateMeasures2() throws IOException {
       Parent root;
    numberOfLines2 = measures3.calculateNumberOfLines2();
    numberOfKeywords2 = measures3.calculateNumberOfKeywords2();
    cyclomatic2 = measures3.calculateCyclomaticComplexity2();
            code1Measures = "Number of Lines: "+numberOfLines2 +"\n" 
                    + "Number of Keywords: "+numberOfKeywords2 +"\n"
                    + "Cyclomatic Complexity: "+cyclomatic2+"\n";
            System.out.println(code1Measures);
        URL location = getClass().getResource("/fxml/MeasureScene2.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        root = fxmlLoader.load(location.openStream());
        MeasureScene2Controller contr = fxmlLoader.getController();
        contr.setAreaText(code1Measures);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Measures for 2nd Code");
        stage.show();
            
            //measureView.setText(code1Measures);
           }
    @FXML
    public void ExportCode2() throws IOException {
            TextInputDialog exporter2Name = new TextInputDialog();
            exporter2Name.setTitle("Enter File Name");
            exporter2Name.getDialogPane().setContentText("Enter File Name");
            Optional<String> result =exporter2Name.showAndWait();
            TextField input = exporter2Name.getEditor();
            if(input.getText()!= null && input.getText().toString().length()!=0)
            {
              export2.setFilename2(input.getText().toString());
            }
            export2.ExportMeasures2();
           }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
