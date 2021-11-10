package kata5p2.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.List;
import kata5p2.model.Mail;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class MailListReader {
    
    
    public List<Mail> read(String filename) throws FileNotFoundException, IOException{
        LinkedList<Mail> MailList = new LinkedList<>();
        String cadena;
        FileReader f = new FileReader(filename);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            if(cadena.contains("@")){
                Mail mail = new Mail(cadena);
                MailList.add(mail);
            }
        }
        return MailList;
    }
}
