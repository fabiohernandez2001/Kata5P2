
package kata5p2.main;

import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import java.io.IOException;
import java.util.List;
import kata5p2.view.MailListReader;

public class Kata5P2 {
       public static void main(String[] args) throws IOException {
       MailListReader R= new MailListReader();
       String filename = "/Users/Entrar/Documents/NetBeansProjects/Kata5P2/email.txt";
       MailHistogramBuilder B= new MailHistogramBuilder();
       List<Mail> maiList=R.read(filename);
       Histogram <String> histogram= B.build(maiList);
       HistogramDisplay histogramDisplay= new HistogramDisplay(histogram);
       histogramDisplay.execute();
    }
}
    
