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
  
  public void ExportMeasures() throws IOException	 	       	    	      	  	     	  	
  {	     
  try (FileWriter exports = new FileWriter("H:\\Desktop")) {
      exports.write("egypt");
      exports.close();
  }
  catch(FileNotFoundException e){
          throw e;
      }
  
  }
  }
 
