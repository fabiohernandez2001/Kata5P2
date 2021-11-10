
package kata5p2.view;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;


public class MailHistogramBuilder {
    
    public Histogram <String> build(List <Mail> mail){
        Histogram<String> hist= new Histogram<>();
        String[] list;
        for(Mail i: mail){
            list=i.getDomain().split("@");
            hist.increment(list[1]);
        }
        return hist;
    }
}
