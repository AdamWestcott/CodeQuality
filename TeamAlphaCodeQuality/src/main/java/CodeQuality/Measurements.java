/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author k1746252
 */
public class Measurements {
Importer importedFile = new Importer(); 
private int count;

  public int calculateNumberOfLines()throws IOException{
      File file = importedFile.ImportFile();
      Scanner newFile = new Scanner(file);
      while(newFile.hasNextLine()){
          count++;
      }
      return count;
  }
  
  
}
