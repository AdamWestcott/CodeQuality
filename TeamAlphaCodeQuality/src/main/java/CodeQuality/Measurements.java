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
Parser Measures = new Parser();
private int count;
private int keywordCount;

  public int calculateNumberOfLines()throws IOException{
      try{
      File file = importedFile.ImportFile();
      Scanner newFile = new Scanner(file);
      while(newFile.hasNextLine()){
          count++;
          newFile.nextLine();
      }
      return count;
  }
 catch(IOException e){
          throw e;
      }   
  }
  
  public int calculateNumberOfKeywords() throws IOException{
      Measures.parse();
      keywordCount=Measures.getTotalKeywords();
      return keywordCount;
  }
  
  
  
}

