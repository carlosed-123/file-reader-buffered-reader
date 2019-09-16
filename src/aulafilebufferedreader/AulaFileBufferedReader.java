/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulafilebufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CHRLS
 */
public class AulaFileBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:\\Users\\CHRLS\\Desktop\\FileBufferedReader\\in.txt";
        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            
            String line = buffer.readLine();
            while(line != null){
                System.out.println(line);
                line = buffer.readLine();
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
