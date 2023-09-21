import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversaoTempo {
    public String converterSegundosEmData(long segundos){
        Date data = new Date(segundos * 1000);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return dataFormatada.format(data);
    }
}
