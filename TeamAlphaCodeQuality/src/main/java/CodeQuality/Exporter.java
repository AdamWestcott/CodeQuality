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
   int numberOfLines = measures.calculateNumberOfLines1();
   int numberOfKeywords = measures.calculateNumberOfKeywords1();
   int cyclomaticComplexity = measures.calculateCyclomaticComplexity1();
  try (FileWriter exports = new FileWriter("H:\\Desktop/"+filename+".txt")) {
      exports.write("Cyclomatic Complexity: "+cyclomaticComplexity+ "\n");
      exports.write("Number of Lines: "+numberOfLines+ "\n");
      exports.write("Number of Keywords: "+numberOfKeywords);
      exports.close();
     numberOfLines =0;
   numberOfKeywords = 0;
   cyclomaticComplexity = 0;
  }
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  
  public void ExportMeasures2() throws IOException	 	       	    	      	  	     	  	
  {	     
   int numberOfLines = measures.calculateNumberOfLines2();
   int numberOfKeywords = measures.calculateNumberOfKeywords2();
   int cyclomaticComplexity = measures.calculateCyclomaticComplexity2();
  try (FileWriter exports = new FileWriter("H:\\Desktop/"+filename+".txt")) {
      exports.write("Cyclomatic Complexity: "+cyclomaticComplexity+ "\n");
      exports.write("Number of Lines: "+numberOfLines+ "\n");
      exports.write("Number of Keywords: "+numberOfKeywords);
      exports.close();
      numberOfLines =0;
   numberOfKeywords = 0;
   cyclomaticComplexity = 0;
  }
  
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  }
                          
