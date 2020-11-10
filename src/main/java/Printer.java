import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int paperCount(){
        return paper;
    }

    public int toner(){
        return toner;
    }

    public int usePaper(int paperNeeded){
        return this.paper = this.paper - paperNeeded;
    }

    public int useToner(int tonerNeeded){
        return this.toner = this.toner - tonerNeeded;
    }

}
