
package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import java.io.IOException;
import java.util.List;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {
       public static void main(String[] args) throws IOException {
       MailListReaderBD R= new MailListReaderBD();
       MailHistogramBuilder B= new MailHistogramBuilder();
       List<String> maiList=R.read();
       Histogram <String> histogram= B.build(maiList);
       HistogramDisplay histogramDisplay= new HistogramDisplay(histogram);
       histogramDisplay.execute();
    }
}
    
