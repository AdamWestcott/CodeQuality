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
import javafx.fxml.Initializable;
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
    private Stage stage;
    @FXML
    private TextArea view1;
    @FXML
    private TextArea view3;
    private String filepath;
    private String code;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
     //view1.setText("");
      //filepath = "H:\\Desktop/captmidn.txt";
      File newFile = importedCode.ImportFile();
        try {
            Scanner scanner = new Scanner(newFile);
            while (scanner.hasNextLine()) {
                code = code + (scanner.nextLine()+"\n");
            }
            scanner.close();
             
            view1.setText(code);
            System.out.println(code);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) throws IOException {
     //view1.setText("");
      File newFile = importedCode.ImportFile();
        try {
            Scanner scanner = new Scanner(newFile);
            while (scanner.hasNextLine()) {
                code = code + (scanner.nextLine()+"\n");
            }
            scanner.close();
             
            view3.setText(code);
            System.out.println(code);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
