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
  

  public int calculateNumberOfLines1()throws IOException{
      try{
          count =0;
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
          count =0;
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
      Measures.setAbstractNumber(0);
      Measures.setAssertNumber(0);
      Measures.setBooleanNumber(0);
      Measures.setBreakNumber(0);
      Measures.setByteNumber(0);
      Measures.setCaseNumber(0);
      Measures.setCatchNumber(0);
      Measures.setCharNumber(0);
  Measures.setClassNumber(0);
  Measures.setContinueNumber(0);
  Measures.setConstNumber(0);
  Measures.setDefaultNumber(0);
  Measures.setDoNumber(0);
  Measures.setDoubleNumber(0);
  Measures.setElseNumber(0);
  Measures.setEnumNumber(0);
  Measures.setExportsNumber(0);
  Measures.setExtendsNumber(0);
  Measures.setFinalNumber(0);
  Measures.setFinallyNumber(0);
  Measures.setFloatNumber(0);
  Measures.setForNumber(0);
  Measures.setGotoNumber(0);
  Measures.setIfNumber(0);
  Measures.setImplementsNumber(0);
  Measures.setImportNumber(0);
  Measures.setInstanceofNumber(0);
  Measures.setIntNumber(0);
  Measures.setInterfaceNumber(0);
  Measures.setLongNumber(0);
  Measures.setModuleNumber(0);
  Measures.setNativeNumber(0);
  Measures.setNewNumber(0);
  Measures.setPackageNumber(0);
  Measures.setPrivateNumber(0);
  Measures.setProtectedNumber(0);
  Measures.setPublicNumber(0);
  Measures.setRequiresNumber(0);
  Measures.setReturnNumber(0);
  Measures.setShortNumber(0);
  Measures.setStaticNumber(0);
  Measures.setStrictfpNumber(0);
  Measures.setSuperNumber(0);
  Measures.setSwitchNumber(0);
  Measures.setSynchronizedNumber(0);
  Measures.setThisNumber(0);
  Measures.setThrowNumber(0);
  Measures.setThrowsNumber(0);
  Measures.setTransientNumber(0);
  Measures.setTryNumber(0);
  Measures.setVarNumber(0);
  Measures.setVoidNumber(0);
  Measures.setVolatileNumber(0);
  Measures.setWhileNumber(0);
      Measures.setTotalKeywords1(0);
      Measures.parse1();
      keywordCount=Measures.getTotalKeywords1();
      return keywordCount;
  }
  
  public int calculateNumberOfKeywords2() throws IOException{
      Measures.setAbstractNumber(0);
      Measures.setAssertNumber(0);
      Measures.setBooleanNumber(0);
      Measures.setBreakNumber(0);
      Measures.setByteNumber(0);
      Measures.setCaseNumber(0);
      Measures.setCatchNumber(0);
      Measures.setCharNumber(0);
  Measures.setClassNumber(0);
  Measures.setContinueNumber(0);
  Measures.setConstNumber(0);
  Measures.setDefaultNumber(0);
  Measures.setDoNumber(0);
  Measures.setDoubleNumber(0);
  Measures.setElseNumber(0);
  Measures.setEnumNumber(0);
  Measures.setExportsNumber(0);
  Measures.setExtendsNumber(0);
  Measures.setFinalNumber(0);
  Measures.setFinallyNumber(0);
  Measures.setFloatNumber(0);
  Measures.setForNumber(0);
  Measures.setGotoNumber(0);
  Measures.setIfNumber(0);
  Measures.setImplementsNumber(0);
  Measures.setImportNumber(0);
  Measures.setInstanceofNumber(0);
  Measures.setIntNumber(0);
  Measures.setInterfaceNumber(0);
  Measures.setLongNumber(0);
  Measures.setModuleNumber(0);
  Measures.setNativeNumber(0);
  Measures.setNewNumber(0);
  Measures.setPackageNumber(0);
  Measures.setPrivateNumber(0);
  Measures.setProtectedNumber(0);
  Measures.setPublicNumber(0);
  Measures.setRequiresNumber(0);
  Measures.setReturnNumber(0);
  Measures.setShortNumber(0);
  Measures.setStaticNumber(0);
  Measures.setStrictfpNumber(0);
  Measures.setSuperNumber(0);
  Measures.setSwitchNumber(0);
  Measures.setSynchronizedNumber(0);
  Measures.setThisNumber(0);
  Measures.setThrowNumber(0);
  Measures.setThrowsNumber(0);
  Measures.setTransientNumber(0);
  Measures.setTryNumber(0);
  Measures.setVarNumber(0);
  Measures.setVoidNumber(0);
  Measures.setVolatileNumber(0);
  Measures.setWhileNumber(0);
      Measures.setTotalKeywords1(0);
      Measures.setTotalKeywords2(0);
      Measures.parse2();
      keywordCount=Measures.getTotalKeywords2();
      return keywordCount;
  }
  
  public int calculateCyclomaticComplexity1() throws IOException
  {
      Measures.setIfNumber(0);
      Measures.setWhileNumber(0);
      Measures.setForNumber(0);
      Measures.setSwitchNumber(0);
      Measures.setCaseNumber(0);
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
      Measures.setIfNumber(0);
      Measures.setWhileNumber(0);
      Measures.setForNumber(0);
      Measures.setSwitchNumber(0);
      Measures.setCaseNumber(0);
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

