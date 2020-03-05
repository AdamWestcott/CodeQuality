/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.util.ArrayList;

/**
 *
 * @author k1746252
 */
public class Parser {	 	 
    
  public static String[] parseSplit(String data)	 	       	    	      	  	     	  	
  {	 	       	    	      	  	     	  	
    data = data+" ";	 	       	    	      	  	     	  	
    ArrayList<Integer> list = new ArrayList<Integer>();	 	       	    	      	  	     	  	
    ArrayList<String> list2 = new ArrayList<String>();	 	       	    	      	  	     	  	
   for (int i = data.indexOf(" "); i!= -1; i=data.indexOf(" ",i+1))	 	       	    	      	  	     	  	
   {	 	       	    	      	  	     	  	
   int a = i;
   list.add(a);	 	       	    	      	  	     	  	
   }	 	       	    	      	  	     	  	 	       	    	      	  	     	  	
    Integer [] space = new Integer[list.size()];	 	       	    	      	  	     	  	
    list.toArray(space);	 	       	    	      	  	     	  	
    int a =0;	 	       	    	      	  	     	  	
    for (int i = 0; i<space.length; i++)	 	       	    	      	  	     	  	
         {	 	       	    	      	  	     	  	
           list2.add(data.substring(a,  space[i]));	 	       	    	      	  	     	  	
           a=space[i]+1;	 	       	    	      	  	     	  	
         }	 	       	    	      	  	     	  		       	    	      	  	     	  	
     String [] pars = new String[list2.size()];	 	       	    	      	  	     	  	
    list2.toArray(pars);	 	       	    	      	  	     	  	 	       	    	      	  	     	  	
        return pars;	 	       	    	      	  	     	  	
  }
  
  
    
}
