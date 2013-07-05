/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hex;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author owner
 */
public class Hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
       
      ServerSocket cl = new ServerSocket(12345,100);
        System.out.println(cl);
    }
}
