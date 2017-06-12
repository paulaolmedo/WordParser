/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      parseInputText();
    
    }
    public static void parseInputText(){
        System.out.println("Insert text to parse: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Parser parse = new Parser();
        String output = parse.parse(input);
        
        System.out.println("Parsed text: " + output);
    }
   
    
}
