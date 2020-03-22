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
  
  public void ExportMeasures1() throws IOException	 	       	    	      	  	     	  	
  {	     
   int numberOfLines = measures.calculateNumberOfLines();
   int numberOfKeywords = measures.calculateNumberOfKeywords();
   int cyclomaticComplexity = measures.calculateCyclomaticComplexity();
  try (FileWriter exports = new FileWriter("H:\\Desktop/ExportedResults1.txt")) {
      exports.write("Cyclomatic Complexity: "+cyclomaticComplexity+ "\n");
      exports.write("Number of Lines: "+numberOfLines+ "\n");
      exports.write("Number of Keywords: "+numberOfKeywords);
      exports.close();
  }
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  }
                          
