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
    private String filename;

    public void setFilename(String filename) {
        this.filename = filename;
    }
   
  public void ExportMeasures1() throws IOException	 	       	    	      	  	     	  	
  {	     
   int numberOfLines1 = measures.calculateNumberOfLines1();
   int numberOfKeywords1 = measures.calculateNumberOfKeywords1();
   int cyclomaticComplexity1 = measures.calculateCyclomaticComplexity1();
  try (FileWriter exports = new FileWriter("H:\\Desktop/"+filename+".txt")) {
      exports.write("Cyclomatic Complexity: "+cyclomaticComplexity1+ "\n");
      exports.write("Number of Lines: "+numberOfLines1+ "\n");
      exports.write("Number of Keywords: "+numberOfKeywords1);
      exports.close();
     numberOfLines1 =0;
   numberOfKeywords1 = 0;
   cyclomaticComplexity1 = 0;
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
  try (FileWriter exports = new FileWriter("H:\\Desktop/"+filename+".txt")) {
      exports.write("Cyclomatic Complexity: "+cyclomaticComplexity2+ "\n");
      exports.write("Number of Lines: "+numberOfLines2+ "\n");
      exports.write("Number of Keywords: "+numberOfKeywords2);
      exports.close();
      numberOfLines2 =0;
   numberOfKeywords2 = 0;
   cyclomaticComplexity2 = 0;
  }
  
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  }
                          
