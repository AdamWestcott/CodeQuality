/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author k1746252
 */
public class Exporter {
    Measurements measures = new Measurements();
    private String filename1;
    private String filename2;
    
    public void setFilename1(String filename) {
        this.filename1 = filename;
    }
    
    public void setFilename2(String filename) {
        this.filename2 = filename;
    }
   
  public void ExportMeasures1() throws IOException	 	       	    	      	  	     	  	
  {	     
   int numberOfLines1 = measures.calculateNumberOfLines1();
   int numberOfKeywords1 = measures.calculateNumberOfKeywords1();
   int cyclomaticComplexity1 = measures.calculateCyclomaticComplexity1();
  try (FileWriter exports1 = new FileWriter("H:\\Desktop/"+filename1+".txt")) {
      exports1.write("Cyclomatic Complexity: "+cyclomaticComplexity1+ "\n");
      exports1.write("Number of Lines: "+numberOfLines1+ "\n");
      exports1.write("Number of Keywords: "+numberOfKeywords1);
      exports1.close();
     numberOfLines1 =0;
   numberOfKeywords1=0;
   cyclomaticComplexity1=0;
  }
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  
  public void ExportMeasures2() throws IOException	 	       	    	      	  	     	  	
  {	     
   int numberOfLines2 = measures.calculateNumberOfLines2();
   int numberOfKeywords2 = measures.calculateNumberOfKeywords2();
   int cyclomaticComplexity2 = measures.calculateCyclomaticComplexity2();
  try (FileWriter exports2 = new FileWriter("H:\\Desktop/"+filename2+".txt")) {
      exports2.write("Cyclomatic Complexity: "+cyclomaticComplexity2+ "\n");
      exports2.write("Number of Lines: "+numberOfLines2+ "\n");
      exports2.write("Number of Keywords: "+numberOfKeywords2);
      exports2.close();
      numberOfLines2 =0;
   numberOfKeywords2 = 0;
   cyclomaticComplexity2 = 0;
  }
  
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  }
                          
