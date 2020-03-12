/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author k1746252
 */
public class Parser {	
  Importer importedFile = new Importer();
  
  private int abstractNumber;
  private int assertNumber;
  private int booleanNumber;
  private int breakNumber;
  private int byteNumber;
  private int caseNumber;
  private int catchNumber;
  private int charNumber;
  private int classNumber;
  private int continueNumber;
  private int constNumber;
  private int defaultNumber;
  private int doNumber;
  private int doubleNumber;
  private int elseNumber;
  private int enumNumber;
  private int exportsNumber;
  private int extendsNumber;
  private int finalNumber;
  private int finallyNumber;
  private int floatNumber;
  private int forNumber;
  private int gotoNumber;
  private int ifNumber;
  private int implementsNumber;
  private int importNumber;
  private int instanceofNumber;
  private int intNumber;
  private int interfaceNumber;
  private int longNumber;
  private int moduleNumber;
  private int nativeNumber;
  private int newNumber;
  private int packageNumber;
  private int privateNumber;
  private int protectedNumber;
  private int publicNumber;
  private int requiresNumber;
  private int returnNumber;
  private int shortNumber;
  private int staticNumber;
  private int strictfpNumber;
  private int superNumber;
  private int switchNumber;
  private int synchronizedNumber;
  private int thisNumber;
  private int throwNumber;
  private int throwsNumber;
  private int transientNumber;
  private int tryNumber;
  private int varNumber;
  private int voidNumber;
  private int volatileNumber;
  private int whileNumber;
  private int TotalKeywords;
  
  public void parse()throws IOException	 	       	    	      	  	     	  	
  {
       File file = importedFile.ImportFile();
      Scanner newFile = new Scanner(file);
      while(newFile.hasNextLine()){
          String currentLine =newFile.nextLine();
          if (currentLine.contains("abstract")) {
          abstractNumber++;
  }
          if (currentLine.contains("assert")) {
      assertNumber++;
  }
          if (currentLine.contains("boolean")) {
      booleanNumber++;
  }
          if (currentLine.contains("break")) {
      breakNumber++;
  }
          if (currentLine.contains("byte")) {
      byteNumber++;
  }
          if (currentLine.contains("case")) {
      caseNumber++;
  }
          if (currentLine.contains("catch")) {
      catchNumber++;
  }
          if (currentLine.contains("char")) {
      charNumber++;
  }
          if (currentLine.contains("class")) {
      classNumber++;
  }
          if (currentLine.contains("continue")) {
      continueNumber++;
  }          
          if (currentLine.contains("const")) {
      constNumber++;
  }
          if (currentLine.contains("default")) {
      defaultNumber++;
  }
          if (currentLine.contains("do")) {
      doNumber++;
  }
          if (currentLine.contains("double")) {
      doubleNumber++;
  }
          if (currentLine.contains("else")) {
      elseNumber++;
  }
          if (currentLine.contains("enum")) {
      enumNumber++;
  }
          if (currentLine.contains("exports")) {
      exportsNumber++;
  }
          if (currentLine.contains("extends")) {
      extendsNumber++;
  }
          if (currentLine.contains("final")) {
      finalNumber++;
  }
          if (currentLine.contains("finally")) {
      finallyNumber++;
  }
          if (currentLine.contains("float")) {
      floatNumber++;
  }
          if (currentLine.contains("for")) {
      forNumber++;
  }
          if (currentLine.contains("goto")) {
      gotoNumber++;
  }
          if (currentLine.contains("break")) {
      breakNumber++;
  }
          if (currentLine.contains("byte")) {
      byteNumber++;
  }
          if (currentLine.contains("case")) {
      caseNumber++;
  }
          if (currentLine.contains("catch")) {
      catchNumber++;
  }
          if (currentLine.contains("char")) {
      charNumber++;
  }
          if (currentLine.contains("class")) {
      classNumber++;
  }
          if (currentLine.contains("continue")) {
      continueNumber++;
  }          
          if (currentLine.contains("const")) {
      constNumber++;
  }
          if (currentLine.contains("default")) {
      defaultNumber++;
  }
          if (currentLine.contains("do")) {
      doNumber++;
  }
          if (currentLine.contains("double")) {
      doubleNumber++;
  }
          if (currentLine.contains("else")) {
      elseNumber++;
  }
          if (currentLine.contains("enum")) {
      enumNumber++;
  }
          if (currentLine.contains("exports")) {
      exportsNumber++;
  }
          if (currentLine.contains("extends")) {
      extendsNumber++;
  }
          if (currentLine.contains("final")) {
      finalNumber++;
  }
          if (currentLine.contains("finally")) {
      finallyNumber++;
  }
          
      }
  
  
  
    
}
}
