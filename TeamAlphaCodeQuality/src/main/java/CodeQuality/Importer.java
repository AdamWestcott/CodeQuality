/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeQuality;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author k1746252
 */
public class Importer {
    public static void main(String[] args) throws FileNotFoundException{
    File file = new File ("H:\\Desktop/captmidn.txt");
    Scanner importer = new Scanner(file);
    System.out.println(importer.nextLine());
}
    
}
