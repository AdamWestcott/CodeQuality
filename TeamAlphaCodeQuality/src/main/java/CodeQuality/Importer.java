/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author k1746252
 */
public class Importer {

    private String filepath = "H:\\Desktop/captmidn.txt";
    
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    
  public  File ImportFile(){
    filepath = "H:\\Desktop/captmidn.txt";
    File file = new File (filepath);
    return file;  
  }
  
  }
