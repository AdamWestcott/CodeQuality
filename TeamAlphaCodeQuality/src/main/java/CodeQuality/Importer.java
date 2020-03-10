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
     Exporter egypt = new Exporter();
  //  public  void ImportFile(String FileName)throws IOException{
      public void main(String[]args) throws FileNotFoundException,IOException{   
    File file = new File ("H:\\Desktop/captmidn.txt");
    Scanner imports = new Scanner(file);
     egypt.ExportMeasures();
  }
   
   
    
  
  
  }
