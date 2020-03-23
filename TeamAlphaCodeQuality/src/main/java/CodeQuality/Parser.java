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
  private int TotalKeywords1;
  private int TotalKeywords2;
  
  public void setImportedFile(Importer importedFile) {
        this.importedFile = importedFile;
    }

    public void setAbstractNumber(int abstractNumber) {
        this.abstractNumber = abstractNumber;
    }

    public void setAssertNumber(int assertNumber) {
        this.assertNumber = assertNumber;
    }

    public void setBooleanNumber(int booleanNumber) {
        this.booleanNumber = booleanNumber;
    }

    public void setBreakNumber(int breakNumber) {
        this.breakNumber = breakNumber;
    }

    public void setByteNumber(int byteNumber) {
        this.byteNumber = byteNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public void setCatchNumber(int catchNumber) {
        this.catchNumber = catchNumber;
    }

    public void setCharNumber(int charNumber) {
        this.charNumber = charNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setContinueNumber(int continueNumber) {
        this.continueNumber = continueNumber;
    }

    public void setConstNumber(int constNumber) {
        this.constNumber = constNumber;
    }

    public void setDefaultNumber(int defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    public void setDoNumber(int doNumber) {
        this.doNumber = doNumber;
    }

    public void setDoubleNumber(int doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void setElseNumber(int elseNumber) {
        this.elseNumber = elseNumber;
    }

    public void setEnumNumber(int enumNumber) {
        this.enumNumber = enumNumber;
    }

    public void setExportsNumber(int exportsNumber) {
        this.exportsNumber = exportsNumber;
    }

    public void setExtendsNumber(int extendsNumber) {
        this.extendsNumber = extendsNumber;
    }

    public void setFinalNumber(int finalNumber) {
        this.finalNumber = finalNumber;
    }

    public void setFinallyNumber(int finallyNumber) {
        this.finallyNumber = finallyNumber;
    }

    public void setFloatNumber(int floatNumber) {
        this.floatNumber = floatNumber;
    }

    public void setForNumber(int forNumber) {
        this.forNumber = forNumber;
    }

    public void setGotoNumber(int gotoNumber) {
        this.gotoNumber = gotoNumber;
    }

    public void setIfNumber(int ifNumber) {
        this.ifNumber = ifNumber;
    }

    public void setImplementsNumber(int implementsNumber) {
        this.implementsNumber = implementsNumber;
    }

    public void setImportNumber(int importNumber) {
        this.importNumber = importNumber;
    }

    public void setInstanceofNumber(int instanceofNumber) {
        this.instanceofNumber = instanceofNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
    }

    public void setInterfaceNumber(int interfaceNumber) {
        this.interfaceNumber = interfaceNumber;
    }

    public void setLongNumber(int longNumber) {
        this.longNumber = longNumber;
    }

    public void setModuleNumber(int moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public void setNativeNumber(int nativeNumber) {
        this.nativeNumber = nativeNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public void setPrivateNumber(int privateNumber) {
        this.privateNumber = privateNumber;
    }

    public void setProtectedNumber(int protectedNumber) {
        this.protectedNumber = protectedNumber;
    }

    public void setPublicNumber(int publicNumber) {
        this.publicNumber = publicNumber;
    }

    public void setRequiresNumber(int requiresNumber) {
        this.requiresNumber = requiresNumber;
    }

    public void setReturnNumber(int returnNumber) {
        this.returnNumber = returnNumber;
    }

    public void setShortNumber(int shortNumber) {
        this.shortNumber = shortNumber;
    }

    public void setStaticNumber(int staticNumber) {
        this.staticNumber = staticNumber;
    }

    public void setStrictfpNumber(int strictfpNumber) {
        this.strictfpNumber = strictfpNumber;
    }

    public void setSuperNumber(int superNumber) {
        this.superNumber = superNumber;
    }

    public void setSwitchNumber(int switchNumber) {
        this.switchNumber = switchNumber;
    }

    public void setSynchronizedNumber(int synchronizedNumber) {
        this.synchronizedNumber = synchronizedNumber;
    }

    public void setThisNumber(int thisNumber) {
        this.thisNumber = thisNumber;
    }

    public void setThrowNumber(int throwNumber) {
        this.throwNumber = throwNumber;
    }

    public void setThrowsNumber(int throwsNumber) {
        this.throwsNumber = throwsNumber;
    }

    public void setTransientNumber(int transientNumber) {
        this.transientNumber = transientNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public void setVarNumber(int varNumber) {
        this.varNumber = varNumber;
    }

    public void setVoidNumber(int voidNumber) {
        this.voidNumber = voidNumber;
    }

    public void setVolatileNumber(int volatileNumber) {
        this.volatileNumber = volatileNumber;
    }

    public void setWhileNumber(int whileNumber) {
        this.whileNumber = whileNumber;
    }

    public void setTotalKeywords1(int TotalKeywords1) {
        this.TotalKeywords1 = TotalKeywords1;
    }

    public void setTotalKeywords2(int TotalKeywords2) {
        this.TotalKeywords2 = TotalKeywords2;
    }
 
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

    public int getTotalKeywords1() {
        return TotalKeywords1;
    }
    
    public int getTotalKeywords2() {
        return TotalKeywords2;
    }
  
  public void parse1()throws IOException	 	       	    	      	  	     	  	
  {
       File file = importedFile.ImportFile1();
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
    TotalKeywords1=abstractNumber+
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
      
      
      public void parse2()throws IOException	 	       	    	      	  	     	  	
  {
       File file = importedFile.ImportFile2();
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
      
      TotalKeywords2=abstractNumber+
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
