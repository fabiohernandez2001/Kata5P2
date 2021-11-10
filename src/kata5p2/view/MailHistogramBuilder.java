
package kata5p2.view;
import java.util.List;
import kata5p2.model.Histogram;


public class MailHistogramBuilder {
    
    public Histogram <String> build(List <String> mail){
        Histogram<String> hist= new Histogram<>();
        String[] list;
        for(String i: mail){
            list=i.split("@");
            hist.increment(list[1]);
        }
        return hist;
    }
}
