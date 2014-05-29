
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joew
 */
public class TrataID {
    public String devolveID(String inputID){
        String[] temp = inputID.split(":\"");
        String outputString = temp[1];
        outputString=outputString.replace("\"}", "");
        
        return outputString;
        
    }
    
}
