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
private String code;
  

  public int calculateNumberOfLines1()throws IOException{
      try{
      File file = importedFile.ImportFile1();
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
  
  public int calculateNumberOfLines2()throws IOException{
      try{
      File file = importedFile.ImportFile2();
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
  
 
  
  public int calculateNumberOfKeywords1() throws IOException{
      Measures.parse1();
      keywordCount=Measures.getTotalKeywords1();
      return keywordCount;
  }
  
  public int calculateNumberOfKeywords2() throws IOException{
      Measures.parse2();
      keywordCount=Measures.getTotalKeywords2();
      return keywordCount;
  }
  
  public int calculateCyclomaticComplexity1() throws IOException
  {
      Measures.parse1();
     int cyclomaticComplexity =Measures.getIfNumber()
             +Measures.getWhileNumber()
             +Measures.getForNumber()
             +Measures.getSwitchNumber()
             +Measures.getCaseNumber()
             +1;
     return cyclomaticComplexity;
  }
  
  public int calculateCyclomaticComplexity2() throws IOException
  {
      Measures.parse2();
     int cyclomaticComplexity =Measures.getIfNumber()
             +Measures.getWhileNumber()
             +Measures.getForNumber()
             +Measures.getSwitchNumber()
             +Measures.getCaseNumber()
             +1;
     return cyclomaticComplexity;
  }
  
  
  
}

