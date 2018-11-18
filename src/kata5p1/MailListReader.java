/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p1;
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 public class MailListReader {
    
    public static List<String> read(String fileName) throws FileNotFoundException, IOException{
        List<String> mailList = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String mail;
        
        while((mail = reader.readLine()) != null){
            if(mail.contains("@")){
                mailList.add(new String(mail));
            }
        }
        
        reader.close();
        return mailList;
    }
    
}