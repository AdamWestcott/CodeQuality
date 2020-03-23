package com.mycompany.gui;

import CodeQuality.Importer;
import CodeQuality.Exporter;
import CodeQuality.Measurements;
import CodeQuality.Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    Importer importedCode = new Importer();
    Measurements measures = new Measurements();
    @FXML
    MeasureScene1Controller measure1 = new MeasureScene1Controller();
    MeasureScene2Controller measure2 = new MeasureScene2Controller();
    @FXML
    private TextArea view1;
    @FXML
    private TextArea view3;    
    private String filepath;
    private String code1;
    private String code2;
    private String code1Measures;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
     //view1.setText("");
      //filepath = "H:\\Desktop/captmidn.txt";
      File newFile1 = importedCode.ImportFile1();
        try {
            Scanner scanner = new Scanner(newFile1);
            while (scanner.hasNextLine()) {
                code1 = code1 + (scanner.nextLine()+"\n");
            }
            scanner.close();
             
            view1.setText(code1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) throws IOException {
     //view1.setText("");
      File newFile2 = importedCode.ImportFile2();
        try {
            Scanner scanner = new Scanner(newFile2);
            while (scanner.hasNextLine()) {
                code2 = code2 + (scanner.nextLine()+"\n");
            }
            scanner.close();
             
            view3.setText(code2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        @FXML
        private void OpenMeasure1 (ActionEvent event) throws IOException {
        measure1.CalculateMeasures1();
           }
        @FXML
        private void OpenMeasure2 (ActionEvent event) throws IOException {
        measure2.CalculateMeasures2();
           }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
