package com.mycompany.gui;

import CodeQuality.Importer;
import CodeQuality.Exporter;
import CodeQuality.Measurements;
import CodeQuality.Parser;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    Importer importedCode = new Importer();
    Measurements measures = new Measurements();
    @FXML
    private Label label;
    private Stage stage;
    private String code;
    private TextField view2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      label.setWrapText(true);
      importedCode.ImportFile();
      File file = importedCode.ImportFile();
      Scanner newFile = new Scanner(file);
      while(newFile.hasNextLine()){
      code = code + newFile.nextLine()+"\n";
      }
      Text text = new Text(code);
      view2.setText(code);
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
