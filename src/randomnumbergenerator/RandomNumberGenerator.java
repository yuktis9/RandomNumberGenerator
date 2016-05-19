/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;

import java.util.Random;

/**
 *
 * @author yuktisarwadia
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random num = new Random();
        int generatedNumber = num.nextInt(20);
        System.out.println("Random Generated Number is: "+generatedNumber);
        
    }
    
}
