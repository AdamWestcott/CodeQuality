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
  
  private int cyclomaticComplexity;
  private int nodes;
  private int edges;
  
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

 
    public int getAbstractNumber() {
        return abstractNumber;
    }

    public int getAssertNumber() {
        return assertNumber;
    }

    public int getBooleanNumber() {
        return booleanNumber;
    }

    public int getBreakNumber() {
        return breakNumber;
    }

    public int getByteNumber() {
        return byteNumber;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public int getCatchNumber() {
        return catchNumber;
    }

    public int getCharNumber() {
        return charNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public int getContinueNumber() {
        return continueNumber;
    }

    public int getConstNumber() {
        return constNumber;
    }

    public int getDefaultNumber() {
        return defaultNumber;
    }

    public int getDoNumber() {
        return doNumber;
    }

    public int getDoubleNumber() {
        return doubleNumber;
    }

    public int getElseNumber() {
        return elseNumber;
    }

    public int getEnumNumber() {
        return enumNumber;
    }

    public int getExportsNumber() {
        return exportsNumber;
    }

    public int getExtendsNumber() {
        return extendsNumber;
    }

    public int getFinalNumber() {
        return finalNumber;
    }

    public int getFinallyNumber() {
        return finallyNumber;
    }

    public int getFloatNumber() {
        return floatNumber;
    }

    public int getForNumber() {
        return forNumber;
    }

    public int getGotoNumber() {
        return gotoNumber;
    }

    public int getIfNumber() {
        return ifNumber;
    }

    public int getImplementsNumber() {
        return implementsNumber;
    }

    public int getImportNumber() {
        return importNumber;
    }

    public int getInstanceofNumber() {
        return instanceofNumber;
    }

    public int getIntNumber() {
        return intNumber;
    }

    public int getInterfaceNumber() {
        return interfaceNumber;
    }

    public int getLongNumber() {
        return longNumber;
    }

    public int getModuleNumber() {
        return moduleNumber;
    }

    public int getNativeNumber() {
        return nativeNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public int getPrivateNumber() {
        return privateNumber;
    }

    public int getProtectedNumber() {
        return protectedNumber;
    }

    public int getPublicNumber() {
        return publicNumber;
    }

    public int getRequiresNumber() {
        return requiresNumber;
    }

    public int getReturnNumber() {
        return returnNumber;
    }

    public int getShortNumber() {
        return shortNumber;
    }

    public int getStaticNumber() {
        return staticNumber;
    }

    public int getStrictfpNumber() {
        return strictfpNumber;
    }

    public int getSuperNumber() {
        return superNumber;
    }

    public int getSwitchNumber() {
        return switchNumber;
    }

    public int getSynchronizedNumber() {
        return synchronizedNumber;
    }

    public int getThisNumber() {
        return thisNumber;
    }

    public int getThrowNumber() {
        return throwNumber;
    }

    public int getThrowsNumber() {
        return throwsNumber;
    }

    public int getTransientNumber() {
        return transientNumber;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public int getVarNumber() {
        return varNumber;
    }

    public int getVoidNumber() {
        return voidNumber;
    }

    public int getVolatileNumber() {
        return volatileNumber;
    }

    public int getWhileNumber() {
        return whileNumber;
    }

    public int getTotalKeywords() {
        return TotalKeywords;
    }
  
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
          if (currentLine.contains("if")) {
      ifNumber++;
  }
          if (currentLine.contains("implements")) {
      implementsNumber++;
  }
          if (currentLine.contains("import")) {
      importNumber++;
  }
          if (currentLine.contains("instanceof")) {
      instanceofNumber++;
  }
          if (currentLine.contains("int")) {
      intNumber++;
  }
          if (currentLine.contains("interface")) {
      interfaceNumber++;
  }
          if (currentLine.contains("long")) {
      longNumber++;
  }          
          if (currentLine.contains("module")) {
      moduleNumber++;
  }
          if (currentLine.contains("native")) {
      nativeNumber++;
  }
          if (currentLine.contains("new")) {
      newNumber++;
  }
          if (currentLine.contains("package")) {
      packageNumber++;
  }
          if (currentLine.contains("private")) {
      privateNumber++;
  }
          if (currentLine.contains("protected")) {
      protectedNumber++;
  }
          if (currentLine.contains("public")) {
      publicNumber++;
  }
          if (currentLine.contains("requires")) {
      requiresNumber++;
  }
          if (currentLine.contains("return")) {
      returnNumber++;
  }
          if (currentLine.contains("short")) {
      shortNumber++;
  } 
          if (currentLine.contains("static")) {
      staticNumber++;
  }
          if (currentLine.contains("strictfp")) {
      strictfpNumber++;
  }
          if (currentLine.contains("super")) {
      superNumber++;
  }
          if (currentLine.contains("switch")) {
      switchNumber++;
  }
          if (currentLine.contains("synchronized")) {
      synchronizedNumber++;
  }
          if (currentLine.contains("this")) {
      thisNumber++;
  }
          if (currentLine.contains("throw")) {
      throwNumber++;
  }
          if (currentLine.contains("throws")) {
      throwsNumber++;
  }
          if (currentLine.contains("transient")) {
      transientNumber++;
  }
          if (currentLine.contains("try")) {
      tryNumber++;
  }
                  if (currentLine.contains("var")) {
      varNumber++;
  }
          if (currentLine.contains("void")) {
      voidNumber++;
  }
          if (currentLine.contains("volatile")) {
      volatileNumber++;
  }
          if (currentLine.contains("while")) {
      whileNumber++;
  }
          
      }
      TotalKeywords=abstractNumber+
assertNumber+
booleanNumber+
breakNumber+
byteNumber+
caseNumber+
catchNumber+
charNumber+
classNumber+
continueNumber+
constNumber+
defaultNumber+
doNumber+
doubleNumber+
elseNumber+
enumNumber+
exportsNumber+
extendsNumber+
finalNumber+
finallyNumber+
floatNumber+
forNumber+
gotoNumber+
ifNumber+
implementsNumber+
importNumber+
instanceofNumber+
intNumber+
interfaceNumber+
longNumber+
moduleNumber+
nativeNumber+
newNumber+
packageNumber+
privateNumber+
protectedNumber+
publicNumber+
requiresNumber+
returnNumber+
shortNumber+
staticNumber+
strictfpNumber+
superNumber+
switchNumber+
synchronizedNumber+
thisNumber+
throwNumber+
throwsNumber+
transientNumber+
tryNumber+
varNumber+
voidNumber+
volatileNumber+
whileNumber;   
}
  
//  public int calculateNodes() throws IOException
//  {
//      parse();
//      nodes=2; //Start and end of code
//      nodes= nodes + (ifNumber*2); // Number of nodes per if Statement
//      nodes= nodes + (whileNumber*3);
//      nodes = nodes + elseNumber;
//      nodes = nodes +(forNumber*4);
//      return nodes;
//  }
//  
//  public int calculateEdges() throws IOException
//  {
//      parse();
//      edges=2;//end of the code
//      edges= edges + (ifNumber*5); // Number of nodes per if Statement
//      edges= edges + (whileNumber*4);
//      edges = edges +(forNumber*5);
//      return edges;
//  }
  
  
}
